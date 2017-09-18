/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 7 Chapter 7
* Computer Configuration
* Due Date: 09/16/17*/
import java.util.Scanner;
public class CountOccurrenceofNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the integers between 1 and 100: ");
        Scanner input = new Scanner(System.in);
        int[] freq = new int[101];
        while (input.hasNextInt()) {
            int num = input.nextInt();
            if (num == 0)
            {
                break;
            }
            if (num > 100 || num < 0) {
                System.out.println("You are out of boundaries!");
                continue;
            }
            freq[num]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " time" + (freq[i] > 1 ? "s" : ""));
            }
        }
    }
}