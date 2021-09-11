package practice;

import java.util.Scanner;

public class InputClass {

    public static void main(String[] args) {

        //Taking input using Scanner class.

        System.out.println("Enter a Number: ");

        Scanner x = new Scanner(System.in);    //Using Scanner Class.

        System.out.println("Entered Number is: "+x.nextLine());
    }
}
