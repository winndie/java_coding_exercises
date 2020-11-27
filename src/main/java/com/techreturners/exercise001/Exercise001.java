package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1,word.length());
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return Double.parseDouble(String.format("%.2f",originalPrice * ((100 + vatRate)/100)));
    }

    public String reverse(String sentence) {
        // Add your code here
        String ansStr="";

        for(int i = (sentence.length()-1) ; i >= 0; i--)
            ansStr += sentence.charAt(i);

        return ansStr;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        final String TYPE_LINUX = "Linux";
        int ansInt = 0;

        for (int i = 0; i < users.size(); i++){

            if (users.get(i).getType() == TYPE_LINUX)
                ansInt++;

        }

        return ansInt;
    }
}
