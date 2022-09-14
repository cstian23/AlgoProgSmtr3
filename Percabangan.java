import java.util.Scanner;

import java.util.Scanner;

public class Percabangan{
    public static void main(String[] args) {
        String nama, keterangan;
        int nilai;
        Scanner inp = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.print("Masukkan nama anda = ");
        nama = inp.nextLine();
        System.out.print("Masukkan nilai anda = ");
        nilai = inp.nextInt();

        if(nilai >= 60)
        {
            keterangan = "Lulus";
            System.out.println(keterangan);
            System.out.println("-----------------------------------");
        }else
        {
            keterangan = "Tidak Lulus";
            System.out.println(keterangan);
            System.out.println("-----------------------------------");
        }

        System.out.println(nama + " " + keterangan);
        System.out.println("-----------------------------------");
    }
}