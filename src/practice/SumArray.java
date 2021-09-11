package practice;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How may numbers you want to be in array: ");

        int l=input.nextInt();    //length variable.

        int[] arr = new int[l];  //Array.

        for(int i=0; i<l; i++){
            System.out.println("Enter the number: "+(i+1));
            arr[i] = input.nextInt();     // Array input.
        }

        int sum=0;

        for(int i=0; i<l; i++){
            sum=sum+arr[i];
        }

        System.out.println("Summation of all the elements in the array is: "+sum);
    }
}
