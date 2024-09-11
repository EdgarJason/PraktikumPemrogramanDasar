import java.util.Scanner;

public class ProgramOperator_EdgarJasonHusin_F_TIF_245150201111047 {
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            float x,y,a,b,c,d;

            //code penginputan
            System.out.print("Masukkan operator pertama : ");
            x= scan.nextInt();

            System.out.print("Masukkan operator kedua : ");
            y= scan.nextInt();

            //operasi aritmatika
            a=x+y;
            b=x-y;
            c=x*y;
            d=x/y;

            //output
            System.out.println("================================");
            System.out.printf("Hasil penjumlahan :%.2f\n ",a);
            System.out.printf("Hasil pengurangan :%.2f\n ",b);
            System.out.printf("Hasil perkalian :%.2f\n ",c);
            System.out.printf("Hasil pembagian :%.2f\n ",d);
            System.out.println("================================");

    }
}