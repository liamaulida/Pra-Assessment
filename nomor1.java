import java.util.Scanner;

public class nomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int digitSatu = input.nextInt();  
        int digitDua = input.nextInt();
        int digitTiga = input.nextInt();

        int hasilEnkripsi1 = hasilEnkripsi(digitSatu);
        int hasilEnkripsi2 = hasilEnkripsi(digitDua);
        int hasilEnkripsi3 = hasilEnkripsi(digitTiga);

        System.out.printf("%04d%n", hasilEnkripsi1);
        System.out.printf("%04d%n", hasilEnkripsi2);
        System.out.printf("%04d%n", hasilEnkripsi3);
    }

    public static int hasilEnkripsi(int angka) {

        int ribuan = (angka / 1000) % 10;
        int ratusan = (angka / 100) % 10;
        int puluhan = (angka / 10) % 10;
        int satuan = angka % 10;
 
        ribuan = (ribuan + 5) % 10;
        ratusan = (ratusan + 5) % 10;
        puluhan = (puluhan + 5) % 10; 
        satuan = (satuan + 5) % 10;

        int inputannomor = (ribuan * 1000) + (satuan * 100) + (puluhan * 10) + ratusan;

        return inputannomor;
    }
}

