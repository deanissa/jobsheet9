import java.util.Scanner;
public class ArrayRataNilai06 {
 public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    int[] nilaiMhs= new int[10];
    double totalLulus=0;
    double totalTdkLulus=0;
    double Lulus=0;
    double TdkLulus=0;
    double rataLulus;
    double rataTdkLulus;
    double rata2;

    for (int i=0; i<nilaiMhs.length; i++){
        System.out.println("Masukkan nilai mahasiswa ke-"+ (i+1)+": ");
        nilaiMhs[i]= sc.nextInt();
    }

    for (int i = 0; i<nilaiMhs.length; i++) {
    if (nilaiMhs[i]>70){
        totalLulus = totalLulus + nilaiMhs[i];
       Lulus++;
     } else{
        totalTdkLulus = totalTdkLulus + nilaiMhs[i];
        TdkLulus++;
        }  
    }
    rataLulus = totalLulus/Lulus;
    rataTdkLulus = totalTdkLulus/TdkLulus;
    System.out.println("Rata-rata Mahasiswa Lulus = "+rataLulus);
    System.out.println("Rata-rata Mahasiswa Tidak Lulus = "+rataTdkLulus);
    }
}
