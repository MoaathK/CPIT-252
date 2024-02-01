package courseinfo;

/**
 * Admission
 */
public class Admission {

    public Course admittingCourse(String courseName){
        if (courseName == null) {
            return null;
        }
        if (courseName.equalsIgnoreCase("Computer")) {
            return new Computer();
        }
        if (courseName.equalsIgnoreCase("CivilServices")) {
            return new CivilServices();
        }
        if (courseName.equalsIgnoreCase("Health")) {
            return new Health();
        }
        return null;
    }
}