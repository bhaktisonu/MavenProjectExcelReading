package jetbrains;

import java.io.FileInputStream;
import java.io.File;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
//import org.apache.commons.io.output.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Excel Reading ");

        ReadExcel rc=new ReadExcel();
        WriteTextFile wt =new WriteTextFile();
        ArrayList<Student> arrStudent=new ArrayList<Student>();
        arrStudent= rc.ReadExcelFile();
        System.out.println("Writing array");
        wt.WriteDataInTextFile(arrStudent);
       // for (Student ss1 : arrStudent )
       // {
           // int rollno= Integer.valueOf(Double.valueOf(  ss1.getRollNo()));
            //int sclass = Integer.valueOf(String.valueOf(  ss1.getsClass()));

           // System.out.println(  ss1.getRollNo()  +";"+ ss1.getStudentName() +";"+ ss1.getsClass() +";"+ ss1.getUserName() +";"+ ss1.getPassword()  );

        //}

        System.out.printf(" Finished Reading");
    }


}