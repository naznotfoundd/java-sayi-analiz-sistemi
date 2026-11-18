# Akıllı Sayı Analiz Sistemi

## 1. Algoritma Açıklaması

Program ilk olarak gerekli değişkenleri tanımlar ve kullanıcıdan sayı almaya başlar.

Kullanıcıdan alınan sayılar 0 olmadığı sürece program çalışmaya devam eder. Girilen her sayı pozitif veya negatif olarak kontrol edilir. Daha sonra sayının tek mi çift mi olduğu belirlenir.

Girilen sayıların toplamı hesaplanır. İlk girilen sayı en büyük ve en küçük sayı olarak kabul edilir. Daha sonra girilen sayılar bu değerlerle karşılaştırılır.

Ayrıca her sayının asal, mükemmel sayı olup olmadığı ve kaç basamaklı olduğu kontrol edilir.

Kullanıcı 0 girdiğinde sayı alma işlemi sona erer. Program girilen sayılara ait sonuçları ekrana yazdırır. Eğer hiç sayı girilmemişse uygun bir uyarı mesajı gösterilir.

## 2. Kullanılan Java Yapıları

- `Scanner`: Kullanıcıdan sayı almak için kullanılmıştır.
- `while`: Kullanıcıdan sürekli sayı almak için kullanılmıştır.
- `for`: Asal ve mükemmel sayı kontrolünde kullanılmıştır.
- `if-else`: Sayıları kontrol etmek ve sınıflandırmak için kullanılmıştır.
- Metotlar: Asal sayı, mükemmel sayı ve basamak sayısı işlemlerinde kullanılmıştır.

## 3. Test Senaryoları

| No | Girilen Sayılar | Beklenen Sonuç |
|---|---|---|
| 1 | 5, -4, 6, 0 | Pozitif: 2, Negatif: 1, Tek: 1, Çift: 2 |
| 2 | 0 | Hiç sayı girilmedi uyarısı |
| 3 | -7, -2, -9, 0 | Pozitif: 0, Negatif: 3 |
| 4 | 2, 3, 5, 0 | Asal sayı adedi: 3 |
| 5 | 1, 4, 6, 0 | Tek: 1, Çift: 2 |
| 6 | 6, 28, 12, 0 | 6 ve 28 mükemmel sayıdır |
| 7 | -12345, 100000, 0 | Basamak sayıları: 5 ve 6 |
| 8 | 8, 8, 8, 0 | En büyük: 8, En küçük: 8, Fark: 0 |

## 4. Sonuç

Bu proje sayesinde Java programlama dilinde döngüler, karar yapıları, metotlar ve değişkenlerin kullanımı pekiştirilmiştir.

Program hazırlanırken dizi kullanılmamış, girilen sayılar tek tek analiz edilmiştir. İstenen işlemler ve ek görevler programa dahil edilmiştir.# Ödev: Akıllı Sayı Analiz Sistemi

> Bu bir ödev şablonudur. Ödevi **yapay zekâ kullanmadan**, kendi başınıza yapmanız beklenir.

## Repo Yapısı

```
.
├── README.md        -> Ödev tanımı (bu dosya)
├── RAPOR.md         -> Doldurmanız gereken rapor
├── src/
│   └── Main.java    -> Java çözümünüzü buraya yazın
└── docs/
    └── akis-semasi.png  -> Çizdiğiniz akış şemasını buraya koyun
```

## Nasıl Çalıştırılır?

```bash
javac src/Main.java
java -cp src Main
```

## Problem

Kullanıcının girdiği sayıları analiz eden ve çeşitli matematiksel sonuçlar üreten bir Java programı geliştirin. Program, kullanıcı bitirmek istediğini belirtinceye kadar sayı almaya devam etmelidir.

## Sistem Gereksinimleri

### 1. Sayı girişi
- Kullanıcı istediği kadar **tam sayı** girebilmelidir.
- Kullanıcı **0** girdiğinde giriş sona ermelidir.
- 0, analiz edilecek sayılar arasında **değerlendirilmemelidir**.

### 2. Sayı analizi
- Pozitif sayıların adedi
- Negatif sayıların adedi
- Tek sayıların adedi
- Çift sayıların adedi
- En büyük sayı
- En küçük sayı
- Girilen sayıların toplamı
- Aritmetik ortalama

### 3. Özel sayı analizi
- Girilen sayının asal olup olmadığı
- Sayının mükemmel sayı olup olmadığı
- Sayının basamak sayısı

### 4. Sonuç raporu
- 0 girildiğinde tüm analizler tamamlanmalı ve sonuçlar düzenli şekilde ekrana yazdırılmalıdır.
- Hiç sayı girilmeden 0 girilirse uygun bir uyarı verilmelidir.

## Ek Görevler (Opsiyonel)

- En büyük ve en küçük sayı arasındaki farkı hesaplayın.
- Pozitif sayıların ortalamasını ayrıca hesaplayın.
- Asal sayıların kaç tane olduğunu bulun.

## Kısıt

**Dizi kullanmadan** çözülmelidir. Analizde döngüler ve karar yapıları birlikte kullanılmalıdır.

## Sizden İstenenler (Teslim)

1. Java kaynak kodu. (`src/Main.java`)
2. Algoritma açıklaması. (`RAPOR.md`)
3. Akış şeması. (`docs/akis-semasi.png`)
4. En az **8 farklı** test senaryosu. (`RAPOR.md`)

Bu repoyu kendi hesabınıza kopyalayın, çalışmanızı commit'leyip sistemin belirttiği şekilde teslim edin.
