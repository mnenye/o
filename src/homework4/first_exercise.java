package homework4;

import java.util.*;

public class first_exercise {
    public static void main(String[] args) {
        //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        String[] massiv1 = {
                "absolutely",
                "useless",
                "war",
                "absolutely",
                "disgusting",
                "decision",
                "no",
                "war",
                "peace",
                "to",
                "Ukraine"
        };

        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем)
        Set<String> firstpart = new HashSet<>(Arrays.asList(massiv1));
        System.out.println(firstpart);
        System.out.println("");

        //Посчитать, сколько раз встречается каждое слово.
        Map<String, Integer> secondpart = new HashMap<>();
        for (String word : massiv1) {
            secondpart.put(word, secondpart.getOrDefault(word, 0) + 1);
        }
        System.out.println(secondpart);
        System.out.println("");
    }
}
