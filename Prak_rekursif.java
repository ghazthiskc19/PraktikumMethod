import java.util.Scanner;
public class Prak_rekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil;
        System.out.println("Masukkan bilangan yang diinginkan : ");
        int bilangan = input.nextInt();

        hasil =fibonacci(bilangan);
        System.out.println("Nilai dari "+ bilangan + " adalah "+ hasil);
    }
    private static int fibonacci(int bil){
        if (bil == 0)
            return 0;
        else if(bil == 1)
            return 1;
        else
            return (fibonacci(bil - 1) + fibonacci(bil-2));
    }
}