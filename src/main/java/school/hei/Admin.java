package school.hei;

public class Admin extends Moderator {
    public Admin(String username, String email) {
        super(username, email);
    }

    public boolean deleteUser(User user) {
        return true;
    }
}
