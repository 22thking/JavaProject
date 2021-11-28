package factoryMethod;

import java.util.HashMap;

class DiabetesScreening implements Screening { // 당뇨 검사

    HashMap<String, Integer> data = new HashMap<>();

    @Override
    public HashMap<String, Integer> getData() {
        data.put("공복혈당",0);
        return data;
    }
}
