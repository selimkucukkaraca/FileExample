package repository;

import entity.Ogrenci;
import utils.FileName;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciRepository {

    public Ogrenci save(Ogrenci ogrenci){
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileName.OGRENCI_FILE_NAME,true),"UTF-8"))){

            writer.write(ogrenci + "\n");
            return ogrenci;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<String > findAll(){
        List<String > ogrenciList = new ArrayList<>();

        try(Scanner scanner= new Scanner(new BufferedReader(new FileReader(FileName.OGRENCI_FILE_NAME)))) {

            while (scanner.hasNextLine()){
                ogrenciList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return ogrenciList;
    }

}
