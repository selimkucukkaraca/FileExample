package service;

import entity.Ogrenci;
import repository.OgrenciRepository;

import java.util.List;

public class OgrenciService {
     private OgrenciRepository ogrenciRepository = new OgrenciRepository();

    public Ogrenci save(Ogrenci ogrenci){
        return ogrenciRepository.save(ogrenci);
    }

    public List<String> getAll(){
        return ogrenciRepository.findAll();
    }
}
