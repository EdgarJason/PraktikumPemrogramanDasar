import java.util.Scanner;

public class ProgramDayaListrik_EdgarJasonHusin_F_TIF_245150201111047 {
    public static void main(String[] args) {

        //Nama : Edgar Jason Husin
        //NIM : 245150201111047
        //Kelas : F - TIF

        //declare variabel
        int a,b,c,d,e,f,g;
        String x,y;

        //scan input
        Scanner scan = new Scanner(System.in);

        //penginputan nama dan kelurahan
        System.out.println("==========================================================");
        System.out.println("PROGRAM PENGHITUNG PEMAKAIAN LISTRIK SEDERHANA");
        System.out.println("==========================================================");

        System.out.print("Masukkan nama                     = ");
        x = scan.nextLine();

        System.out.print("Kelurahan                         = ");
        y = scan.nextLine();

        //input integer
        System.out.print("Masukkan posisi awal kwh meter    = ");
        a = scan.nextInt();

        System.out.print("Masukkan posisi akhir kwh meter   = ");
        b = scan.nextInt();

        System.out.print("Masukkan biaya beban saat ini     = ");
        c = scan.nextInt();

        System.out.print("Masukkan PPJ (dalam persen)       = ");
        d = scan.nextInt();

        //operasi penghitungan
        e = c*1000;
        f = (e*d/100);
        g = e+f;

        //output
        System.out.println("=========================PLN JAVA=========================");
        System.out.println("Nama                = "+ x);
        System.out.println("Kelurahan           = "+y);
        System.out.println("Pemakaian bulan ini = "+(b-a)+" Kwh Meter");
        System.out.println("Tarif listrik       = Rp "+e+",-");
        System.out.println("PPJ "+d+"%             = Rp "+f+",-");
        System.out.println("TOTAL               = Rp "+g+",-");
        System.out.println("==========================================================");
        
    }
}
