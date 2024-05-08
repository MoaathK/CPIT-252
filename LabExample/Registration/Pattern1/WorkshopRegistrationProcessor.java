package Pattern1;

public class WorkshopRegistrationProcessor extends RegistrationProcessor{
    @Override
    public void collectData() {
        System.out.println("Collecting data from Workshop registration. ");
    }

    @Override
    public boolean validateData() {
        System.out.println("");
        return false;
    }

    @Override
    public void register() {

    }
}
