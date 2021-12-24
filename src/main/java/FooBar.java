import java.lang.reflect.Array;

//todo: Реализуйте функцию, которая для заданного числа (int) печатает
//    «foo», если это число делится на 3 без остатка,
//     печатает «bar», если это число делится на 5 без остатка, печатает «foobar», если это число делится на
//     15 без остатка, печатает само число в остальных случаях.
public class FooBar {

    public static void main(String[] args) {
        fooBarPrint(30);
    }

    public static void fooBarPrint(Integer number) {
        try {
            System.out.println(fooBar(number));
        } catch (NullPointerException e) {
            System.out.println("Значение предаваемого числа в аргумент метода равно null");
        }
    }

    public static String fooBar(Integer number) {
        StringBuilder answer = new StringBuilder();
        if (number % 5 == 0) {
            answer.append("foo");
        }
        if (number % 3 == 0) {
            answer.append("bar");
        }
        if (answer.toString().equals("")) {
            return number.toString();
        } else {
            return answer.toString();
        }
    }
}
