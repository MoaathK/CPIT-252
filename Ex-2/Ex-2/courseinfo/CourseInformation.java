package courseinfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CourseInformation {
    public static void main(String[] args) throws IOException{
        Admission newApplication = new Admission();
        System.out.print("Enter the course you are trying to admit in: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String courseName = br.readLine();
        Course obj = newApplication.admittingCourse(courseName);
        System.out.println("For "+ courseName+ " the required duration is ");
        obj.getDuration();
        System.out.println("For "+courseName+" the required fee is: ");
        obj.getFeePerSemester();
        System.out.println("The total fee is ");
        obj.calculateTotalFee();

    }
}
