package command;

public class DBPostDataOnCommand implements Command {
    private final DBPostData dbPostData;

    public DBPostDataOnCommand(DBPostData dbPostData){
        this.dbPostData = dbPostData;
    }

    @Override
    public void execute() {
        dbPostData.postData();
    }
}
