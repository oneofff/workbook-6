package com.pluralsight;

import com.pluralsight.model.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        System.out.println(numbers.add(43)); // this line should fail
        numbers.stream().forEach(System.out::println);
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//        dates.add(15); // this line should fail
    }
}