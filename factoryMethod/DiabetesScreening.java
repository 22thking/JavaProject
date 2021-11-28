package factoryMethod;

import java.util.ArrayList;
import java.util.HashMap;

class DiabetesScreening implements Screening { // 당뇨 검사

    HashMap<String, Double> data = new HashMap<>();

    @Override
    public HashMap<String, Double> getData() {
        data.put("공복혈당",0.0);
        return data;
    }
}
