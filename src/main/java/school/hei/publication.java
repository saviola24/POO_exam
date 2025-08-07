package school.hei;

import org.w3c.dom.Comment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class publication {
    static class Post {
        private String id;
        private String content;
        private User author;
        private LocalDateTime date;
        private List<Comment> comments;

        public Post(String content, User author) {
            this.id = UUID.randomUUID().toString();
            this.content = content;
            this.author = author;
            this.date = LocalDateTime.now();
            this.comments = new ArrayList<>();
        }

        public String getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

        public List<Comment> getComments() {
            return comments;
        }

        public void addComment(Comment comment) {
            comments.add(comment);
        }
    }
}
