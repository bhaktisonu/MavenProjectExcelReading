package jetbrains;

import java.io.*;
import java.util.ArrayList;

public class WriteTextFile {


    public void WriteDataInTextFile(ArrayList<Student> arrStudents)
    {
        try
        {
            boolean isSucess=false;
            String stringSeparator="^^^^";
            File fn =new File("D:\\ExcelData.txt");
            FileOutputStream fos= new FileOutputStream(fn);

            if (fn.exists())
            {
                fn.delete();
               isSucess= fn.createNewFile();
                System.out.println("File Replaced");
            }
            else
            {
                isSucess= fn.createNewFile();
                System.out.println("File Created");
            }

            BufferedWriter writer= new BufferedWriter(new FileWriter(fn));

            for (Student ss: arrStudents) {

                writer.write("\n" +ss.getRollNo() + stringSeparator +ss.getStudentName() +stringSeparator+ ss.getsClass() +stringSeparator+ ss.getUserName() +stringSeparator+ ss.getPassword() );

            }
            writer.close();
            System.out.println("File Writing completed");



        }
        catch(Exception ex)
        {
            System.out.println("Error in writing text file.");
            ex.printStackTrace();

        }

    }

}
