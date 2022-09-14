import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        int x, y;
        Scanner inp = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.print("Masukkan nilai x \t\t= ");
        x = inp.nextInt();
        System.out.print("Masukkan nilai y \t\t= ");
        y = inp.nextInt();
        int hasil = x + y;
        System.out.println("Hasil penjumlahan x + y \t= " + hasil);
        System.out.println("------------------------------------------------------------");
    }
}
