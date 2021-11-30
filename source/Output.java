package source;

import java.util.HashMap;
import java.util.Map;

public class Output {
    public void printOptionOne(){
        System.out.println("1. 건강검진 선택 \n2. 건강검진 결과 출력\n3. 종료");
        System.out.print("입력: ");
    }
    public void printStart(){
        System.out.println("------건강검진 관리 프로그램 시작------\n\n");
    }
    public void printOptionTwo(){
        System.out.println("\n1. 일반 건강검진 선택 \n2. 플러스 건강검진 선택\n3. 올-플러스 건강검진 선택");
        System.out.print("입력: ");
    }
    public void printHashData(HashMap<String, HashMap<String, Double>> data){
        if (data == null){
            System.out.println("존재하지 않는 PINumber 입니다.");
            return;
        }
        CheckDataResult checkDataResult = new CheckDataResult();

        System.out.println("건강검진 결과\n\n");
        for (Map.Entry<String, HashMap<String, Double>> i: data.entrySet()){
            System.out.println("목표질환: "+i.getKey());
            System.out.println();
            System.out.println("검사 결과: "+ i.getValue());
            System.out.println();
            int checkNumber = checkDataResult.checkHashData(i.getKey(),i.getValue());
            if(checkNumber == 0 )
                System.out.println("(1단계) 정상입니다.");
            else if (checkNumber == 1)
                System.out.println("(2단계) 주의 단계입니다.");
            else if(checkNumber==2)
                System.out.println("(3단계) 질환이 의심됩니다.");

            System.out.println();
        }
    }
}
