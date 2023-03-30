import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("1", "1", "2", "3", "4", "4", "5", "5", "6", "7"));

        oddNum(nums1);
        evenNumOnce(nums1);
        uniqueWords(words);
        countDoubles(words);
    }

    private static void oddNum(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void evenNumOnce(List<Integer> nums) {
        List<Integer> value = new ArrayList<>(nums);
        value.sort(Comparator.naturalOrder());
        for (int i = 0; i < value.size(); i++) {
            if (value.get(i) % 2 == 0) {
                if (i == value.size() - 1 || value.get(i) != value.get(i + 1)) {
                    System.out.print(value.get(i) + " ");
                }
            }
        }
        System.out.println();
    }
    private static void uniqueWords(List<String> words)
    {
        Set<String> value = new HashSet<>(words);
        value.stream()
                .forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
    private static void countDoubles(List<String> words)
    {
        Set<String> value = new HashSet<>(words);
        System.out.println(words.size() - value.size());
    }
}