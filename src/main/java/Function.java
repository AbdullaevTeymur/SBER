public class Function {
    public static void main(String[] args) {
        int[] array = {-10, 15, 8, 7,12, 5 ,9};
        System.out.println(returned10(array));
    }


    public static int returned10(int[] array) {
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
