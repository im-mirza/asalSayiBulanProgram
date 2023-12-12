import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan alınacak sayı ve kontrol değişkenleri tanımlanıyor.
        boolean a=true,asal=true;

        // Kullanıcıdan sayı girişi alınıyor
        Scanner sc = new Scanner(System.in);
        System.out.println("1-100 arasi Bir sayi Gir:");
        int sayi=sc.nextInt();
        // Girilen sayının 1-100 arasında olup olmadığını kontrol ediliyor.
        while (a) {
            if (sayi<0||sayi>100){
                System.out.println("Lutfen 1-100 arasi bir sayi girin");
                sayi= sc.nextInt();
            } else if (sayi>0||sayi<100) {
                a=false;

            }
        }

        // Girilen sayının asal olup olmadığını kontrol etmek için döngü.
        for (int i = 2; i < sayi;i++){
            if (sayi % i == 0) {
               asal=false;// Sayı, 2'den sayıya kadar herhangi bir sayıya bölünüyorsa asal değildir.
               break;

            }
        }

        // Sonuca göre ekrana mesaj yazdırma.
        if(asal){
            System.out.println(sayi+" asal sayidir");
        }else{
            System.out.println(sayi+" asal degil");
        }


    }
}