package Prototypedemo;

 class EmployeeRecord implements Prototype{
    private int id;
    private String name;
    private double salary;
    public EmployeeRecord(){
        System.out.println(" Employee Records");
        System.out.println("----------------------");
        System.out.println("Eid"+"\t"+"Ename"+"\t"+"Esalary");
    }
    public EmployeeRecord(int id, String name, double salary){
        this();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void showRecord(){
        System.out.println(id+"\t"+name+"\t"+salary);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id,name,salary);
    }
}
