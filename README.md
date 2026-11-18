# Ödev: Akıllı Sayı Analiz Sistemi

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
