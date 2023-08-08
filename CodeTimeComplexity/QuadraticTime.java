/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeTimeComplexity;

/**
 *
 * @author Admin
 */
public class QuadraticTime {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printPairs(numbers);
    }

    public static void printPairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[i] + ", " + numbers[j]);
            }
        }
    }
}
