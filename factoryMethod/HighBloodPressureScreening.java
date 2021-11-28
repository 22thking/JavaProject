package factoryMethod;

import java.util.HashMap;

class HighBloodPressureScreening implements Screening { // 혈압 검사

    HashMap<String, Integer> data = new HashMap<>();

    @Override
    public HashMap<String, Integer> getData() {
        data.put("이완기",0);
        data.put("수축기",0);
        return data;
    }
}
