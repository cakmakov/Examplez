package org.examplez;

import java.util.Scanner;

public class Main {
    static void recursiveByInput(int input, int maxLimit, boolean isDirectionDownward){
        if (input == 0 || input < 0 || !isDirectionDownward) {
            if (input != maxLimit){
                input = input + 5;
                System.out.print(input + " ");
                recursiveByInput(input, maxLimit ,false);
            }
        } else {
            input = input - 5;
            System.out.print(input + " ");
            recursiveByInput(input, maxLimit ,true);
        }
    }
    public static void main(String[] args){
        System.out.print("N Sayısı : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.print("Çıktısı : " + input + " ");
        recursiveByInput(input, input,true);
    }
}