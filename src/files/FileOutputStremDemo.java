package files;

import java.io.FileOutputStream;

public class FileOutputStremDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("F:\\FileHandling1\\src\\files\\output.txt");
            String s = " This is java";
            byte [] b = s.getBytes();
            f.write(b);
            f.close();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception caught");
        }

    }
}
