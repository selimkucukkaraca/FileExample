package repository;

import entity.Ogretmen;
import utils.FileName;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgretmenRepository {
    public Ogretmen save(Ogretmen ogretmen){
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileName.OGRETMEN_FILE_NAME,true),"UTF-8"))) {

        writer.write(ogretmen + "\n");
        return ogretmen;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> findAll(){
        List<String> ogretmenList = new ArrayList<>();
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(FileName.OGRETMEN_FILE_NAME)))) {

            while (scanner.hasNextLine()){
                ogretmenList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return ogretmenList;
    }
}
