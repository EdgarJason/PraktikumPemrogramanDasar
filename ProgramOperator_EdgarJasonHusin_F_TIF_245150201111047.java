import java.util.Scanner;

public class ProgramOperator_EdgarJasonHusin_F_TIF_245150201111047 {
    public static void main(String[] args) {

            //Nama : Edgar Jason Husin
            //NIM : 245150201111047
            //Kelas : F - TIF

            Scanner scan= new Scanner(System.in);
            double x,y;

            //code penginputan
            System.out.println("===============================================");

            System.out.print("Masukkan operator pertama : ");
            x= scan.nextDouble();

            System.out.print("Masukkan operator kedua   : ");
            y= scan.nextDouble();

            //output
            System.out.println("===============================================");
            System.out.println("Hasil penjumlahan : "+(x+y));
            System.out.println("Hasil pengurangan : "+(x-y));
            System.out.println("Hasil perkalian   : "+(x*y));
            System.out.println("Hasil pembagian   : "+(x/y));
            System.out.println("===============================================");

    }
}
