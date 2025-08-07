package school.hei;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class groupe {
    Admin admin;
    List<User> members = new ArrayList<>();
    List<publication.Post> posts = new ArrayList<>();

    public void Group(Admin admin) {
        this.admin = admin;
        members.add(admin);
    }

    public void addUser(User user) { members.add(user); }
    public void addPost(publication.Post post) { posts.add(post); }

    public List<publication.Post> searchPostsByKeyword(String keyword) {
        return posts.stream()
                .filter(post -> post.getContent().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public boolean hasUser(User user) { return members.contains(user); }
    public int countPosts() { return posts.size(); }
}
