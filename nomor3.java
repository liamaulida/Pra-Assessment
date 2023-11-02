import java.util.Scanner;

public class nomor3 {

        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jenis kelamin : ");
        String jenisKelamin = input.nextLine();

        System.out.print("Masukkan berat badan : ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan : ");
        double tinggiBadan = input.nextDouble();

        double tbCentimeter = tinggiBadan / 100;
        double bmi = (beratBadan / (tbCentimeter * tbCentimeter));

        System.out.printf("%.2f", bmi);
        golongan(jenisKelamin, bmi);
    }

    public static void golongan(String jenisKelamin, double bmi) {
        switch (jenisKelamin) {
            case "Pria":
                if (bmi < 20.50) {
                    System.out.println(", Kurus");
                }
                else if (bmi >= 20.50 && bmi <= 26.99) {
                    System.out.println(", Ideal");
                } 
                else if (bmi >= 27.00) {
                    System.out.println(", Gemuk");
                }
                else {
                    System.out.println("Maaf Inputan Salah");
                }
            break;
            
            case "Wanita":
                if (bmi < 18.50) {
                    System.out.println(", Kurus");
                } 
                else if (bmi >= 18.50 && bmi <= 24.99) {
                    System.out.println(", Ideal");
                } 
                else if (bmi >= 25.00) {
                    System.out.println(", Gemuk");
                }
                else {
                    System.out.println("Maaf Inputan Salah.");
                }
            break;
        }
    }
}
