package com.alex;

public class Main {

    public static void main(String[] args) {


        int position = calulateHighScorePosition(11000);
        displayHighScorePosition("Ivan", position);




    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the highscore table");
    }

    public static int calulateHighScorePosition(int score) {
        if (score >=1000){ return 1;}
        else if ((score>=500)&&(score<1000)) {return 2;}
        else if ((score>=100)&&(score<500)) {return 3;}
        else {return 4;}

    }
}
