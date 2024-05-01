package Example2;

public class MavenProjectMVC {
    public static void main(String[] args) {

        EmployeeM model = retriveEmployee();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();

        controller.setEmployeeName("Yahya");
        System.out.println("\nEmployee Details after updating");
        controller.updateView();

    }
    private static EmployeeM retriveEmployee() {
        EmployeeM employee = new EmployeeM();
        employee.setEmployeeName("Burhan");
        employee.setEmployeeId("11");
        employee.setEmployeeDepartment("Salesforce");
        return employee;

    }
}
