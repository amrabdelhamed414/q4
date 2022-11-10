package Q4;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        File file = new File("src/Q4/lyrics.txt");
        File newfile = new File("src/Q4/newLyrics.txt");
        PrintWriter newtxt = null;
        Scanner txt = null;
        try {
            txt = new Scanner(file);
            newtxt = new PrintWriter(newfile);
        } catch (FileNotFoundException e) {
            System.out.println("file not found!!");
        }

        System.out.printf("Replace: ");
        String toFetch = console.nextLine();
        System.out.printf(toFetch+"With: ");
        String replacement = console.nextLine();

        while (txt.hasNext()){
            String[] words = txt.nextLine().split(" ");
            for(String x : words){
                if(x==toFetch)
                    newtxt.print(replacement+" ");
                else
                    newtxt.print(x+" ");
            }
            newtxt.println();
        }
        newtxt.close();
    }
}