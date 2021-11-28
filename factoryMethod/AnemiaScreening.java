package factoryMethod;

import java.util.HashMap;

public class AnemiaScreening implements Screening{ //빈혈 검사

    HashMap<String, Double> data = new HashMap<>();

    @Override
    public HashMap<String, Double> getData() {
        data.put("혈색소",0.0);
        return data;
    }
}
