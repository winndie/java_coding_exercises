package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1,word.length());
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        return Double.parseDouble(String.format("%.2f",originalPrice * ((100 + vatRate)/100)));
    }

    public String reverse(String sentence) {

        String ansStr="";

        for(int i = (sentence.length()-1) ; i >= 0; i--)
            ansStr += sentence.charAt(i);

        return ansStr;
    }

    public int countLinuxUsers(List<User> users) {

        int counter = 0;

        for (User user:users){
            if (user.getType().equals("Linux"))
                counter++;
        }

        return counter;
    }
}
