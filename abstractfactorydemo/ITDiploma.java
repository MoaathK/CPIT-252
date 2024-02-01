package abstractfactorydemo;

public class ITDiploma extends Diploma {
    public ITDiploma(){
        duration = 3;
        fee = 5000;

    }
    void compute(){
        System.out.print("The IT Diploma fee is "+duration*fee +"SAR\n");
    }
}
