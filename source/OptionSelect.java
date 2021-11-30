package source;

import command.*;
import factoryMethod.FactoryScreening;
import factoryMethod.MedicalCheckUp;

import java.util.HashMap;

public class OptionSelect{ //사용자가 선택할 수 있는 선택지 클래스

    private Input input = new Input();
    private Output output = new Output();
    private HashData hashData = new HashData();

    public boolean callOption(){

        DBGetData dbGetData = new DBGetData();
        Command dBGetDataOnCommand = new DBGetDataOnCommand(dbGetData);

        DBPostData dbPostData = new DBPostData();
        Command dBPostDataOnCommand = new DBPostDataOnCommand(dbPostData);

        Button button1 = new Button(dBGetDataOnCommand);
        Button button2 = new Button(dBPostDataOnCommand);
        output.printOptionOne();
        int getNumber = input.filteringSelectInput(1,3);
        switch (getNumber){
            case 1:
                button2.pressed(0);
                break;
            case 2:
                System.out.println("PINumber 를 입력하세요. (1000 ~2000)");
                int pINumber = input.filteringSelectInput(1000,2000);
                button1.pressed(pINumber);
                break;
            case 3:
                return false;
            default:
                throw new IllegalStateException("Unexpected value: " + getNumber);
        }
        return true;
    }

    public HashMap<String, HashMap<String, Double>> callCheckUp(){
        MedicalCheckUp medicalCheckUp;
        output.printOptionTwo();
        int getNumber = input.filteringSelectInput(1,3);
        switch (getNumber){
            case 1:
                medicalCheckUp = FactoryScreening.makeMedicalCheckUp("SimpleCheckUp");
                break;
            case 2:
                medicalCheckUp = FactoryScreening.makeMedicalCheckUp("HighCheckUp");
                break;
            case 3:
                medicalCheckUp = FactoryScreening.makeMedicalCheckUp("AnotherCheckUp");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + getNumber);
        }
        medicalCheckUp.createProfile();
        hashData.checkUpHashMapCollect(medicalCheckUp);
        HashMap<String, HashMap<String, Double>> data = hashData.getData();
        input.hashMapInput(data);
        return data;
    }

}
