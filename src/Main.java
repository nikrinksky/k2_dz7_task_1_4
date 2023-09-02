import org.w3c.dom.html.HTMLMapElement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(44, 1, 1, 22, 31, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        List<String> str = new ArrayList<>(List.of("Дом", "Пруд", "Забор", "Дом", "Крыша", "Дом", "пруд", "Забор"));
        task3(str);
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task4(strings);

    }

    public static void task1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                result.add(num);
            }

        }
        System.out.println(result);
    }

    public static void task2(List<Integer> nums) {
        List<Integer> sortNums = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 == 0) {
                sortNums.add(i);
            }
        }

        Set<Integer> result = new TreeSet<>(sortNums);

        System.out.println(result);
    }

    public static void task3(List<String> str) {
        Set<String> noDuplicates = new HashSet<>(str);
        System.out.println(noDuplicates);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> countByWord = new HashMap<>();

        for (String str : strings) {
            if (!countByWord.containsKey(str)) {
                countByWord.put(str, 1);
            } else {
                countByWord.put(str, countByWord.get(str) + 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : countByWord.entrySet()) {
            System.out.println(stringIntegerEntry.getValue());
        }
    }
}