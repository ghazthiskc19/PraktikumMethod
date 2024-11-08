import java.util.Scanner;

public class Prak_retval {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, nim2, nama2, jur1, jur2, stat1, stat2;
        int umr1, umr2;
        System.out.println("Masukkan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.println("Masukkan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.println("Masukkan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.println("Masukkan umur mahasiswa 1 : ");
        umr1 = in.nextInt();
        in.nextLine();
        System.out.println("Masukkan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.println("Masukkan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.println("Masukkan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        System.out.println("Masukkan umur mahasiswa 2 : ");
        umr2 = in.nextInt();
        in.nextLine();

        if(umr1 > 20){
            stat1 = "Adult";
        }else{
            stat1 = "Teen";
        }

        if(umr2 > 20){
            stat2 = "Adult";
        } else{
            stat2 = "Teen";
        }
        System.out.println("Data Mahasiswa : ");
        System.out.println(showData(nim1, nama1, jur1, stat1));
        System.out.println(showData(nim1, nama2, jur2, stat2));
    }

    public static String showData(String nim, String nama, String jurusan, String status) {
        String show = "\nnim : \n" + nim + "\nnama : \n" + nama + "\nJurusan : \n" + jurusan;
        return show;
    }
}