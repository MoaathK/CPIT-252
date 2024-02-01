package abstractfactorydemo;
public class ITDegree extends Degree{
    public ITDegree(){
        duration = 4;
        fee = 3000;

    }
    public void compute(){
        System.out.println("The IT degree fee is :" +fee *duration +"SAR\n");
    }
}
