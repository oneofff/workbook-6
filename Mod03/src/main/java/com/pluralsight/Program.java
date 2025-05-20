package com.pluralsight;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Person> people = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
                people.add(new Person("Ava",      "Thompson", 29));
                people.add(new Person("Liam",     "Garcia",   42));
                people.add(new Person("Noah",     "Martinez", 35));
                people.add(new Person("Emma",     "Rodriguez",27));
                people.add(new Person("Olivia",   "Lee",      31));
                people.add(new Person("Mason",    "Walker",   24));
                people.add(new Person("Isabella", "Hall",     38));
                people.add(new Person("Ava",    "Young",    19));
                people.add(new Person("Mia",      "Hernandez",46));
                people.add(new Person("Ethan",    "King",     33));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search: ");
        String term = scanner.nextLine().trim().toLowerCase();
        //measure time difference
        long startTime = System.currentTimeMillis();
        List<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(term) ||
                p.getLastName().equalsIgnoreCase(term)) {
                matches.add(p);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        //measure time difference
        //parallel stream
        long startTime2 = System.currentTimeMillis();
        List<Person> collect = matches.parallelStream().filter(p -> p.getFirstName().equalsIgnoreCase(term) ||
                        p.getLastName().equalsIgnoreCase(term))
                .toList();
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime2 - startTime2) + "ms");
//        if (matches.isEmpty()) {
//            System.out.println("No matches found.");
//        } else {
//            System.out.println("\nMatches:");
//            for (Person p : matches) System.out.println(" • " + p);
//        }

        int totalAge = 0, oldest = Integer.MIN_VALUE, youngest = Integer.MAX_VALUE;
        for (Person p : people) {
            int a = p.getAge();
            totalAge += a;
            if (a > oldest) oldest = a;
            if (a < youngest) youngest = a;
        }

        double avg = (double) totalAge / people.size();
        System.out.printf("%nAverage age: %.1f%n", avg);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}
