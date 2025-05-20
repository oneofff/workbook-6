package com.pluralsight;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        List<Person> people = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            people.add(new Person("Ava", "Thompson", 29));
            people.add(new Person("Liam", "Garcia", 42));
            people.add(new Person("Noah", "Martinez", 35));
            people.add(new Person("Emma", "Rodriguez", 27));
            people.add(new Person("Olivia", "Lee", 31));
            people.add(new Person("Mason", "Walker", 24));
            people.add(new Person("Isabella", "Hall", 38));
            people.add(new Person("Ava", "Young", 19));
            people.add(new Person("Mia", "Hernandez", 46));
            people.add(new Person("Ethan", "King", 33));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search: ");
        String term = scanner.nextLine().trim().toLowerCase();
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
        long startTime2 = System.currentTimeMillis();
        List<Person> collect = matches.parallelStream().filter(p -> p.getFirstName().equalsIgnoreCase(term) ||
                        p.getLastName().equalsIgnoreCase(term))
                .toList();
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime2 - startTime2) + "ms");


        Person oldest = people.stream()
                .reduce((person, person2) -> person.getAge() > person2.getAge() ? person : person2)
                .orElseThrow();
        Person youngest = people.stream().min(Comparator.comparingInt(Person::getAge))
                .orElseThrow(NoSuchElementException::new);

        double avg = people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElseThrow();
        System.out.printf("%nAverage age: %.1f%n", avg);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);
    }
}
