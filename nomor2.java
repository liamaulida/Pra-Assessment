import java.util.Scanner;

public class nomor2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int hasilTambah = A + B;

        int ratusan = hasilTambah / 100;
        int puluhan = (hasilTambah % 100) / 10;
        int satuan = (hasilTambah % 100) % 10;

        if (ratusan != 0) {
            if (ratusan == 1) {
                System.out.print("Seratus ");
            } else {
                System.out.print(hasilBilangan(ratusan) + " ratus ");
            }
        }

        if (puluhan != 0) {
            if (puluhan == 1) {
                if (satuan == 0) {
                    System.out.println("sepuluh");
                    return;
                } else if (satuan == 1) {
                    System.out.print("sebelas");
                    return;
                }
                System.out.print(hasilBilangan(satuan) + " belas ");
                return;
            }
            else  {
                System.out.print(hasilBilanganPuluhan(puluhan) + " ");
            }
        }
        if (satuan != 0) {
            System.out.print(hasilBilangan(satuan));
        }
        System.out.println();
    }

    public static String hasilBilangan(int angka) {
        switch (angka) {
            case 0:
                return "nol";
            case 1:
                return "satu";
            case 2:
                return "dua";
            case 3:
                return "tiga";
            case 4:
                return "empat";
            case 5:
                return "lima";
            case 6:
                return "enam";
            case 7:
                return "tujuh";
            case 8:
                return "delapan";
            case 9:
                return "sembilan";
            default:
                return " ";
        }
    }

    public static String hasilBilanganPuluhan(int angka) {
        switch (angka) {
            case 2:
                return "dua puluh";
            case 3:
                return "tiga puluh";
            case 4:
                return "empat puluh";
            case 5:
                return "lima puluh";
            case 6:
                return "enam puluh";
            case 7:
                return "tujuh puluh";
            case 8:
                return "delapan puluh";
            case 9:
                return "sembilan puluh";
            default:
                return " ";
        }
    }
}   
