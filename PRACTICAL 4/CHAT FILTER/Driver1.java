import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {

        String[] logs = {
            "10:05 alice Hello there",
            "10:10 bob Good morning",
            "10:15",
            "10:20 charlie How are you?"
        };

        Scanner sc = new Scanner(System.in);
        ChatFilter cf = new ChatFilter();

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        int count = 0;
        StringBuilder report = new StringBuilder();

        for (String line : logs) {

            String[] parts = line.split(" ", 3);

            if (parts.length < 3)
                continue;

            String time = parts[0];
            String user = parts[1];
            String message = parts[2];

            if (cf.containsKeyword(message, keyword)) {
                count++;
                report.append(time)
                      .append(" ")
                      .append(user)
                      .append(": ")
                      .append(message)
                      .append("\n");
            }
        }

        System.out.println("\nMatches: " + count);
        System.out.println(report);

        sc.close();
    }
}