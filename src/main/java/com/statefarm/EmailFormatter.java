package com.statefarm;

public class EmailFormatter {
    public static void main(String[] args) {
     if (args.length < 1) {
         System.out.println("Please specify a name and email.");
     } else if (args.length == 1) {
         System.out.println(String.format("Please provide an email for %s", args[0]));
     } else {
         System.out.println(String.format("%s <%s>", args[0], args[1]));;
     }
    }
}
