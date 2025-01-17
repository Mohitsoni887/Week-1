// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
// I/P => NONE
// O/P => Sam’s average mark in PCM is ___

import java.util.*;
public class Question2{
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int Chemistry = 96;
        int sum = maths + physics + Chemistry;
        float averagePercentMark = sum/3;
        System.out.println("Sam’s average mark in PCM is " + averagePercentMark + "%");
    }
}