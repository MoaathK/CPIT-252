package abstractfactorydemo;

abstract class Diploma {
    int fee;
    int duration;
    void compute(){
        System.out.println(fee*duration);
    }
    
}
