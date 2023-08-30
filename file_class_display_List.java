import java.io.File;
public class file_class_display_List {

    static void Display(File file)
    {
        String filename[] = file.list();
        for(String name : filename)
        {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        File file = new File("/Users/Tanu/desktop");
        if(file.exists())
        {
            Display(file);
        }
    }
}
