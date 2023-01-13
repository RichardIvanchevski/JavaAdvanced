package SetsAndMapsExercise;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_P06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LinkedHashMap emails;
        for(emails = new LinkedHashMap(); !name.equals("stop"); name = scanner.nextLine()) {
            String email = scanner.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")) {
                emails.put(name, email);
            }
        }

        Iterator var6 = emails.entrySet().iterator();

        while(var6.hasNext()) {
            Map.Entry<String, String> pair = (Map.Entry)var6.next();
            System.out.printf("%s -> %s%n", pair.getKey(), pair.getValue());
        }

    }
}