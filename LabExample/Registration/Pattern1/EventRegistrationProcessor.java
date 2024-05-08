package Pattern1;

public class EventRegistrationProcessor extends RegistrationProcessor {


    @Override
    public void collectData() {
        System.out.println("Collecting data for event registration. ");
    }

    @Override
    public boolean validateData() {
        System.out.println("`validating event registration data. ");

        return true;
    }

    @Override
    public void register() {
        System.out.println("Registering event .");

    }
}
