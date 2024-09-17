import java.util.Scanner;

public class ProgramOperator_EdgarJasonHusin_F_TIF_245150201111047 {
    public static void main(String[] args) {

            //Nama : Edgar Jason Husin
            //NIM : 245150201111047
            //Kelas : F - TIF

            Scanner scan= new Scanner(System.in);
            int x,y;
            int tambah,kurang,kali;
            double bagi;

            //code penginputan
            System.out.println("===============================================");

            System.out.print("Masukkan operator pertama : ");
            x= scan.nextInt();

            System.out.print("Masukkan operator kedua   : ");
            y= scan.nextInt();

            tambah=x+y;
            kurang=x-y;
            kali=x*y;
            bagi=(double)x/y;

            //output
            System.out.println("===============================================");
            System.out.println("Hasil penjumlahan : "+tambah);
            System.out.println("Hasil pengurangan : "+kurang);
            System.out.println("Hasil perkalian   : "+kali);
            System.out.println("Hasil pembagian   : "+bagi);
            System.out.println("===============================================");

    }
}
