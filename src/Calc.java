import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        double n1 = getNumb();
        double n2 = getNumb();
       char op  = getOp();
        double result = calc (n1, n2, op);
        System.out.println("Итого: "+result);

       // System.out.println("Введи число");
        //double a = Double.parseDouble(reader.readLine());
        //System.out.println("Введите операцию. Пожалуйста укажите один из символов: + , - , * или /");

    }

    private static double calc(double n1, double n2, char op) throws IOException {
        double result;
        switch (op){
            case '+':
                result = n1+n2;
                break;
            case '-':
                result = n1-n2;
                break;
            case '*':
                result = n1*n2;
                break;
            case '/':
                result = n1/n2;
                break;
            default:
                System.out.println("Операция указана не верно. Повторите ввод данных.");
                result = calc(n1, n2, getOp());
        }
        return result;
    }

    private static char getOp() throws IOException {
        char op;
        System.out.println("Введите операцию. Пожалуйста укажите один из символов: + , - , * или /");
        while (true) {
            String line = reader.readLine();
            if (isChar(line)){
                op = line.charAt(0);
                break;
            } else {
                System.out.println("Вы ввели неверную операцию. Пожалуйста укажите один из символов: + , - , * или /");
            }
        }
        return op;
    }

    private static double getNumb() throws IOException {
        System.out.println("Введи число");

        double n;
        while (true){
            String line = reader.readLine();

            if (isNumb(line)) {
                n = Double.parseDouble(line);
                break;
            } else {
                System.out.println("Ошибка вы ввели не число, попробуйте еще раз");
            }
        }

        return n;
    }
    private static boolean isChar (String testString){
        try {
            testString.charAt(0);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    private static boolean isNumb(String testLine){
        try {
            Double.parseDouble(testLine);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
