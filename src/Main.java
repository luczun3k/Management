public class Main {

    public static void main(String[] args) {
        User user = new User(1l, "admin", "admin", "admin@test.com");
        System.out.println("User id: " + user.getId() + ", user login: " + user.getLogin() +
                ", user password: "+user.getPassword());

        user.setLogin("nowy-admin");
        user.setPassword("admin-password");



    }
}
