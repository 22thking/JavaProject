package command;

public class DBGetDataOnCommand implements Command {
    private final DBGetData dbGetData;

    public  DBGetDataOnCommand(DBGetData dbGetData){
        this.dbGetData = dbGetData;
    }

    @Override
    public void execute() {
        dbGetData.getData();
    }
}
