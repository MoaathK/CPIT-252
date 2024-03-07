package facadepatternclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternDemo1 {
    public static int choice;
    public static void main(String[] args) throws IOException {
        do {
            System.out.println("========= PLan Type===========");
            System.out.println("           1.Domestic Plan       ");
            System.out.println("           2.Commercial Plan       ");
            System.out.println("           3.Institutional Plan       ");
            System.out.println("           4.Exit           ");
            System.out.print("Enter Your choice:  ");
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            PLanKeeper planObj = new PLanKeeper();
            switch (choice){
                case 1:
                {
                    planObj.domesticRate();
                }
                break;
                case 2:
                {
                    planObj.commercialRate();
                }
                break;
                case 3:
                {
                    planObj.institutionalRate();
                }
                break;
                default:
                {
                    System.out.println("You Select Nothing");
                }
                return;
            }
        }while (choice!=4);
    }
}
