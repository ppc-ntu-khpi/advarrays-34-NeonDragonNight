package src;

import java.util.Arrays;

import java.util.Scanner;

import src.calc;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть кількість рядків (N): ");
        int N = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (M): ");
        int M = scanner.nextInt();

        System.out.println("Було:");
        
        int [][] matrix = new int[N][M];
        int x=0;

        for(int[] row:matrix){
            Arrays.fill(row,x);
            x++;}

        for(int[] row:matrix)
            System.out.println(Arrays.toString(row));

        System.out.println("Стало:");

        for(int[] row:calc.transpose(matrix))
        System.out.println(Arrays.toString(row));
    }
}
