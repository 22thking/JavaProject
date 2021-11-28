import java.util.Scanner;

public class Input {

    public Object filteringInput(Object input){
        Scanner scanner = new Scanner(System.in);
        String check = input.getClass().getName();
        while (true) {
            try{
                switch (check){
                    case "java.lang.Integer":
                        System.out.println("정수를 입력하세요");
                        input = scanner.nextInt();
                        break;
                    case "java.lang.Double":
                        System.out.println("실수를 입력하세요");
                        input = scanner.nextDouble();
                        break;
                    case "java.lang.String":
                        System.out.println("문자열을 입력하세요");
                        input = scanner.nextLine();
                        break;
                    case "java.lang.Character":
                        System.out.println("문자를 입력하세요");
                        input = scanner.nextLine();
                        if(((String) input).length()>1){
                            throw new Exception();
                        }
                        break;
                }
            }catch (Exception e){
                scanner = new Scanner(System.in);
                System.out.println("잘못된 입력값입니다.");
                continue;
            }
            break;
        }
        return input;
    }
}
