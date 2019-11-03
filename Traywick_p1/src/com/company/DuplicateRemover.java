package com.company;
import java.io.*;
import java.util.*;


public class DuplicateRemover {

    private static HashSet uniqueWords;

    public static void remove(String dataFile) throws IOException {

        String inputWords;
        uniqueWords = new HashSet<String>();
        Scanner scnr = new Scanner(new File(dataFile));

        while(scnr.hasNext()){
            inputWords = scnr.next();
            uniqueWords.add(inputWords);
        }
        scnr.close();
    }

    public void Write(String outputFile) throws IOException{

        File outFile;
        FileWriter writer = null;
        outFile = new File(outputFile);

        if(outFile.exists()){
            writer = new FileWriter(outFile, true);
            Iterator iterator = uniqueWords.iterator();

            while(iterator.hasNext()){
                String words = (String)iterator.next();
                writer.write(words + "\n");
            }
            writer.close();
        }
        else{
            outFile.createNewFile();
            writer = new FileWriter(outFile);
            Iterator iterator = uniqueWords.iterator();

            while(iterator.hasNext()){
                String words = (String)iterator.next();
                writer.write(words + "\n");
            }
            writer.close();
        }

    }

}


