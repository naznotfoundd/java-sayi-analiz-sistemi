import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

import java.util.Scanner;

public class AkilliSayiAnaliz {

    public static boolean asalMi(int sayi) {
        if (sayi < 2) {
            return false;
        }

        for (int i = 2; i <= sayi / i; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean mukemmelMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }

    public static int basamakSayisi(int sayi) {
        sayi = Math.abs(sayi);

        if (sayi == 0) {
            return 1;
        }

        int sayac = 0;

        while (sayi > 0) {
            sayi /= 10;
            sayac++;
        }

        return sayac;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;
        int pozitif = 0;
        int negatif = 0;
        int tek = 0;
        int cift = 0;
        int asalSayisi = 0;

        int toplam = 0;
        int pozitifToplam = 0;

        int enBuyuk = 0;
        int enKucuk = 0;

        int sayac = 0;

        System.out.println("=== AKILLI SAYI ANALIZ SISTEMI ===");
        System.out.println("Analiz icin tam sayilar giriniz.");
        System.out.println("Bitirmek icin 0 giriniz.");

        while (true) {

            System.out.print("Sayi giriniz: ");
            sayi = input.nextInt();

            if (sayi == 0) {
                break;
            }

            sayac++;
            toplam += sayi;

            if (sayi > 0) {
                pozitif++;
                pozitifToplam += sayi;
            } else {
                negatif++;
            }

            if (sayi % 2 == 0) {
                cift++;
            } else {
                tek++;
            }

            if (sayac == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }

                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }

            if (asalMi(sayi)) {
                asalSayisi++;
            }

            System.out.println("Basamak sayisi: "
                    + basamakSayisi(sayi));

            if (asalMi(sayi)) {
                System.out.println(sayi + " asal sayidir.");
            } else {
                System.out.println(sayi + " asal degildir.");
            }

            if (mukemmelMi(sayi)) {
                System.out.println(sayi + " mukemmel sayidir.");
            } else {
                System.out.println(sayi + " mukemmel sayi degildir.");
            }

            System.out.println("--------------------------");
        }

        System.out.println("\n=== SONUC RAPORU ===");

        if (sayac == 0) {
            System.out.println("Hic sayi girilmedi!");
        } else {

            System.out.println("Girilen sayi adedi: " + sayac);
            System.out.println("Pozitif sayi adedi: " + pozitif);
            System.out.println("Negatif sayi adedi: " + negatif);
            System.out.println("Tek sayi adedi: " + tek);
            System.out.println("Cift sayi adedi: " + cift);

            System.out.println("En buyuk sayi: " + enBuyuk);
            System.out.println("En kucuk sayi: " + enKucuk);

            System.out.println("Toplam: " + toplam);

            System.out.println("Aritmetik ortalama: "
                    + (double) toplam / sayac);

            System.out.println("En buyuk ve en kucuk arasindaki fark: "
                    + ((long) enBuyuk - enKucuk));

            System.out.println("Asal sayi adedi: " + asalSayisi);

            if (pozitif > 0) {
                System.out.println("Pozitif sayilarin ortalamasi: "
                        + (double) pozitifToplam / pozitif);
            } else {
                System.out.println("Pozitif sayi bulunmadigi icin "
                        + "ortalama hesaplanamadi.");
            }
        }

        input.close();
    }
}

        // TODO: 1. Sayaçları ve toplamları tanımlayın (dizi kullanmayın!)

        // TODO: 2. 0 girilene kadar sayı alan bir döngü kurun

        // TODO: 3. Her sayı için pozitif/negatif, tek/çift, en büyük/en küçük, toplam bilgilerini güncelleyin

        // TODO: 4. Her sayı için asal, mükemmel sayı ve basamak sayısı kontrolü yapın

        // TODO: 5. Hiç sayı girilmediyse uyarı verin, girildiyse ortalamayı hesaplayın

        // TODO: 6. Sonuç raporunu düzenli şekilde yazdırın

        // TODO (Opsiyonel): max-min farkı, pozitiflerin ortalaması, asal sayı adedi

        scanner.close();
    }
}
