package school.hei;

import java.time.LocalDateTime;
import java.util.UUID;

public class Commentaire {
    private String id;
    private String content;
    private User author;
    private LocalDateTime date;

    public void Comment(String content, User author) {
        this.id = UUID.randomUUID().toString();
        this.content = content;
        this.author = author;
        this.date = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }
}
