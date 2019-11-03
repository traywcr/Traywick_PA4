
import java.io.*;
import java.util.*;

public class DuplicateCounter {

    private static HashMap <String, Integer> wordCounter;

    public static void count(String dataFile) throws IOException {

            String inputWords;
            wordCounter = new HashMap();
            Scanner scnr = new Scanner(new File(dataFile));

            while(scnr.hasNext()){
                inputWords = scnr.next();
                if(wordCounter.get(inputWords) == null){
                    wordCounter.put(inputWords, 1);
                }
                else{
                    wordCounter.put(inputWords, wordCounter.get(inputWords) + 1);
                }

            }

            scnr.close();
        }

        public void Write(String outputFile) throws IOException{
            File outFile;
            FileWriter writer = null;
            outFile = new File(outputFile);

            if(outFile.exists()){
                writer = new FileWriter(outFile, true);
                Iterator keyIterator = wordCounter.keySet().iterator();
                Iterator valueIterator = wordCounter.values().iterator();

                while(keyIterator.hasNext()){
                    int i = 0;
                    String keyString = (String) keyIterator.next();
                    int value = (int)valueIterator.next();
                    writer.write(keyString + " = " + value + "\n");
                    i++;
                }

                writer.close();
            }
            else{
                outFile.createNewFile();
                writer = new FileWriter(outFile);
                Iterator keyIterator = wordCounter.keySet().iterator();
                Iterator valueIterator = wordCounter.values().iterator();

                while(keyIterator.hasNext()){
                    int i = 0;
                    String keyString = (String) keyIterator.next();
                    int value = (int)valueIterator.next();
                    writer.write(keyString + " = " + value + "\n");
                    i++;
                }
                writer.close();
            }


        }

    }

