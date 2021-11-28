package factoryMethod;

import java.util.HashMap;

public class AnemiaScreening implements Screening{ //빈혈 검사

    HashMap<String, Integer> data = new HashMap<>();

    @Override
    public HashMap<String, Integer> getData() {
        data.put("혈색소",0);
        return data;
    }
}
