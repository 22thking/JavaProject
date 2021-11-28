package factoryMethod;

import java.util.HashMap;

class ObesityScreening implements Screening { // 비만 검사

    HashMap<String, Integer> data = new HashMap<>();

    @Override
    public HashMap<String, Integer> getData() {
        data.put("키",0);
        data.put("몸무게",0);
        data.put("허리둘레",0);
        return data;
    }
}
