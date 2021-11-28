package factoryMethod;

import java.util.HashMap;

class DyslipidemiaScreening implements Screening { // 이상혈증 검사

    HashMap<String, Double> data = new HashMap<>();

    @Override
    public HashMap<String, Double> getData() {

        data.put("총콜레스트롤",0.0);
        data.put("HDL콜레스테롤",0.0);
        data.put("중성지방",0.0);
        data.put("LDL콜레스테롤", 0.0);
        return data;
    }
}
