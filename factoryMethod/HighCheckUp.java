package factoryMethod;

public class HighCheckUp extends MedicalCheckUp {
    @Override
    public void createProfile() {
        addSection(new HighBloodPressureScreening());
        addSection(new ObesityScreening());
        addSection(new DiabetesScreening());
        addSection(new DyslipidemiaScreening());
    }
}
