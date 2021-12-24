// TODO:  Реализовать функцию которая для данного массива целых
//  чисел(Integer) возвращает число наиболее близкое к 10,
//  если таких чисел два(н-р 8,12) то возвращать больше из них


public class NumberCloseTo10 {
    public static void main(String[] args) {
        int[] array = {-10, 15, 8, 7, 12, 5, 9};
        System.out.println(numberCloseTo10(array));
    }


    public static int numberCloseTo10(int[] array) {
        int a = Integer.MAX_VALUE;
        int result = 0;
        for (int i : array) {
            if (Math.abs(10 - i) <= a && (i > result | Math.abs(10 - i) < a) ) {
                    a = Math.abs(10 - i);
                    result = i;
            }
        }
        return result;
    }
}
