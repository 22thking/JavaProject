package factoryMethod;

import java.util.HashMap;

class DyslipidemiaScreening implements Screening { // 이상혈증 검사

    HashMap<String, Integer> data = new HashMap<>();

    @Override
    public HashMap<String, Integer> getData() {
        data.put("총콜레스트롤",0);
        data.put("HDL콜레스테롤",0);
        data.put("중성지방",0);
        data.put("LDL콜레스테롤", 0);
        return data;
    }
}
