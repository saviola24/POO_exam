package school.hei;


import org.w3c.dom.Comment;

public class StandartUser extends User {
    public StandartUser(String username, String email) {
        super(username, email);
    }

    public publication.Post createPost(String content) {
        return new publication.Post(content, this);
    }

    public Comment createComment(String content) {
        return new Comment(content, this);
    }
}



