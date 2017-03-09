package com.sdajava.Sortowanie;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] matrix = {4, 7, 8, 3, 5, 4, 90, 4, 1, 0, -9 ,8};
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length - 1; j++) {
                    if (matrix[j] < matrix[j + 1]) {
                        int temp;
                        temp = matrix[j + 1];
                        matrix[j + 1] = matrix[j];
                        matrix[j] = temp;
                    }
                }
            }
        System.out.println(Arrays.toString(matrix));

    }
}
