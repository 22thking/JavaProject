package source;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Input {

    int filteringSelectInput(int min, int max) {
        int inputSelect = 0;
        while (true) {
            inputSelect = (int) filteringInput(inputSelect);

            if (!(inputSelect >= min && inputSelect <= max)){
                System.out.println(min + " 에서 " + max + " 사이값을 입력하세요.");
                continue;
            }
            break;
        }
        return inputSelect;
    }
    private double filteringSelectInput(double min, double max) {
        double inputSelect = 0.0;
        while (true) {
            System.out.println(min + " 에서 " + max + " 사이값을 입력하세요.");
            inputSelect = (double) filteringInput(inputSelect);

            if (!(inputSelect >= min && inputSelect <= max)) {
                continue;
            }
            break;
        }
        return inputSelect;
    }
    public void hashMapInput(HashMap<String, HashMap<String, Double>> data){

        for (String key:data.keySet()){
             for (Map.Entry<String, Double> j :data.get(key).entrySet()){
                 System.out.println("\n"+j.getKey() + " 데이터 입력");
                 Double input = filteringSelectInput(0.0,1000.0);
                 j.setValue(input);
             }
        }
    }

    public Object filteringInput(Object input){
        Scanner scanner = new Scanner(System.in);
        String check = input.getClass().getName();
        while (true) {
            try{
                switch (check){
                    case "java.lang.Integer":
                        //System.out.println("정수를 입력하세요");
                        input = scanner.nextInt();
                        break;
                    case "java.lang.Double":
                        //System.out.println("실수를 입력하세요");
                        input = scanner.nextDouble();
                        break;
                    case "java.lang.String":
                        //System.out.println("문자열을 입력하세요");
                        input = scanner.nextLine();
                        break;
                    case "java.lang.Character":
                        //System.out.println("문자를 입력하세요");
                        input = scanner.nextLine();
                        if(((String) input).length()>1){
                            throw new Exception();
                        }
                        break;
                }
            }catch (Exception e){
                scanner = new Scanner(System.in);
                System.out.println("잘못된 입력값입니다.");
                continue;
            }
            break;
        }
        return input;
    }
}
