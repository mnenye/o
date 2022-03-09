package homework4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// 2.Написать простой класс «Телефонный Справочник»
public class telephone_directory {
    HashMap<String, ArrayList<String>> telephone_directory = new HashMap<>();
    public static void main(String[] args) {
       //который хранит в себе список фамилий и телефонных номеров.
        //с помощью метода add() можно добавлять записи

        telephone_directory numbers = new telephone_directory();
                numbers.add("Арбузова", "+7 (903) 419 34-15");
                numbers.add("Барикадзе", "+7 (999) 567 67-99");
                numbers.add("Барикадзе", "+7 (978) 900 48-12");
                numbers.add("Ванямова", "+7 (985) 231 87-88");
                numbers.add("Давыдов", "+7 (911) 982 23-24");
                numbers.add("Егорова", "+7 (961) 342 88-21");
                numbers.add("Жарков", "+7 (956) 673 45-55");
                numbers.add("Камалова", "+7 (925) 249 88-32");
                numbers.add("Камалова", "+7 (955) 697 66-22");

        for (String x : numbers.get("Камалова")) {
            System.out.println("Камалова" + " телефон: " + x);
        }

        // а с помощью метода get() искать номер телефона по фамилии.
        // Следует учесть,
        // что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.


    }

    private String[] get(String name) {
        return new String[0];
    }

    private void add(String name, String phone) {
    }

}
