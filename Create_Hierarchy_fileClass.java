import java.io.File;
import java.util.Scanner;

public class Create_Hierarchy_fileClass  {

    static String Create_Dir(String filepath, File file)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter folder name : ");
        String name = kb.next();

        if(file.isDirectory())
        {
            File createdir = new File(filepath+"/"+name);
            try
            {
                if(createdir.mkdir()) {
                    System.out.println("Created Folder");
                }
                else
                {
                    System.out.println("Not cretaed");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        return filepath+"/"+name;
    }
    static String Create_file(String filepath, File file)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String name = kb.next();

        if(file.isDirectory())
        {
            File createfile = new File(filepath+"/"+name);
            try
            {
                if(createfile.createNewFile()) {
                    System.out.println("Created File");
                }
                else
                {
                    System.out.println("Not cretaed");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        return filepath+"/"+name;
    }
    static void exit()
    {
        System.exit(0);
    }
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter path where do you want create file : ");
        String filepath = kb.nextLine();
        int choos =1;
        File file = new File(filepath);
        do
        {
            System.out.println("Choose Option : ");
            System.out.println("1. Make Folder");
            System.out.println("2. Make File");
            System.out.println("3. Exit");
            int choose = kb.nextInt();
            switch (choose)
            {
                case 1 :
                    filepath =  Create_Dir(filepath,file);
                    break;
                case 2 :
                    filepath =  Create_file(filepath,file);
                    break;
                case 3 : exit();
                    break;
            }
        }
        while (choos!=3);

    }

}
