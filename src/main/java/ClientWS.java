import proxy.StudentService;
import proxy.StudentServiceService;

import java.sql.SQLOutput;

public class ClientWS {
    public static void main(String[] args) {
        StudentService studentService=new StudentServiceService().getStudentServicePort();
        {
            System.out.println(studentService.getAllStudents());
            System.out.println(studentService.getStudmetsBycin("P7899"));
            System.out.println(studentService.getLimitStudents(2));
        }
    }
}
