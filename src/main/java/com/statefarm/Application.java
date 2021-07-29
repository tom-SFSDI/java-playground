package com.statefarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println("hello world");

        List<String> fileNames = new ArrayList<>();
        fileNames.add("My Report.csv");
        fileNames.add("The Best Deck.pdf");
        fileNames.forEach((String files) -> {
            System.out.println(files.replace(" ", "-"));

        });

        String[] strings = {"Alice", "Bob", "Carol", "Joseph"};
        AccumulatorPractice tom = new AccumulatorPractice();
        System.out.println(tom.toSentence(strings));
    }
}

