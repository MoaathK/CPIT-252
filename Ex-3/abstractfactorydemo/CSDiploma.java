package abstractfactorydemo;

public class CSDiploma extends Diploma {
    public CSDiploma(){
        duration = 3;
        fee = 8000;
    }
    public void compute(){
        System.out.print("The CS Diploma fee is "+duration*fee +"SAR\n");
    }
}
