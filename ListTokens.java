import java.util.*;

public class ListTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] people = new String[n];
        List<List<Integer>> tokens = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of person " + (i + 1) + ": ");
            people[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter tokens held by person " +(i+1) + ": ");
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                tokens.add(new ArrayList<>());
                continue;
            }
            String[] parts = line.split(",");
            List<Integer> tList = new ArrayList<>();
            for (String p : parts) {
                tList.add(Integer.parseInt(p.trim()));
            }
            tokens.add(tList);
        }
        System.out.println();
        System.out.println("Requirment 1");
        System.out.print("Enter the person name: ");
        String name = sc.nextLine().trim();
        for (int i = 0; i < n; i++) {
            if (people[i].equalsIgnoreCase(name)) {
                System.out.print("Tokens held by " + name + " are : ");
                System.out.println(tokens.get(i).toString().replace("[", "").replace("]", ""));
                break;
            }
        }
        System.out.println();
        System.out.println("Requirment 2");
        System.out.print("Enter the token number to search: ");
        int searchToken = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (tokens.get(i).contains(searchToken)) {
                System.out.println("Token no. " + searchToken + " belong to :" + people[i]);
                break;
            }
        }
        sc.close();
    }
}
