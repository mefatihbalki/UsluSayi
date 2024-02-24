import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Değişkenler
        double n,k;
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan Alınan Girdiler
        System.out.println("Üssü Alınacak Sayıyı Giriniz: ");
        n = input.nextDouble();
        System.out.println("Üs Olacak Sayıyı Giriniz: ");
        k = input.nextDouble();
        int total =1;
        int i;
        //Döngü
        for (i=1;i<=k;i++){
            total *= n;
        }
        System.out.println("Cevap: " + total);
        //Programın bitişi
    }
}