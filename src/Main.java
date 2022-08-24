import entity.Ogrenci;
import repository.OgrenciRepository;
import service.OgrenciService;

public class Main {
    public static void main(String[] args) throws Exception{
        Ogrenci ogrenci = new Ogrenci("baris","seckin","Afyon Kocatepe Üniversitesi",22);
        OgrenciService ogrenciService = new OgrenciService();
        System.out.println(ogrenciService.save(ogrenci));

        System.out.println(ogrenciService.getAll());
    }
}
