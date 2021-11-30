package command;

import singletonDB.SingletonPIDB;
import source.Output;

public class DBGetData {

    public void getData(int pINumber){
        Output output = new Output();
        SingletonPIDB singletonPIDB = SingletonPIDB.getInstance();
        output.printHashData(singletonPIDB.postPIDBData(pINumber));
    }

}
