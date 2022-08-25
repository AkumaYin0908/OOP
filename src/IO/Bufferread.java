package IO;

import java.io.*;

public class Bufferread {
    public static void main(String[] args) {
        try {
            BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
            String name = bread.readLine();
            System.out.println(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}