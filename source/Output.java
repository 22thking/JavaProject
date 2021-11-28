package source;

import java.util.HashMap;
import java.util.Map;

public class Output {
    public void printOptionOne(){
        System.out.println("1. 건강검진 선택 \n2. 건강검진 결과 출력\n3. 종료");
    }
    public void printOptionTwo(){
        System.out.println("1. 일반 건강검진 선택 \n2. 플러스 건강검진 선택\n3. 올-플러스 건강검진 선택");
    }
    public void printHashData(HashMap<String, HashMap<String, Double>> data){
        System.out.println("건강검진 결과\n\n");
        for (Map.Entry<String, HashMap<String, Double>> i: data.entrySet()){
            System.out.println("목표질환: "+i.getKey());
            System.out.println();
            System.out.println("검사 결과: "+ i.getValue());
            System.out.println();
            System.out.println();
        }
    }
}
