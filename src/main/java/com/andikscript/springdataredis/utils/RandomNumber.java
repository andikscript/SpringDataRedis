package com.andikscript.springdataredis.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumber {

    public String randomNumber() {
        String chars = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < 16; i++)
                sb.append(chars.charAt(rnd.nextInt(chars.length())));
        sb.insert(4, "-");
        sb.insert(9, "-");
        sb.insert(14, "-");
        return sb.toString();
    }
}
