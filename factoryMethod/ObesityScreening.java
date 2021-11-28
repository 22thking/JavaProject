package factoryMethod;

import java.util.HashMap;

class ObesityScreening implements Screening { // 비만 검사

    HashMap<String, Double> data = new HashMap<>();

    @Override
    public HashMap<String, Double> getData() {
        data.put("키",0.0);
        data.put("몸무게",0.0);
        data.put("허리둘레",0.0);
        return data;
    }
}
