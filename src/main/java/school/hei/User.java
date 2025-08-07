package school.hei;

import java.time.LocalDate;
import java.util.UUID;

public class User {
    protected String id;
    protected String username;
    protected String email;
    protected LocalDate DateCreation;

    public User(String username, String email) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.email = email;
        this.DateCreation = LocalDate.now();
    }

    public String getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof User)) { return false; }
        User user = (User) obj;
        return id.equals(user.id) && username.equals(user.username) && email.equals(user.email);
    }
}
