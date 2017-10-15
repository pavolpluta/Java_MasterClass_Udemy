package com.pavolpluta;

public class Main {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//        highScore = calculateScore(false, 10000, 8, 200); //we can use one of these
//        System.out.println("Your final score was " + highScore);

        int score = calculateHighScorePosition(1500);
         displayHighScore("Ja",score);
         score = calculateHighScorePosition(900);
         displayHighScore("Ty", score);
         score = calculateHighScorePosition(50);
         displayHighScore("On", score);
         score = calculateHighScorePosition(400);
         displayHighScore("Ona", score);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);

            return finalScore;
        }
        return 0;
    }

    public static void displayHighScore(String name,int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if (score > 1000){
            return 1;
        }else if (score > 500 && score < 1000){
            return 2;
        }else if (score > 100 && score < 500){
            return 3;
        }
        return 4;

    }




}
