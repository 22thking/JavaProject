package factoryMethod;

public class SimpleCheckUp extends MedicalCheckUp {
    @Override
    public void createProfile() {
        addSection(new HighBloodPressureScreening());
        addSection(new ObesityScreening());
        addSection(new DiabetesScreening());
    }
}
