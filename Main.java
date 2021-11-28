import source.Input;
import source.OptionSelect;
import source.Output;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Output output = new Output();
        OptionSelect optionSelect = new OptionSelect();
        HashMap<String, HashMap<String, Double>> data = optionSelect.callCheckUp();
        //optionSelect.callOption();
        output.printHashData(data);
    }
}
