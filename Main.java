import command.Button;
import command.Command;
import command.DBGetData;
import command.DBGetDataOnCommand;
import factoryMethod.FactoryScreening;
import factoryMethod.MedicalCheckUp;
import factoryMethod.Screening;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MedicalCheckUp medicalCheckUp = FactoryScreening.makeMedicalCheckUp("AnotherCheckUp");
        medicalCheckUp.createProfile();
        HashMap<String,Integer> Data =  new HashMap<>();
        for (Screening i: medicalCheckUp.getScreenings()) {
            HashMap<String,Integer> get = i.getData();
            for (Map.Entry<String, Integer> j :get.entrySet()){
                Data.put(j.getKey(), j.getValue());
            }
        }
        System.out.println(Data);

        DBGetData dbGetData = new DBGetData();
        Command dBGetDataOnCommand = new DBGetDataOnCommand(dbGetData);

        Button button1 = new Button(dBGetDataOnCommand);
        button1.pressed();


    }
}
