import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) return 0;
        int total = 0;
        for (int i : interactions) total += i;
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        if (engagementScore >= 500) return "Popular";
        if (engagementScore >= 100) return "Good";
        if (engagementScore >= 50) return "Low";
        return "Poor";
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> uniqueTags = new ArrayList<>();
        if (hashtags == null) return uniqueTags;
        HashSet<String> seen = new HashSet<>();
        for (String tag : hashtags) {
            if (tag != null && seen.add(tag)) {
                uniqueTags.add(tag);
            }
        }
        return uniqueTags;
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null) return trending;
        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> unique = new HashSet<>();
        if (authors != null) {
            for (String author : authors) {
                if (author != null) unique.add(author);
            }
        }
        return unique;
    }
}
