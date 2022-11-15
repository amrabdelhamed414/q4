package Q7;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList <Integer> data = new ArrayList<>();
        File file = new File("src/Q7/ww.txt");
        PrintWriter out = null;
        Scanner in = null;
        if (file.exists()==false) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Problem >_<");
            }
        }

        try {
            in = new Scanner(file);
            out = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("Problem >_<");
        }

        for (int i = 1; i <= 100; i++){
            out.print((int)(Math.random()*1000));
            if (i%10==0)
                out.println();
            else
                out.print(" ");
        }
        out.close();

        while (in.hasNext())
            data.add(in.nextInt());

        data.sort(Integer::compareTo);

        for (var x : data)
            System.out.println(x+" ");
    }
}
