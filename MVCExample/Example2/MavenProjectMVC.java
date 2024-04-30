public class MavenProjectMVC {
    public static void main(String[] args) {
        //EmployeeM model = retriveEmployeeFromDatabase();
        EmployeeM model = new EmployeeM();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
    }
}
