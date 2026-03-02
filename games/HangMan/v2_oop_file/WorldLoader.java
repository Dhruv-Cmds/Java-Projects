package HangMan.v2_oop_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WorldLoader{

    public ArrayList<String> getWords (){
        String filePath = "games/HangMan/v2_oop_file/words.txt";

        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;

            while ((line = reader.readLine()) != null) {
                String[] splitWords = line.trim().toLowerCase().split("\\s+");

                        for (String w : splitWords){
                            if (!w.isEmpty()){
                                words.add(w);
                            }
                        }
            }
        }

        catch(FileNotFoundException e){
            System.out.println("Could not find file.");
        }

        catch(IOException e){
            System.out.println("Something went wrong.");
        }
        return words;
    }
}