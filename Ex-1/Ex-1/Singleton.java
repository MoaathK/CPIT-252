public class Singleton {
    public static void main(String[] args) {
        SingletonClass instance1 = SingletonClass.getInstance();

        SingletonClass instance2 = SingletonClass.getInstance();

        System.out.println("Instance1 hash: " +instance1.hashCode());
        System.out.println("Instance2 hash: " +instance2.hashCode());
        

    }
}
