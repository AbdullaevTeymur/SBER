//todo: 1. Напишите метод, находящий максимальное из двух чисел, не используя операторы if-else
// или любые другие операторы сравнения.


import static java.lang.Math.abs;

public class MaxNumberClass {
    public static void main(String[] args) {
        int a = 0, b = 6;
        System.out.println(maximum(a,b));
    }

    public static int maximum(int a, int b){
       return (a + b + Math.abs(a - b))/2;
    }


}
