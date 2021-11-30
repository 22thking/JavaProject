import source.OptionSelect;
import source.Output;

public class Main {
    public static void main(String[] args) {
        Output output = new Output();
        OptionSelect optionSelect = new OptionSelect();

        output.printStart();
        while (true){
            if (!optionSelect.callOption())
                break;
        }
    }
}
