public class OptionSelect{ //사용자가 선택할 수 있는 선택지 클래스

    Input input = new Input();
    Output output = new Output();

    private int filteringSelect(int min,int max) {
        int inputSelect = 0;
        while (true) {
            inputSelect = (int) input.filteringInput(inputSelect);

            if (!(inputSelect >= min && inputSelect <= max)) {
                System.out.println(min + " 에서 " + max + " 사이값을 입력하세요.");
                continue;
            }
            break;
        }
        return inputSelect;
    }

    public void callOption(){
        output.PrintOptionOne();
        int getNumber = filteringSelect(1,3);
        switch (getNumber){

        }
    }


}
