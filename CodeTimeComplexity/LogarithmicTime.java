/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeTimeComplexity;

/**
 *
 * @author Admin
 */
public class LogarithmicTime {
    public static void main(String[] args) {
        int n = 16;
        int result = logarithmicFunction(n);
        System.out.println("Result: " + result);
    }

    public static int logarithmicFunction(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be positive");
        }

        int count = 0;
        while (n > 1) {
            n = n / 2;
            count++;
        }

        return count;
    }
}
