import java.util.Scanner;

public class Prak_void {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 3;
        do {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    volPrismaSegitiga();
                    break;
                case 2:
                    volBalok();
                    break;
            }
        } while (pilih != 3);
    }

    private static void volPrismaSegitiga() {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        System.out.print("Masukkan nilai a :");
        a = in.nextFloat();
        System.out.print("Masukkan nilai b :");
        b = in.nextFloat();
        System.out.print("Masukkan nilai c :");
        c = in.nextFloat();

        float s = (a + b + c) / 2;
        double luas = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        // menghitung luas, dan keliling dari segitiga sembarang dengan output 2 angka di belakang koma
        System.out.printf("Luas segitiga sembarang tersebut adalah %.2f%n",(luas));
        System.out.printf("Keliling segitiga sembarang tersebut adalah %.2f%n",(a + b + c));
    }

    static void volBalok() {
        Scanner in = new Scanner(System.in);
        float alas, tinggi;
        System.out.print("Masukkan alas segitiga : ");
        alas = in.nextFloat();
        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = in.nextFloat();
        // hitung luas, keliling, dan sisi miring segitiga siku-siku dengan output 2 angka di belakang koma
        float sisiMiring = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        float luasSegitiga = (alas * tinggi) / 2;
        float kelilingSegitiga = alas + tinggi + sisiMiring;
        System.out.printf("Luas segitiga siku-siku : %.2f%n", luasSegitiga);
        System.out.printf("Sisi miring segitiga siku-siku : %.2f%n", sisiMiring);
        System.out.printf("Keliling segitiga siku-siku : %.2f%n", kelilingSegitiga);
    }
}