package command;

import source.OptionSelect;

public class DBPostData {

    OptionSelect optionSelect = new OptionSelect();

    public void postData(int pINumber){
        //일련 번호 전송 필요
        optionSelect.callCheckUp();
    }
}
