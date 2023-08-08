/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeTimeComplexity;

/**
 *
 * @author Admin
 */
public class LinearTime {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Target found!");
        } else {
            System.out.println("Target not found!");
        }
    }
}
