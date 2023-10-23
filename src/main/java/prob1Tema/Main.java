package prob1Tema;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Persoana;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/PerecheNumere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<PerecheNumere> citire() {
        try {
            File file=new File("src/main/resources/PerecheNumere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> Pereche = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return Pereche;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {

        //List<PerecheNumere> pereche=citire();
        PerecheNumere set1=new PerecheNumere(3,5);
        scriere(List.of(set1));

        List<PerecheNumere> numere=citire();
        System.out.println(numere);
        for(PerecheNumere p:numere){
            System.out.println(p);
        }
        //pereche.add(new PerecheNumere(3,5));

    }

}
