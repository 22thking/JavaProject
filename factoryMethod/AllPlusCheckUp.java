package factoryMethod;

public class AllPlusCheckUp extends MedicalCheckUp {
    @Override
    public void createProfile() {
        addSection(new HighBloodPressureScreening());
        addSection(new ObesityScreening());
        addSection(new DiabetesScreening());
        addSection(new AnemiaScreening());
        addSection(new DyslipidemiaScreening());
    }
}
