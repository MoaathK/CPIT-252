package Pattern1;

public class webinarRegistrationProcessor extends RegistrationProcessor{
    @Override
    public void collectData() {
        System.out.println("Collecting webinar registration data");
    }

    @Override
    public boolean validateData() {
        return false;
    }

    @Override
    public void register() {

    }
}
