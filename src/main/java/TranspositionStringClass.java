import java.util.HashMap;

//todo:3. Реализуйте метод, определяющий, является ли одна строка перестановкой другой.Под перестановкой
// понимаем любое изменение порядка символов. Регистр учитывается, пробелы являются существенными

public class TranspositionStringClass {
    public static void main(String[] args) {
        String one = " 12 ", two = "2 1 ";
        System.out.println(isTranspositionString(one, two));
    }


    /**
     * Определяет, является ли одна строка перестановкой другой
     *
     * @param one - первая строка
     * @param two - вторая строка
     * @return - результат, является ли одна строка перестановкой другой
     */

    public static boolean isTranspositionString(String one, String two) {
        if (one.length() == two.length()) {
            HashMap<String, Integer> firstmap = stringToMap(one);
            HashMap<String, Integer> secondmap = stringToMap(two);
            return (firstmap.equals(secondmap));
        } else {
            return false;
        }
    }

    public static HashMap<String, Integer> stringToMap(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] massive = str.split("");
        for (String i : massive) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }
}
