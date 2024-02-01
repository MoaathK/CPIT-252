package courseinfo;
abstract class Course {

    protected int duration;
    protected double fee;
    abstract void getDuration();
    abstract void getFeePerSemester();
    public void calculateTotalFee(){
        System.out.println(duration*fee);
    }
}