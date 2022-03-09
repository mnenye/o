package lesson4;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"adsf", "pkm"};
        List<String> arrayList2 = Arrays.asList(strings);
        ArrayList<String> arrayList = new ArrayList<>();

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        ArrayList<Employee> employeeArrayList = new ArrayList<>();


        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");
        arrayList.add("Hello4");
        arrayList.add("Hello5");
        arrayList.add("Hello6");

        arrayList.remove("Hello5");
        arrayList.remove(0);

        arrayList.add(2, "Hello6");

        System.out.println(arrayList);
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());

        for (int i=0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("Hello6")) {
                System.out.println("Hello6 ect' ");
            }
        }

        HashMap<String, Employee> hashMap = new HashMap<>();

        hashMap.put("id405$2", employee1);
        hashMap.put("id455$8", employee2);
        hashMap.put("id405$3", employee1);
        hashMap.put("id455$4", employee2);

        hashMap.put("id405$2", employee2); //<String, Employee>


        System.out.println(hashMap);
        System.out.println(hashMap.get("id405$10"));

        for (Map.Entry<String, Employee> mapEntry: hashMap.entrySet()) {
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }

        HashMap<Character, Integer> charSet = new HashMap<>();
        String word = "Slava vedet prepodavanie";
        char[] chars = word.toCharArray();

        for (int i=0; i < chars.length; i++) {
            //esli bukvi net v spiske
            if (charSet.get(chars[i]) == null) {
                charSet.put(chars[i], 1);
            }
            //esli bukva ect' yzhe v spiske
            else {
                charSet.put(chars[i], charSet.get(chars[i]) + 1);
            }

            //avtor mnozhestva knig
            HashMap<String, ArrayList<String>> authorsAndTheirBooks = new HashMap<>();

            Scanner sc = new Scanner(System.in);
            String name;
            String nameOfBook;
            for (i = 0; i < 5; i++) {
                name = sc.nextLine();
                nameOfBook = sc.nextLine();

                if (authorsAndTheirBooks.get(name) != null) {
                    authorsAndTheirBooks.get(name).add(nameOfBook);
                }
                else {
                    ArrayList<String> tmp = new ArrayList<>();
                    tmp.add(nameOfBook);
                    authorsAndTheirBooks.put(name,tmp);
                }
            }

            //System.out.println(authorsAndTheirBooks);

            System.out.println();
            HashMap<String, String> testTreeMap = new HashMap<>();
            testTreeMap.put("Arcadiy", "asdf");
            testTreeMap.put("Dmitriy", "asdf");
            testTreeMap.put("Boris", "asdf");
            testTreeMap.put("Yan", "asdf");
            System.out.println(testTreeMap);

            System.out.println();
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("Альфа");
            hashSet.add("Альфа");
            hashSet.add("Омега");
            hashSet.add("Бета");
            hashSet.add("Альфа");
            hashSet.add("Омега");
            hashSet.add("Альфа");
            hashSet.add("Омега");
            hashSet.add("Бета");
            hashSet.add("bhkbjk");
            System.out.println(hashSet);


            //ArrayList<String>;

        }
    }
}
