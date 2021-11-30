package command;

import singletonDB.SingletonPIDB;
import source.OptionSelect;

public class DBPostData {

    OptionSelect optionSelect = new OptionSelect();

    public void postData(int pINumber){
        SingletonPIDB singletonPIDB = SingletonPIDB.getInstance();
        System.out.println("\n----PINumber 는 "+singletonPIDB.getPIDBData(optionSelect.callCheckUp())+" 입니다.----\n");
    }
}
