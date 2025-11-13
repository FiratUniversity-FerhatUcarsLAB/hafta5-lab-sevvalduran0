/*
 * Ad Soyad: [ŞEVVAL DURAN]
 * Ogrenci No: [240541088]
 * Tarih: [13.11.25]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {
    
    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar
        return side * side;
    }

    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        // Cevre = 4 * kenar
        return 4 * side;
    }

    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik
        return width * height;
    }

    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)
        return 2 * (width + height);
    }

    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        return Math.PI * radius * radius;
    }

    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r
        return 2 * Math.PI * radius;
    }

    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2
        return (base * height) / 2;
    }

    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();

        // KARE bilgileri
        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();

        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();

        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();

        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);

        double rectArea = calculateRectangleArea(rectWidth, rectHeight);
        double rectPerimeter = calculateRectanglePerimeter(rectWidth, rectHeight);

        double circleArea = calculateCircleArea(radius);
        double circleCircumference = calculateCircleCircumference(radius);

        double triangleArea = calculateTriangleArea(base, height);
        double trianglePerimeter = calculateTrianglePerimeter(side1, side2, side3);

        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println(" HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        System.out.printf("Alan: %.2f cm²\n", squareArea);
        System.out.printf("Cevre: %.2f cm\n", squarePerimeter);

        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.printf("Alan: %.2f cm²\n", rectArea);
        System.out.printf("Cevre: %.2f cm\n", rectPerimeter);

        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        System.out.printf("Alan: %.2f cm²\n", circleArea);
        System.out.printf("Cevre: %.2f cm\n", circleCircumference);

        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        System.out.printf("Alan: %.2f cm²\n", triangleArea);
        System.out.printf("Cevre: %.2f cm\n", trianglePerimeter);

        System.out.println("========================================");

        input.close();
    }
}
