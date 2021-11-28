package source;

import factoryMethod.MedicalCheckUp;
import factoryMethod.Screening;

import java.util.HashMap;

public class HashData {

    private HashMap<String, HashMap<String, Double>> Data =  new HashMap<>();

    public void checkUpHashMapCollect(MedicalCheckUp medicalCheckUp){
        Data = new HashMap<>();

        for (Screening i: medicalCheckUp.getScreenings()) {
            HashMap<String, Double> get = i.getData();
            String name = i.getClass().toString();
            name = name.substring(20);
            hashMapCollect(get, name);
        }
    }

    public void hashMapCollect(HashMap<String, Double> data, String name){
        Data.put(name,data);
    }

    public HashMap<String, HashMap<String, Double>> getData() {
        return Data;
    }

}
