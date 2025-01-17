// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
// I/P => NONE
// O/P => Harry's age in 2024 is ___

import java.util.*;
public class Question1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int HarryBirthYear = 2000;
        int CurrentYear = 2024;
        int HarryAge = CurrentYear - HarryBirthYear;
        System.out.println("Harry's age in 2024 is " + HarryAge);
    }
}

