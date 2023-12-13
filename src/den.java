public class AsalSayiYazdiranProgram {
    public static void main(String[] args) {
        System.out.println("1-100 arasındaki asal sayılar:");
        // 2'den 100'e kadar olan her sayıyı kontrol et
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;

            // Sayının 2'den kendisi hariç tüm potansiyel bölenleri kontrol et
                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) {
                        asalMi = false;// Sayı başka bir sayıya bölünüyorsa asal değildir
                        break;
                    }
                }

            // Eğer sayı asalsa ekrana yazdır
            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
