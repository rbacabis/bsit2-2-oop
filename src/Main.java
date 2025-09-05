import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager manager = new PostManager();

        int score = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(score);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueTags = manager.manageHashtags(hashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList(
                "Java Programming Tips", "Advanced Java Tutorial", "Spring Boot Guide"
        ));
        HashMap<String, Integer> engagements = new HashMap<>();
        engagements.put("Java Programming Tips", 250);
        engagements.put("Advanced Java Tutorial", 900);
        engagements.put("Spring Boot Guide", 1100);

        LinkedList<String> trending = manager.findTrendingPosts(posts, engagements);
        HashSet<String> authors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        System.out.println("=== Social Media Post Manager ===");
        System.out.println("Post: Java Programming Tips");
        System.out.println("Engagement Score: " + score);
        System.out.println("Category: " + category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueTags);
        System.out.println("Trending Posts: " + trending);
        System.out.println("Unique Authors: " + authors);
    }
}