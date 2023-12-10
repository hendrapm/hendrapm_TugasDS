package com.javatraining;

public class Operation {

    public int add(int valueX, int valueY) {
        int result = valueX + valueY;
        System.out.printf("Hasil dari %d + %d adalah %d", valueX, valueY, result);
        return result;
    }

    public int sub(int valueX, int valueY) {
        int result = valueX - valueY;
        System.out.printf("Hasil dari %d - %d adalah %d", valueX, valueY, result);
        return result;
    }

    public int multiply(int valueX, int valueY) {
        int result = valueX * valueY;
        System.out.printf("Hasil dari %d * %d adalah %d", valueX, valueY, result);
        return result;
    }

    public int div(int valueX, int valueY) {
        int result = valueX / valueY;
        System.out.printf("Hasil dari %d / %d adalah %d", valueX, valueY, result);
        return result;
    }
}
