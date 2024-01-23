import java.util.Scanner;

public class Calculator {
    private int num1;
    private char sign;
    private int num2;
    int result;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int calculate() {
        switch(sign) {
            case '+' : 
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
            case '/' :
                return num1 / num2;
            case '%' :
                return num1 % num2;
            case '^' :
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;
            default : 
                System.out.println("Неправильный знак математической операции.");
                break;
        }
        return result;
    }
}