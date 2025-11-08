package com.tito.kalkulator;

/**
 * Kelas Kalkulator digunakan untuk melakukan operasi aritmatika sederhana
 * seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 *
 * <p>Setiap metode menerima dua bilangan dan mengembalikan hasil perhitungan.</p>
 *
 * @author Tito
 * @version 1.0
 */
public class Kalkulator {

    /**
     * Menjumlahkan dua bilangan bulat.
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil penjumlahan a dan b
     */
    public int tambah(int a, int b) {
        return a + b;
    }

    /**
     * Mengurangkan dua bilangan bulat.
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil pengurangan a dengan b
     */
    public int kurang(int a, int b) {
        return a - b;
    }

    /**
     * Mengalikan dua bilangan bulat.
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil perkalian a dan b
     */
    public int kali(int a, int b) {
        return a * b;
    }

    /**
     * Membagi dua bilangan bulat.
     * @param a bilangan pembilang
     * @param b bilangan penyebut
     * @return hasil pembagian a oleh b
     * @throws ArithmeticException jika b adalah 0
     */
    public double bagi(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol!");
        }
        return (double) a / b;
    }
}
