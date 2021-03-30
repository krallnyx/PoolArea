package com.Krall;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parameter = "Width";
        int width = 0;
        int length = 0;
        int height = 0;

        while (true) {
            System.out.println("Enter a number for the " + parameter + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                if (parameter.equals("Width")) {
                    width = scanner.nextInt();
                    parameter = "Length";
                } else if (parameter.equals("Length")) {
                    length = scanner.nextInt();
                    parameter = "Height";
                } else if (parameter.equals("Height")) {
                    height = scanner.nextInt();
                    break;
                }
            }
            scanner.nextLine();
        }
        scanner.close();
        Cuboid cuboid = new Cuboid(width, length, height);

        System.out.println("the volume of this pool is " + cuboid.getVolume());
    }
}







