package factoryMethod;

import java.util.HashMap;

class HighBloodPressureScreening implements Screening { // 혈압 검사

    HashMap<String, Double> data = new HashMap<>();

    @Override
    public HashMap<String, Double> getData() {
        data.put("이완기",0.0);
        data.put("수축기",0.0);
        return data;
    }
}
