import java.util.*;
import java.io.*;

public class WriteObject
{
    public static void main(String[] args)throws IOException
    {
     System.out.println("Input Filename of Student's file :");
     System.out.println("");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String filename=br.readLine();
     ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename));
     String str=new String();
     int counter=0;
     do {
         counter++;
         System.out.println("Input Student Name :");
         String name = br.readLine();

         System.out.println("Input English score :");
         str=br.readLine();
         short e = Short.parseShort(str);

         System.out.println("Input Math Score :");
         str=br.readLine();
         short m = Short.parseShort(str);

         System.out.println("Input Java Score :");
         str=br.readLine();
         short j = Short.parseShort(str);

         Student ss =new Student(name,e,m,j);
         oos.writeObject(ss);

         System.out.println("Input anoter student file ? (y/n) :");
         str=br.readLine();

     }while(str.equalsIgnoreCase("Y"));

     oos.flush();
     oos.close();
     System.out.println("\n Had filled"+counter+"Student's info. into "+filename);


    }
}
