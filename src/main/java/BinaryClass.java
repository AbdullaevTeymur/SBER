import static java.lang.Math.log10;

//todo: реализуйте функцию, возвращающую двоичное представление числа n(n>=0). например, 101 - это двоичное
// представление числа 5. метод должен иметь сигнатуру string tobinary(int number)

public class BinaryClass {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Число " + n + " в двоичной системе исчисления = " + BinaryClass.toBinary(n));
    }

    /**
     * Перевод числа из десятичной системы исчисления в двоичную
     *
     * @param number - целое число в десятичной системе исчисления >=0 <=2147483647
     * @return - двоичное число в виде строки
     */

    public static String toBinary(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number > 0) {
            double log = log10(number) / log10(2);
            int maxdegree = (int) log;
            for (int i = maxdegree; i >= 0; i--) {
                int numberTwo = (int) Math.pow(2, i);
                if ((number - numberTwo) >= 0) {
                    stringBuilder.append("1");
                    number -= numberTwo;
                } else {
                    stringBuilder.append("0");
                }
            }
        } else if (number == 0) {
            stringBuilder.append("0");
        }
        return stringBuilder.toString();
    }
}