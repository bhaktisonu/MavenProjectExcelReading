package jetbrains;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.text.html.parser.Parser;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class ReadExcel {

    public   ArrayList<Student> ReadExcelFile()
    {
        ArrayList <Student> arrStudent=new ArrayList<Student>();
        try {

            FileInputStream fs = new FileInputStream(new File("D:\\StudentDetails.xlsx"));

            XSSFWorkbook wb= new XSSFWorkbook(fs);
            XSSFSheet sheet =wb.getSheetAt(0);

            XSSFSheet ss= wb.getSheetAt(0) ;
            for (int i=1;i <= ss.getLastRowNum() ;i++)
            {
                Row r1 = ss.getRow(i);
                Student s1=new Student ();
                String  rollno = String .valueOf( r1.getCell(0));

                s1.setRollNo(Double.parseDouble(rollno)) ;
                s1.setStudentName(String.valueOf(r1.getCell(1)));
                s1.setsClass(Double.parseDouble(String.valueOf(r1.getCell(2))));
                s1.setUserName(String.valueOf(r1.getCell(3)));
                s1.setPassword(String.valueOf(r1.getCell(4)));
                arrStudent.add(s1);

               // System.out.println( r1.getCell(0) +";"+ r1.getCell(1)+";"+r1.getCell(2) +";"+r1.getCell(3) +";"+r1.getCell(4)   );

            }

           // return arrStudent;
        }
        catch(Exception ex)
        {
            System.out.println("Error reading excel file.");
            ex.printStackTrace();
        }


        return arrStudent;
    }

}
