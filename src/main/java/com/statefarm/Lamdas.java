package com.statefarm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamdas {

    public void someLamdaPractice() {
        List<String> fileNames = new ArrayList<>();
        fileNames.add("My Report.csv");
        fileNames.add("The Best Deck.pdf");
        fileNames.forEach((String files) -> {
            System.out.println(files.replace(" ", "-"));
        });
    }
}
