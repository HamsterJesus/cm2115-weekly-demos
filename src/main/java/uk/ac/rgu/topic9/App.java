package uk.ac.rgu.topic9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class App {
    public static void main(String[] args){
        //exception handling
       /*  Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String text = input.nextLine();
        input.close();

        try{ //check if this works
            int number = Integer.valueOf(text);
            int result = number *10;
            System.out.println("Input *10 =" + result);

        }catch(NumberFormatException ex){ //if it doesn't display this error message
            System.out.println("Bruh");
        } */
        
        //file handling
       /*  File myFile = new File("/myfile.txt");
        try {
            if(myFile.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("already exists");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("File couldn't be created");
        }  */
/* 
        try(FileWriter fw = new FileWriter("anotherfile.txt"); BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("This is message ");
            bw.write("So true");

            bw.close();
            fw.close();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        } */

        try(FileReader fr = new FileReader("anotherfile.txt"); BufferedReader br = new BufferedReader(fr)){
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException ex){
            System.out.println("Can't read");
        }
    }
}
