package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number");
        System.out.print("inputNumber=");
        int inputNumber = scanner.nextInt();
        switch ((inputNumber + 45) / 45) {
            case 1: {
                System.out.println("dhis number is 0 - 44");
                break;
            }
            case 2: {
                System.out.println("dhis number is 45 - 89");
                break;
            }
            case 3: {
                System.out.println("dhis number is 90 - 134");
                break;
            }
            default : {
                System.out.println("this inputNumber is not range 0 - 134");
            }
        }
    }
}
