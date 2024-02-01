package abstractfactorydemo;

public class CSDegree extends Degree {
    public CSDegree(){
        duration = 4;
        fee = 6000;

    }

    @Override
    void compute() {
        System.out.print("The CS Degree fee is "+duration*fee +"SAR\n");
    }
    
}
