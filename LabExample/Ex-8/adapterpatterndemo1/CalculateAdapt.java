package adapterpatterndemo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateAdapt extends PayCalculator implements ICalculate{
    @Override
    public void calHourly() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the Employee Name: ");
            String eName = br.readLine();
            System.out.println();

            System.out.print("Enter the Rate per Hour: ");
            int rate = Integer.parseInt(br.readLine());
            System.out.println();

            System.out.print("Enter the number of hours ");
            int hourly = Integer.parseInt(br.readLine());
            setCalc(hourly,rate);
            System.out.println();
            setEmpName(eName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String show() {
        String eName = getEmpName();

        return ("The Employee Name is : "+eName +"\n");
    }
}
