//todo: Напишите функцию, меняющую местами значения переменных, не используя временные переменные.

public class ChangeVariablesClass {
    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println("a="+a+", b="+b);
        changeVariables(a,b);
    }


    public static void changeVariables(int a, int b) {
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("a="+a+", b="+b);
    }
}



