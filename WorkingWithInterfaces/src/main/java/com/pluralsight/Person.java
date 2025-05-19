package com.pluralsight;

import lombok.Data;

@Data
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int lastNameComparison = this.lastName.compareTo(o.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        int firstNameComparison = this.firstName.compareTo(o.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return Integer.compare(this.age, o.age);
    }
}
