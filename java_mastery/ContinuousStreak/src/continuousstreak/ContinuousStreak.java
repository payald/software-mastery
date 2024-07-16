/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continuousstreak;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author payal
 */

/*
You are given a log file containing user activity on a social media platform. Each entry consists
of a timestamp, a user ID, and the type of action performed (e.g., "post," "like," "comment").
a. Write a function that takes the log file as input and returns the top K users with
the longest consecutive streaks of activity, where a streak is defined as
performing at least one action each day for a continuous period. If multiple users
have the same streak length, prioritize users with higher overall activity counts.
b. Example:
c. Log File:
i. 2024-07-01, User1, post
ii. 2024-07-01, User2, like
iii. 2024-07-02, User1, comment
iv. 2024-07-03, User1, like
v. 2024-07-03, User3, post
vi. 2024-07-04, User2, comment
vii. 2024-07-05, User3, like
d. For K = 2, the function should return: [for example]
i. [User3, User1]
*/
public class ContinuousStreak {
    static class UserActivity {
        String userId;
        int maxStreak;
        int totalActivityCount;

        UserActivity(String userId, int maxStreak, int totalActivityCount) {
            this.userId = userId;
            this.maxStreak = maxStreak;
            this.totalActivityCount = totalActivityCount;
        }
    }
    
    public static List<String> topKUsersWithLongestStreaks(String logFilePath, int k) throws IOException {
        Map<String, List<LocalDate>> userActivities = parseLog(logFilePath);
        Map<String, UserActivity> streaks = calculateStreaks(userActivities);

        List<UserActivity> userActivityList = new ArrayList<>(streaks.values());
        userActivityList.sort((a, b) -> {
            if (b.maxStreak != a.maxStreak) {
                return Integer.compare(b.maxStreak, a.maxStreak);
            } else {
                return Integer.compare(b.totalActivityCount, a.totalActivityCount);
            }
        });

        List<String> topKUsers = new ArrayList<>();
        for (int i = 0; i < k && i < userActivityList.size(); i++) {
            topKUsers.add(userActivityList.get(i).userId);
        }

        return topKUsers;
    }

    private static Map<String, List<LocalDate>> parseLog(String logFilePath) throws IOException {
        Map<String, List<LocalDate>> userActivities = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try (BufferedReader br = new BufferedReader(new FileReader(logFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                LocalDate date = LocalDate.parse(parts[0], formatter);
                String userId = parts[1];

                userActivities.computeIfAbsent(userId, k -> new ArrayList<>()).add(date);
            }
        }
        return userActivities;
    }

    private static Map<String, UserActivity> calculateStreaks(Map<String, List<LocalDate>> userActivities) {
        Map<String, UserActivity> streaks = new HashMap<>();

        for (Map.Entry<String, List<LocalDate>> entry : userActivities.entrySet()) {
            String userId = entry.getKey();
            List<LocalDate> dates = entry.getValue();
            Collections.sort(dates);

            int maxStreak = 1;
            int currentStreak = 1;
            int totalActivityCount = dates.size();

            for (int i = 1; i < dates.size(); i++) {
                if (dates.get(i).equals(dates.get(i - 1).plusDays(1))) {
                    currentStreak++;
                    maxStreak = Math.max(maxStreak, currentStreak);
                } else /*if (!dates.get(i).equals(dates.get(i - 1)))*/ {
                    //TODO: did not understand the above part
                    currentStreak = 1;
                }
            }

            streaks.put(userId, new UserActivity(userId, maxStreak, totalActivityCount));
        }

        return streaks;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String logFilePath = "C:\\payal\\job\\software_mastery\\software-mastery\\java_mastery\\ContinuousStreak\\src\\continuousstreak\\path_to_log_file.txt";
            int k = 2;
            List<String> topKUsers = topKUsersWithLongestStreaks(logFilePath, k);
            System.out.println(topKUsers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}