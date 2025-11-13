import java.util.Scanner;

public class list2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            }
            else if (c == ')') {
                if (count == 0) continue;
                count--;
            }
            sb.append(c);
        }
        StringBuilder result = new StringBuilder();
        count = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == ')') {
                count++;
            } else if (c == '(') {
                if (count == 0) continue; 
                count--;
            }
            result.append(c);
        }
        System.out.println(result.reverse().toString());
    }
}
