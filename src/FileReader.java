import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        try {
            BufferedReader br0 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input Filename : ");
            String filn = br0.readLine();
            BufferedReader br = new BufferedReader(new FileReader(filn));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close(); // 关闭文件读取器
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
