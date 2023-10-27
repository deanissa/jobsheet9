import java.util.Scanner;
public class LinearSearch06 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);

        int [] arrayInt = new int [10];
        int key;
        int hasil= 0;

        for (int i = 0; i< arrayInt.length; i++) {
            System.out.println("Masukkan elemen array ke-" +i);
            arrayInt[i]= sc.nextInt();
        }
    
        System.out.println("Masukkan key yang ingin dicari :");
            key= sc.nextInt();

            for (int i = 0; i<arrayInt.length; i++){
            if (arrayInt[i]== key){  
                hasil = i;
            System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
            }else 
            System.out.println("Key ada dalam array tidak ditemukan");
            break;
            }
}
}
