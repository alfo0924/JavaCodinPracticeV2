import java.util.*;
import java.io.*;
 class io
{

}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Practice from Main");
        try{
            BufferedWriter br=new BufferedWriter(new FileWriter("IOTest.txt"));
            Scanner scanner =new Scanner(System.in);
            ArrayList<String>arl=new ArrayList<>();
            String sc=scanner.nextLine();
            while(!sc.equals("break"))
            {
            sc=scanner.nextLine();
            arl.add(sc);
            }
            for(String str:arl)
            {
                br.write(str);
                br.newLine();
            }

            br.close();
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }



    }
}