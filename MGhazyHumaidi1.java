import java.util.Scanner;
public class MGhazyHumaidi1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean always = true;
        while(always){
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Kombinasi");
            System.out.println("2. Permutasi");
            System.out.println("3. Keluar");

            System.out.print("Pilihan anda : ");
            int pilihan = input.nextInt();
            if(pilihan == 3) {
                always = false;
                break;
            }

            System.out.print("Masukkan nilai n : ");
            int n = input.nextInt();
            System.out.print("Masukkan nilai r : ");
            int r = input.nextInt();

            switch(pilihan){
                case 1:{
                    int hasilKombinasi = combination(n, r);
                    System.out.println("           n");
                    System.out.println("nPr = ------------ = "+hasilKombinasi);
                    System.out.println("       !(n-r) x r!");
                    System.out.println("Maka Hasil Kombinasi adalah : "+hasilKombinasi+"\n");
                    break;
                }
                case 2:{
                    int hasilPermutasi = permutation(n, r);
                    System.out.println("        n");
                    System.out.println("nPr = ------ = "+hasilPermutasi);
                    System.out.println("      !(n-r)");
                    System.out.println("Maka Hasil Kombinasi adalah : "+hasilPermutasi+"\n");
                    break;
                }
            }

        }
    }

    static int permutation(int n, int r){
        return factorial(n) / factorial(n - r);
    }

    static int combination(int n, int r){
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    static int factorial(int n){
        int hasil = 1;
        for(int i = 2; i <= n; i++){
            hasil *= i;
        }
        return hasil;
    }
}
