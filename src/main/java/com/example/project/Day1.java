package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name == null || name == "") {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        int randomIdx = (int)(Math.random() * (elf_names.length - 1) + 0);
        return elf_names[randomIdx] + " " + name;  
    }
}