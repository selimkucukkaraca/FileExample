package service;

import entity.Ogretmen;
import repository.OgretmenRepository;

import java.util.List;

public class OgretmenService {
    private OgretmenRepository ogretmenRepository = new OgretmenRepository();

    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenRepository.save(ogretmen);
    }

    public List<String> getAll(){
        return ogretmenRepository.findAll();
    }

}
