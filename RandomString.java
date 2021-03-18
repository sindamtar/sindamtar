package com.ngtrend.lcmprov;
import java.util.Random;


public class RandomString {

   
    public static String generatePwd() {
    	int length=11;
        final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        while(length > 0) {
            Random rand = new Random();
            result.append(characters.charAt(rand.nextInt(characters.length())));
            length--;
        }
        return result.toString();
     }


}