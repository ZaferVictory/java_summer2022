package practise_12OkulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Islemler {

    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;// ogretmen mi ogrenci islemi mi yapacaksın

    //static yazmamizin sebebi tum methodlardan ulasamk icin gokte ki ay
    //gokteki ay gibi heryeden ulaşılabilsin


    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();//kullanici kucuk harf girse bile buyuk harfe cevirdik cunku kontrol buyuk harfle yapcaz
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCİ";
                islemMenusu();

                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cıkıs();

                break;
            default:
                System.out.println("hatali giris yaptınız :(");
                girisPaneli();// recursive method call- burada hatalı giris yaptıgımızda bizi tekrar 21 satıra geri getiriyor
                break;

        }

    }

    private static void cıkıs() {

        System.out.println("agam gene bekleriz güle güle");
    }

    public static void islemMenusu() {

        System.out.println("sectiginiz kis turu:  " + kisiTuru + " icin asagıdakı islemlerden tercih yapiniz\r\n"
                + "=============İŞLEMLER=============\\r\n"
                + "      1-EKLEME\r\n"
                + "      2-ARAMA\r\n"
                + "      3-LİSTELEME\r\n"
                + "      4-SİLME\r\n"
                + "      0-ANA MENÜ\r\n");

        System.out.println("islem yercihiniz yapiniz");

        int secilenİslem = scan.nextInt();
        switch (secilenİslem) {
            case 1:
                ekle();
                islemMenusu();// method call ile islem menusune tekrar gidiyorum
                break;
            case 2:
                arama();
                islemMenusu();
                break;

            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();
                islemMenusu();
                break;
            case 0:
                girisPaneli();// sıfır girerse bu metoda gidecek ve bastan calısacak
                break;

            default:
                System.out.println("yukarida girecegin sayilari bosuna mı belirttik");
                islemMenusu();

                break;
        }


    }


    private static void ekle() {// aynı klasda kullanacagım icin public yapmaya gerek yok

        System.out.println("     ******     " + kisiTuru + " ekleme sayfasi   ***");

        System.out.println("ad soyad giriniz");
        scan.nextLine();// dumy hayalet komut
        String adSoyad = scan.nextLine(); // arka arkaya string scan olan yerlerde araya dumy hayalet komut atmak lazım.

        System.out.println("kimlik no giriniz");
        String kimlikNo = scan.nextLine();

        System.out.println("yas giriniz");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCİ")) {
            System.out.println("ogrenci no giriniz");
            scan.nextLine();
            String ogrenciNo = scan.nextLine();// bunlardan ikisini de  next yaparsak dummy e gerek kalmaz

            System.out.println("sınıf giriniz");
            String sınıf = scan.nextLine();

            ogrenci sefilOgrenci = new ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sınıf);
            ogrncList.add(sefilOgrenci);

        } else {// ogretmen ile ilgili islemleri yapıyoruz
            System.out.println("bolum  giriniz");
            String bolum = scan.nextLine();
            scan.nextLine();//dummy ikisinin arasına dummy caktım
            System.out.println("sicil no giriniz");
            String sicilNo = scan.nextLine();
            Ogretmen muhtesemOgretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogrtmnList.add(muhtesemOgretmen);
        }
    }

    private static void arama() {
        System.out.println("     ******     " + kisiTuru + " arama sayfasi   ***");

        boolean flag = true;// bayrak yukarıda ogreciyi aramaya basla
        if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {
            scan.nextLine();
            System.out.println("aradıgınız ogrenci kimlik numarasını giriniz");
           // String arananKimlikNo=scan.next().replaceAll(" ","");// kullanıcı bosluk girerse diye bosluk hiclik

            String arananKimlikNo = scan.next();

            for (Kisi k : ogrncList) {
                if (k.getKimlikNo().equals(arananKimlikNo)) {

                    System.out.println("aradıgınız ogrenci " + k.getAdSoyad());
                    flag = false;// aradıgın ogrenciyi buldum bayrak asagıya ındı anlamında
                }

            }
            if (flag) {// flag true ise hala bu if badısı hala calısır yanı aranan tc ile ogrenci yok demektir
                System.out.println("aradıgınız ogrenci mevcut degil");

            }

        } else {// ogretmen icin calisacak
            System.out.println("aradıgınız ogretmenin kimlik numarasını giriniz");
            String arananKimlikNo = scan.next();

            for (Kisi k : ogrtmnList) {
                if (k.getKimlikNo().equals(arananKimlikNo)) {

                    System.out.println("aradıgınız ogretmen " + k.getAdSoyad());
                    flag = false;// aradıgın ogrenciyi buldum bayrak asagıya ındı anlamında
                }
            }
            if (flag) {
                System.out.println("aradıgınız ogretmen mevcut degil");


            }


        }

    }

    private static void listele() {
        System.out.println("     ******     " + kisiTuru + " listeleme sayfasi   ***");

        if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {// ogrenci listeleme if i
            System.out.println(ogrncList);

        } else { // ogretmen listeleme
            for (Kisi k : ogrtmnList) {
                System.out.println(k.toString());
            }

        }
    }

    private static void sil() {// arama menusunun aynısını buraya kopyalayıp uyarladım

        System.out.println("     ******     " + kisiTuru + " silme sayfasi   ***");

        boolean flag = true;// bayrak yukarıda ogreciyi aramaya basla
        if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {
            scan.nextLine();
            System.out.println("silinecek ogrenci kimlik numarasını giriniz");

            String silinecekKimlikNo = scan.next();

            for (Kisi k : ogrncList) {
                if (k.getKimlikNo().equals(silinecekKimlikNo)) {

                    System.out.println("silinecek ogrenci " + k.getAdSoyad());
                    ogrncList.remove(k);// ogrenci silindi
                    flag = false;
                }

            }
            if (flag) {// kullanıcının girdiği tc ile hıc bir ogretmen eslesmedi demek
                System.out.println("silinecek ogrenci mevcut degil");

            }

        } else {
            System.out.println("silinecek ogretmenin kimlik numarasını giriniz");
            String silinecekKimlikNo = scan.next();

            for (Kisi k : ogrtmnList) {
                if (k.getKimlikNo().equals(silinecekKimlikNo)) {

                    System.out.println("silinen ogretmen " + k.getAdSoyad());
                    ogrtmnList.remove(k);
                    flag = false;// aradıgın ogrenciyi buldum bayrak asagıya ındı anlamında
                    break;
                }
            }
            if (flag) {
                System.out.println("silinecek ogretmen mevcut degil");


            }

        }
    }
}