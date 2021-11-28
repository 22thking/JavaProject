import java.util.HashMap;
import java.util.Map;

public class HashData {

    HashMap<String,Integer> Data =  new HashMap<>();

    public void hashMapCollect(HashMap<String,Integer> data){
        for (Map.Entry<String, Integer> j :data.entrySet()){
            Data.put(j.getKey(),j.getValue());
        }
    }

    public HashMap<String, Integer> getData() {
        return Data;
    }

    public void setData(HashMap<String, Integer> data) {
        Data = data;
    }
}
