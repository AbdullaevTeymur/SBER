import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OnceTests {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        try {
            Object [] objects= new Object[3];
            objects[0]=null;
            System.out.println(objects[0]);
        }
        catch (Exception exception){
            System.out.println("1");
        }
        finally {
            System.out.println("2");
        }
        System.out.println("Задача 2");
        System.out.println(false?false:true);

        System.out.println("Задача 3");
        int i3=10;
        System.out.println(i3++);
        System.out.println(i3);

        System.out.println("Задача 4");


        System.out.println("Задача 5");
        boolean t = true;
        boolean f = false;
        System.out.println(f||t&&1+1==2);
        System.out.println(t&&f!=false);

        System.out.println("Задача 6");
        System.out.println(15%4 *2);

        System.out.println("Задача 7");
        Set<String> someSet = new HashSet<>();
        someSet.add("Test1");
        someSet.add("Test2");
        someSet.add("Test3");
        someSet.add(null);
        System.out.println(someSet);

        System.out.println("Задача 8");
        Map<String,String> someMap = new HashMap<>();
        someMap.put("Test1","1");
        someMap.put("Test2","2");
        someMap.put("Test3","3");
        someMap.put(null,null);
        System.out.println(someMap);

        System.out.println("Задача 9");
        int[][] arr1 = new int[10][20];
        System.out.println(arr1.length);

        System.out.println("Задача 10");
        System.out.println(1+2+"3"+4);

        System.out.println("Задача 11");
        byte b = 127;
        b++;
        System.out.println(b);

        System.out.println("Задача 12");
        String[] arr2=new String[0];
        arr2[0]="test1";
        System.out.println(arr2.length);
    }
}
