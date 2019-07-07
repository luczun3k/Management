import java.util.List;

public class UserService {
    private List<User> users;

    public UserService(List<User> users){
        this.users = users;
    }

    public User getUserByLoginThrowsException(String login) throws UserNotFoundException {
        for(User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User with login: " + login + " not found.");
    }

    public User getUserByLoginReturnsDefaultObject (String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return User.DEFAULT_USER;
    }

}
