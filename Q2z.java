import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Q2z {
    public static void main(String[] args) {
        Map<String, String> store = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                if (!line.startsWith("<")) continue;
                String cmd = line.substring(1).trim();
                if (cmd.isEmpty()) continue;
                String[] parts = cmd.split("\\s+", 3);
                String action = parts[0].toUpperCase();

                switch (action) {
                    case "PUT":
                        if (parts.length >= 2) {
                            String key = parts[1];
                            String value = (parts.length == 3) ? parts[2] : "";
                            store.put(key, value);
                        }
                        break;
                        
                    case "GET":
                        if (parts.length >= 2) {
                            String key = parts[1];
                            String value = store.get(key);
                            if (value == null) {
                                System.out.println("> (not found)");
                            } else {
                                System.out.println("> " + value);
                            }
                        } else {
                            System.out.println("> (not found)");
                        }
                        break;

                    default:
                        
                        break;
                }
            }
        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        }
    }
}
