package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for(int i = 0; i < size; i ++) {
          for(int j = 0; j < size;j++) {
            grid[i][j] = " ";
          }
        }
        for (int i = 0; i < size; i ++ ) {
          grid[(int)size/2][i] = "*";
          grid[i][(int)size/2] = "*";
          grid[i][i] = "*";
          grid[i][size - 1 - i] = "*";
        }
    

        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      for(int i = 0; i < snowflake.length; i ++) {
        for(int j = 0; j < snowflake.length;j++) {
          System.out.print(snowflake[i][j]);
        }
        System.out.println();
      }

    }

    // Test for the snowflake generation
    public static void main(String[] args) {
    }
}
