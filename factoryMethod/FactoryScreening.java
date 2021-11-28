package factoryMethod;

public class FactoryScreening {

    public static MedicalCheckUp makeMedicalCheckUp(String sMedicalCheckUp) {

        MedicalCheckUp medicalCheckUp = null;
        if (sMedicalCheckUp.equals("SimpleCheckUp")) medicalCheckUp = new SimpleCheckUp();
        else if (sMedicalCheckUp.equals("HighCheckUp")) medicalCheckUp = new HighCheckUp();
        else if (sMedicalCheckUp.equals("AnotherCheckUp")) medicalCheckUp = new AnotherCheckUp();
        return medicalCheckUp;
    }
}
