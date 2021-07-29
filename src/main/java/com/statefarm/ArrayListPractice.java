package com.statefarm;

import java.util.ArrayList;

public class ArrayListPractice {
    public ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> sortedArrays = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            sortedArrays.add(inputArray[i]);
        }
        sortedArrays.sort(null);
        return sortedArrays;
    }
}
