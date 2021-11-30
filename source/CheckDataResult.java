package source;

import java.util.HashMap;
import java.util.Map;

public class CheckDataResult {
    public int checkHashData(String screeningName, HashMap<String,Double> data){
        int checkNumber = 0; // //0 정상, 1 주의, 2 질환의심
        switch (screeningName){
            case "ObesityScreening":
                checkNumber = obesityScreeningCheck(data);
                break;
            case "HighBloodPressureScreening":
                checkNumber = highBloodPressureScreeningCheck(data);
                break;
            case "DiabetesScreening":
                checkNumber = diabetesScreeningCheck(data);
                break;
            case "AnemiaScreening":
                checkNumber = anemiaScreeningCheck(data);
                break;
            case "DyslipidemiaScreening":
                checkNumber = dyslipidemiaScreening(data);
                break;
        }
        return checkNumber;
    }

    private int obesityScreeningCheck(HashMap<String, Double> data){
        double height = data.get("키")/100;
        double weight = data.get("몸무게");
        double bmi = weight / (height * height);
        System.out.println("BMI: "+bmi);
        if(bmi >18.5 && bmi<24.9)
            return 0;
        else if(bmi > 30)
            return 2;
        else return 1;
    }
    private int highBloodPressureScreeningCheck(HashMap<String, Double> data){
        double systolic = data.get("수축기");
        double diastolic = data.get("이완기");
        if(systolic < 120 && diastolic<80)
            return 0;
        else if (120 < systolic && systolic < 139 || 80 <=diastolic && diastolic < 90)
            return 1;
        else if (90<=diastolic||140<=systolic)
            return 2;
        return -1;
    }
    private int diabetesScreeningCheck(HashMap<String, Double> data){
        double fastingBloodSugar = data.get("공복혈당");
        if (fastingBloodSugar < 100)
            return 0;
        else if(fastingBloodSugar <125)
            return 1;
        else return 2;
    }

    private int anemiaScreeningCheck(HashMap<String, Double> data){
        double hemoglobin = data.get("혈색소");
        if (hemoglobin < 12)
            return 2;
        else if(hemoglobin < 13)
            return 1;
        else return 0;
    }
    private int dyslipidemiaScreening(HashMap<String, Double> data){
        double cholesterol = data.get("총콜레스트롤");
        double HDL = data.get("HDL콜레스테롤");
        double triglycerides = data.get("중성지방");
        double LDL = data.get("LDL콜레스테롤");

        if (cholesterol>=240 || HDL <40 || triglycerides >= 200 || LDL >=160)
            return 2;
        else if(cholesterol<240 && cholesterol >= 200 || HDL >=40 && HDL < 60 || triglycerides < 200 && triglycerides >= 150|| LDL <160&&LDL>=130)
            return 1;
        else return 0;

    }
}


