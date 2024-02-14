package bridgepatterndemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BridgePatternDemo {
static int choice;
    public static void main(String[] args) throws IOException {
        Switch obj1 =  new Fan();
        Switch obj2 = new Bulb();

        do {
            System.out.print("========Switch Option=======\n");
            System.out.print("      1. Fan.        \n");
            System.out.print("      2. Bulb.        \n");
            System.out.print("      3. Exit.        \n");
            System.out.print("Enter your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            switch (choice){
                case 1: {
                    obj1.switchOn();
                    obj1.switchOff();
                }
                break;
                case 2: {
                    obj2.switchOn();
                    obj2.switchOff();
                }
                break;
                default:{
                    System.out.println("Nothing You Select");
                }
                return;
            }

        }while (choice!=3);
    }
}
