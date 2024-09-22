package org.examplez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int distance = scanner.nextInt();
        if (distance > 0) {
            double normalPrice = distance * 0.1;

            System.out.print("Yaşınızı giriniz : ");
            int age = scanner.nextInt();
            if (age > 0) {
                double discountRatio = 0;
                if (age < 12) {
                    discountRatio = 0.5;
                } else if (age <= 24) {
                    discountRatio = 0.1;
                } else if (age > 65) {
                    discountRatio = 0.3;
                }

                double ageDiscount = normalPrice * discountRatio;
                double discountedPrice = normalPrice - ageDiscount;

                System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
                int travelType = scanner.nextInt();
                if (travelType == 1 || travelType == 2) {
                    double roundTripDiscount = 0;
                    if (travelType == 2) {
                        roundTripDiscount = discountedPrice * 0.2;
                    }

                    double totalPrice = (discountedPrice - roundTripDiscount) * travelType;

                    System.out.print("Toplam Tutar = " + totalPrice);
                } else {
                    System.out.print("Hatalı Veri Girdiniz !");
                }
            } else {
                System.out.print("Hatalı Veri Girdiniz !");
            }
        } else {
            System.out.print("Hatalı Veri Girdiniz !");
        }
    }
}