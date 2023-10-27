import java.util.Scanner;
public class NilaiArrayDea06 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        int [] nilai = new int [5];
        int nilaiTinggi;
        int nilaiRendah;
        int jmlNilai=0;
        double rata2;
        double total=0; 

        System.out.println ("Masukkan jumlah Nilai : ");
        jmlNilai = sc.nextInt();
   
        for (int i= 0; i< nilai.length; i++) {
            System.out.println("Masukkan Nilai ke- " +i+ ":");
            nilai[i]= sc.nextInt();    
        }
        nilaiTinggi = nilai[0];
        for (int i = 0; i< nilai.length; i++) {
            if (nilai[i] > nilaiTinggi){
                nilaiTinggi = nilai[i];
            }
        }
        nilaiRendah = nilai[0];
        for (int i = 0; i <nilai.length; i++) {
            if (nilai[i] < nilaiRendah){
                 nilaiRendah = nilai[i] ;
            }
        }
        rata2 = nilai[0];
        for (int i = 0; i< nilai.length; i++) {
            total += nilai[i];
        }
        rata2 = total/jmlNilai;
        System.out.println ("Nilai Tertinggi : " +nilaiTinggi);
        System.out.println ("Nilai Terendah : " +nilaiRendah);
        System.out.println ("Rata rata Nilai : " +rata2);
    }
}
