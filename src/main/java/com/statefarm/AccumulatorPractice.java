package com.statefarm;

public class AccumulatorPractice {

    public String toSentence(String[] inputStringArray) {
        if (inputStringArray.length == 0 || inputStringArray[0].equals("")) return "";
        String returnString = "";
        int numberOfStrings = inputStringArray.length;
        if (inputStringArray.length == 2) {
            return returnString = inputStringArray[0] + " and " + inputStringArray[1];
        } else {
            for (int i = 0; i < inputStringArray.length; i++) {
                numberOfStrings -= 1;
//                System.out.println(numberOfStrings);
                if (numberOfStrings > 1) {
                    returnString += inputStringArray[i] += ", ";
                } else if (numberOfStrings == 1) {
                    returnString += inputStringArray[i];
                } else {
                    returnString += " and " + inputStringArray[i];
                }
            }
            return returnString;
        }
    }
}
