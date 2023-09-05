import java.util.HashMap;
import java.util.Scanner;

public class rearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int[] arr = new int[n];

        // Calculate the frequency of each character
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char max = '\0';
        int fre = 0;
        // Find the most frequent character
        for (char key : map.keySet()) {
            if (map.get(key) > fre) {
                max = key;
                fre = map.get(key);
            }
        }
        System.out.println("Maximum character is " + max);

        // Rearrange the characters
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
            if (i % 2 == 0 && fre > 0) {
                arr[i] = max;
                fre--;
            }
        }

        // Display the rearranged array
        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num);
        }

        sc.close();
    }
}
