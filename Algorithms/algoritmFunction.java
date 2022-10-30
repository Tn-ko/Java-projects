package Algorithms;
import java.util.*;

public class algoritmFunction {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 3, 96);

        ArrayDeque<String> graph = new ArrayDeque<>();
        graph.add("Me");
        graph.add("Me2");
        graph.add("Me3");
        graph.add("Me4");
        graph.add("Me5");
        graph.add("Me6");
        System.out.println((graph));

        while (graph.peek() != null) {
            String name = graph.poll();
            if (isSeller(name)) {
                System.out.println("This is a mango seller");
                return;
            }
            if (graph.peek() == null)
                System.out.println("There is no any sellers");
        }
    }
    public static boolean isSeller(String name) {
        return name.endsWith("m");
    }
    public static String coutdown(int i) {
        String n = "goodbye";
        while (i >= 0) {//базовый случай функции
            System.out.println(i--);
        }
        return n;
    }
    // операции со списками
    public static int countElements(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
        }
        return count;
    }

    //рекурсивный путь для тех, кто хочет помучиться или задание от Бхарговой
    public static int recursiveCount(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return 1 + recursiveCount(list.subList(1, list.size()));
    }
}











