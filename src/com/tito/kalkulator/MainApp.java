package com.tito.kalkulator;

import java.util.Scanner;

/**
 * Kelas MainApp berfungsi sebagai titik masuk program Kalkulator.
 * Program ini memungkinkan pengguna melakukan operasi aritmatika sederhana
 * melalui input dari keyboard.
 *
 * @author Tito
 * @version 1.0
 */
public class MainApp {

    /**
     * Metode utama untuk menjalankan aplikasi Kalkulator.
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner input = new Scanner(System.in);

        System.out.println("=== Aplikasi Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Pilih operasi: +, -, *, /");
        String operasi = input.next();

        try {
            double hasil = switch (operasi) {
                case "+" -> kalkulator.tambah(a, b);
                case "-" -> kalkulator.kurang(a, b);
                case "*" -> kalkulator.kali(a, b);
                case "/" -> kalkulator.bagi(a, b);
                default -> throw new IllegalArgumentException("Operasi tidak dikenal!");
            };

            System.out.println("Hasil: " + hasil);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        input.close();
    }
}
