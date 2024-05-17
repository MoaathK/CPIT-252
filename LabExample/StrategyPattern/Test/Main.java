package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] listOfNames = new String[3];
        for(int i = 0; i < 3; i++) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            listOfNames[i] = name;

        }
        System.out.println("This is all the names: ");
        for(int i = 0; i < listOfNames.length; i++) {
            System.out.println(listOfNames[i]);
        }
    }
}
