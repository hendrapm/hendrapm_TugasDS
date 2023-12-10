package com.javatraining;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // instantiate class
        Operation operation = new Operation();
        int valueX, valueY, operator;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Input Nilai X     : ");
        valueX = inputUser.nextInt();
        System.out.print("Input Nilai Y     : ");
        valueY = inputUser.nextInt();

        System.out.print("Operator:\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Modulus\nPilih Operator    : ");
        operator = inputUser.nextInt();
        switch (operator) {
            case 1:
                operation.add(valueX, valueY);
                break;
            case 2:
                operation.sub(valueX, valueY);
                break;
            case 3:
                operation.multiply(valueX, valueY);
                break;
            case 4:
                operation.div(valueX, valueY);
                break;
            case 5:
                operation.mod(valueX, valueY);
                break;
        
            default:
                System.out.println("Operator tidak tersedia");
        }
        inputUser.close();
    }
}
