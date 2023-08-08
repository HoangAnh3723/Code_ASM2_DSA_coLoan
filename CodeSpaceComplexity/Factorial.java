/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeSpaceComplexity;

/**
 *
 * @author Admin
 */
public class Factorial {
    public static long calculateFactorial(int number) {
        int i;
        long factorial = 1L;
        for (i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
