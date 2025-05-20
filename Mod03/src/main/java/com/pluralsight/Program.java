package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
            new Person("Ava",      "Thompson", 29),
            new Person("Liam",     "Garcia",   42),
            new Person("Noah",     "Martinez", 35),
            new Person("Emma",     "Rodriguez",27),
            new Person("Olivia",   "Lee",      31),
            new Person("Mason",    "Walker",   24),
            new Person("Isabella", "Hall",     38),
            new Person("Ava",    "Young",    19),
            new Person("Mia",      "Hernandez",46),
            new Person("Ethan",    "King",     33)
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search: ");
        String term = scanner.nextLine().trim().toLowerCase();

        List<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(term) ||
                p.getLastName().equalsIgnoreCase(term)) {
                matches.add(p);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("\nMatches:");
            for (Person p : matches) System.out.println(" • " + p);
        }

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
