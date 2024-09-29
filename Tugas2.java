import java.util.Scanner;

public class Tugas2 {

       // Method untuk menghitung luas dan keliling persegi
        public static void persegi(double sisi) {
            double luas = sisi * sisi;
            double keliling = 4 * sisi;
            System.out.println("Luas persegi: " + luas);
            System.out.println("Keliling persegi: " + keliling);
        }

        // method untuk menghitung luas dan keliling persegi panjang
        public static void persegiPanjang(double panjang, double lebar) {
            double luas = panjang * lebar;
            double keliling = 2 * (panjang * lebar);
            System.out.println("Luas persegi panjang: " + luas);
            System.out.println("Keliling persegi panjang: " + keliling);
        }

        // Method untuk menghitung luas dan keliling lingkaran
        public static void lingkaran(double jarijari) {
            double luas = Math.PI * jarijari * jarijari;
            double keliling = 2 * Math.PI * jarijari;
            System.out.println("Luas lingkaran: " + luas);
            System.out.println("Keliling lingkaran: " + keliling);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Pilih bangun datar:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan sisi persegi: ");
                    double sisi = scanner.nextDouble();
                    persegi(sisi);
                    break;
                case 2:
                    System.out.println("Masukkan panjang persegi panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.println("Masukkan lebar persegi panjang: ");
                    double lebar = scanner.nextDouble();
                    persegiPanjang(panjang, lebar);
                    break;
                case 3:
                    System.out.println("Masukkan jari-jari lingkaran: ");
                    double jarijari = scanner.nextDouble();
                    lingkaran(jarijari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            scanner.close();
        }
    }
