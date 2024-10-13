
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;


public class DictionaryTest {


    public static void main(String[] args) {
        File file=new File("dictionary.txt");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        FileWriter fileWriter=null;
        
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            fileWriter=new FileWriter(file,true);
            String line=null;
            SortedMap<String,String> wordsMap=new TreeMap<>();
            while((line=bufferedReader.readLine())!=null)
            {
                String[] words=line.split(":");
                String key=words[0];
                String value=words[1];
                //System.out.println("Key:"+key+",\tValue:"+value);
                wordsMap.put(key, value);
            }
            
            Scanner scan=new Scanner(System.in);
            System.out.println("Aranan Kelime:");
            String input=null;
            while(!(input=scan.nextLine()).equals("exit"))
            {
                String translete=wordsMap.get(input);
                if(translete!=null)
                {
                    System.out.println("Ceviri:"+translete);
                }
                else{
                    System.out.println("Kelime bulunamadi");
                    System.out.print("Eklemek ister misin? Evet(E) ya da Hayır(H)");
                    String answer=scan.nextLine();
                    if(answer.equals("E"))
                    {
                        System.out.print("Yeni Kelime:");
                        String newWord=scan.nextLine();
                        fileWriter.write("\n");
                        fileWriter.write(input);
                        fileWriter.write(":");
                        fileWriter.write(newWord);
                        fileWriter.flush();
                        wordsMap.put(input, newWord);
                    }

                }
                System.out.print("Aranan Kelime:");

            }
                
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            
            try {
                if(fileWriter!=null)
            {
                fileWriter.close();
            }
            if(bufferedReader!=null)
            {
                bufferedReader.close();
            }
            
            if(fileReader!=null)
            {
                fileReader.close();
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
