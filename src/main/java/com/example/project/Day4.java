package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int timeSpent;
        private static int longestDistance;



        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }

        public String getName(){ // added method to make tests run
            return name;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            timeSpent++;
            if (timeSpent <= runDuration) {
                distanceTraveled += speed;
            }
            if (timeSpent >= (runDuration + restDuration)) {
                timeSpent = 0;
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        String winner = null;
        for (int i = 0; i <= time; i ++) {
            for (int j = 0; j < reindeers.length; j ++) {
                reindeers[j].simulateSecond();
            }

        }
        for (int i = 0; i < reindeers.length; i ++) {
            if (reindeers[i].getDistanceTraveled() > Reindeer.longestDistance) {
                Reindeer.longestDistance = reindeers[i].getDistanceTraveled();
                winner = reindeers[i].getName();
            }
        }
        Reindeer.longestDistance = 0;
        return winner;
    }

    
    public static void main(String[] args) { // for testing purposed
        Reindeer[] reindeers = {
            new Reindeer("Dasher", 100, 5, 2),
            new Reindeer("Dancer", 120, 4, 3),
            new Reindeer("Prancer", 70, 6, 1)
        };
    }

 
}



