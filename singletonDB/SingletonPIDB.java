package singletonDB;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;

public class SingletonPIDB {

    private HashMap<Integer,HashMap<String, HashMap<String, Double>>> PIData = new HashMap<>();  //Integer : 환자 번호

    private int PINumber = 1000;

    public HashMap<String, HashMap<String, Double>> postPIDBData(int PINumber){
        if(PIData.containsKey(PINumber)){
            return PIData.get(PINumber);
        }else
            return null;
    }

    public int getPIDBData(HashMap<String, HashMap<String, Double>> getData){
        try{
           PIData.put(PINumber,getData);
        } catch (Exception e){
            System.out.println("데이터 저장 실패"+e);
        }
        return PINumber++;
    }

    //private construct
    public SingletonPIDB() {
        //System.out.println("생성");
    }

    private static class InnerInstanceClazz {
        private static final SingletonPIDB instance = new SingletonPIDB();
    }

    public static SingletonPIDB getInstance() {
        return InnerInstanceClazz.instance;
    }
}
