/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeTimeComplexity;

/**
 *
 * @author Admin
 */
public class CubicTime {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printTriplets(numbers);
    }

    public static void printTriplets(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    System.out.println(numbers[i] + ", " + numbers[j] + ", " + numbers[k]);
                }
            }
        }
    }
}
