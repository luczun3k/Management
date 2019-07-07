import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService(Arrays.asList(
                new User("admin", "admin"),
                new User("pablo", "escabo"),
                new User("kasia", "zyt"),
                new User("ufo", "porno")
        ));

        User secondPablo = userService.getUserByLoginReturnsDefaultObject("pablo-2");
        System.out.println("second pablo: " + secondPablo.getPassword());



    }
}
