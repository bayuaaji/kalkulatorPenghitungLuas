import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenu();
    }

    public static Scanner input = new Scanner(System.in);

    public static void mainMenu(){
        System.out.println("---------------------------------------------");
        System.out.println("Kalkulator Penghitung Luas Bidang dan Volume");
        System.out.println("---------------------------------------------");
        System.out.println("Menu");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Luas Volume");
        System.out.println("0. Tutup Aplikasi");
        System.out.println("---------------------------------------------");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                luasBidang();
                break;
            case 2:
                luasVolume();
                break;
            case 0:
                break;
            default:
                mainMenu();
        }
    }

    public static void luasBidang(){
        System.out.println("---------------------------------------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("---------------------------------------------");
        System.out.println("1. persegi");
        System.out.println("2. lingkaran");
        System.out.println("3. segitiga");
        System.out.println("4. persegi panjang");
        System.out.println("0. kembali ke menu sebelumnya");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                persegi();
                break;
            case 2:
                lingkaran();
                break;
            case 3:
                segitiga();
                break;
            case 4:
                persegiPanjang();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("pilihan tidak ditemukan");
                luasBidang();
        }

    }

    public static void luasVolume(){
        System.out.println("---------------------------------------------");
        System.out.println("Pilih volume yang akan dihitung");
        System.out.println("---------------------------------------------");
        System.out.println("1. kubus");
        System.out.println("2. balok");
        System.out.println("3. tabung");
        System.out.println("0. kembali ke menu sebelumnya");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                kubus();
                break;
            case 2:
                balok();
                break;
            case 3:
                tabung();
                break;
            case 0:
                mainMenu();
                break;
            default:
                System.out.println("pilihan tidak ditemukan");
                luasVolume();
        }
    }

    public static void persegiPanjang(){
        System.out.println("---------------------------------------------");
        System.out.println("Anda memilih persegi panjang");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        System.out.println("\nProcessing...\n");
        int hasil = panjang * lebar;

        System.out.println("Luas dari persegi panjang adalah " + hasil);
        System.out.println("---------------------------------------------");
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        input.next();
        mainMenu();
    }

    public static void persegi(){
        System.out.println("---------------------------------------------");
        System.out.println("Anda memilih persegi");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan sisi: ");
        int sisi = input.nextInt();

        System.out.println("\nProcessing...\n");
        int hasil = sisi * sisi * sisi;

        System.out.println("Luas dari persegi adalah " + hasil);
        System.out.println("---------------------------------------------");
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        input.next();
        mainMenu();
    }

    public static void segitiga(){
        System.out.println("---------------------------------------------");
        System.out.println("Anda memilih segitiga");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan alas: ");
        int alas = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        System.out.println("\nProcessing...\n");
        int hasil = (alas * tinggi)/2;

        System.out.println("Luas dari segitiga adalah " + hasil);
        System.out.println("---------------------------------------------");
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        input.next();
        mainMenu();
    }

    public static void lingkaran(){
        System.out.println("---------------------------------------------");
        System.out.println("Anda memilih lingkaran");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan jari-jari: ");
        int jari2 = input.nextInt();

        System.out.println("\nProcessing...\n");
        double hasil = 3.14 * jari2 * jari2;

        System.out.println("Luas dari lingkaran adalah " + hasil);
        System.out.println("---------------------------------------------");
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        input.next();
        mainMenu();
    }

    public static void kubus(){
        System.out.println("---------------------------------------------");
        System.out.println("Anda memilih kubus");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan sisi: ");
        int sisi = input.nextInt();

        System.out.println("\nProcessing...\n");
        int hasil = sisi * sisi * sisi;

        System.out.println("Luas dari kubus adalah " + hasil);
        System.out.println("---------------------------------------------");
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        input.next();
        mainMenu();
    }

    public static void balok(){
        System.out.println("---------------------------------------------");
        System.out.println("Anda memilih balok");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        System.out.println("\nProcessing...\n");
        int hasil = panjang * lebar * tinggi;

        System.out.println("Luas dari balok adalah " + hasil);
        System.out.println("---------------------------------------------");
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        input.next();
        mainMenu();
    }

    public static void tabung(){
        System.out.println("---------------------------------------------");
        System.out.println("Anda memilih tabung");
        System.out.println("---------------------------------------------");
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();
        System.out.print("Masukkan jari-jari: ");
        int jari2 = input.nextInt();

        System.out.println("\nProcessing...\n");
        double hasil = 3.14 * tinggi * jari2 * jari2;

        System.out.println("Luas dari tabung adalah " + hasil);
        System.out.println("---------------------------------------------");
        System.out.println("tekan apa saja untuk kembali ke menu utama");
        input.next();
        mainMenu();
    }
}
