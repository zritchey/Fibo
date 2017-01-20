package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will check if a number belongs in the fibonacci sequence");
        System.out.println("Enter the word \"exit\" to ");
        while (1 == 1) {
            System.out.print("\n\nPlease Enter a number to test: ");
            String s = sc.next();
            int i = 0;
            if (numcheck(s))
                i = Integer.parseInt(s);

            while (!numcheck(s) || i < 0) {
                if (s.equalsIgnoreCase("exit"))
                    break;
                System.out.println("That isn't a valid value. Try again");
                s = sc.next();
                if (numcheck(s))
                    i = Integer.parseInt(s);
            }
            if (s.equalsIgnoreCase("exit"))
                break;
            if (fibFind(i))
                System.out.println(i + " is a number in the Fibonacci sequence.");
            else
                System.out.println(i + " is not a number in the Fibonacci sequence.");
        }
    }
    public static boolean numcheck(String s) {
        boolean num = true;
        for (int i = 0; i < s.length(); i++) {
            num = num && s.charAt(i) > 47;
            num = num && s.charAt(i) < 58;
        }
        return num;
    }
    public static boolean fibFind(int c) {
        return fibFind(0, 1, c, false);
    }
    public static boolean fibFind(int first, int second, int check, boolean b) {
        if (check >= second) {
            b = check == second || fibFind(second, first + second, check, b);
        }
        return b;
    }
}