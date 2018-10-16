package fdg;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {


    public static  void main(String[] args) {
        name();
        phonebook();

    }
    private static void name(){
        String[] words = new String[]{"dog", "cat", "pet", "lock", "mock", "lock", "fork", "mock", "golf", "lock"};
        Map<String, Integer> map = new HashMap<>();


        for (String word : words) {
            Integer res = map.get(word);
            map.put(word, res == null ? 1 : 1 + res);
        }
        System.out.println(map);
    }
    private static void phonebook(){
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "52435");
        phonebook.add("Третьяков", "32135");
        phonebook.add("Рыжов", "232132");
        phonebook.add("Васьков", "53435");
        phonebook.add("Мурзиков", "31434");
        phonebook.add("Рыжиков", "23232");
        phonebook.add("Васьков", "4655");
        phonebook.add("Мурзиков", "2343");
        phonebook.add("Иванов", "35452");
        phonebook.add("Винт", "3242345");
        phonebook.add("Петров", "324234123");
        phonebook.add("Семенов", "314532");

        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Мурзиков"));
        System.out.println(phonebook.get("Семенов"));

    }

    static class Phonebook {

        private Map<String, List<String>> phonebook_hm = new HashMap<>();
        private List<String> phone_number_list;


        public  void add(String name, String number) {
            if (phonebook_hm.containsKey(name)) {
            phone_number_list = phonebook_hm.get(name);
            phone_number_list.add(number);
                phonebook_hm.put(name, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(number);
                phonebook_hm.put(name, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return phonebook_hm.get(surname);
    }
    }
}

