import java.io.File;
public class File_Class {
    public static void main(String[] args) {
        File f1 = new File("/Users/Tanu/desktop/file_class");
        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.getName());
        System.out.println(f1.lastModified());
        System.out.println(f1.canRead());
        System.out.println(f1.getAbsoluteFile());
        String []filename = f1.list();
        for(String file : filename)
        {
            System.out.println(file+ "\t");
        }

    }
}
