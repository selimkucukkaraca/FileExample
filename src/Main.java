import entity.Ogrenci;
import entity.Ogretmen;
import repository.OgrenciRepository;
import repository.OgretmenRepository;
import service.OgrenciService;
import service.OgretmenService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        OgretmenService ogretmenService = new OgretmenService();
        OgretmenRepository ogretmenRepository = new OgretmenRepository();

        OgrenciService ogrenciService = new OgrenciService();
        OgrenciRepository ogrenciRepository = new OgrenciRepository();


        String islemler = "1-Ogrenci ekle\n" +
                "2-Tum ogrencileri goster\n" +
                "3-Ogretmen ekle\n" +
                "4-Tum ogretmenleri goster\n" +
                "5-Cikis icin q'ya basiniz";


        while (true){
            System.out.println("-----OKUL OTOMASYON SISTEMINE HOSGELDINIZ-----");
            System.out.println(islemler);

            System.out.println("yapmak istediginiz islemi giriniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("1")){
                Ogrenci ogrenci = new Ogrenci("Furkan","Yildiz","Akdeniz Üniversitesi",22);
                System.out.println(ogrenciService.save(ogrenci));
            }
            else if (islem.equals("2")) {
                System.out.println(ogrenciRepository.findAll());
            }
            else if (islem.equals("3")) {
                Ogretmen ogretmen = new Ogretmen("Ahmet","Yilmaz","Balıkesir Üniversitesi",44);
                System.out.println(ogretmenService.save(ogretmen));
            }
            else if (islem.equals("4")){
                System.out.println(ogretmenRepository.findAll());
            }
            else if (islem.equals("q")){
                System.out.println("cikis yapiliyor");
                break;
            }
            else {
                System.out.println("gecersiz islem.");
            }
        }
    }
}
