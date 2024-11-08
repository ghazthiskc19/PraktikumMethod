import java.util.Scanner;
public class MGhazyHumaidi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Buat bilangan prima dengan algoritma sieve of erastothenes
        int n = 1000000;
        boolean[] primes = new boolean[n + 1];

        for(int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for(int i = 2; i * i < n; i++){
            if(primes[i]){
                for(int j = i * 2; j < n; j += i){
                    primes[j] = false;
                }
            }
        }

        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();

        if(primes[angka]){
            System.out.println(angka + " adalah prima");
        }else{
            System.out.println(angka + " bukan prima");
        }

        System.out.print("Contoh bilangan prima : ");
        for(int i = 2; i < 100; i++){
            if(primes[i] && i == 2){
                System.out.print(i);
            }else if(primes[i]){
                System.out.print(","+i);
            }
        }
    }
}
