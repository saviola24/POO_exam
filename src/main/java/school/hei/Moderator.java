package school.hei;

import javax.swing.*;
import javax.xml.stream.events.Comment;

public class Moderator extends StandartUser {
    public Moderator(String username, String email) {
        super(username, email);
    }

    public boolean deletePost(publication.Post post) {
        return true;
    }

    public boolean deleteComment(Comment comment) {
        return true;
    }
}
