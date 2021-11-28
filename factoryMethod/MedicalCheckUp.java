package factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class MedicalCheckUp {
    private final List<Screening> screenings = new ArrayList<>();

    public abstract void createProfile();

    public List<Screening> getScreenings() {
        return screenings;
    }

    protected void addSection(Screening section) {
        screenings.add(section);
    }
}
