public class Main {

    public static void main(String[] args) {
        User user = new User(1l, "admin", "admin", "admin@test.com");
        System.out.println("User id: " + user.getId() + ", user login: " + user.getLogin() +
                ", user email: "+user.getEmail() + ", user password: "+user.getPassword());

        user.setLogin("nowy-admin");
        user.setPassword("admin-password");
        user.setEmail("updated-email@test.com");

        System.out.println("User id: " + user.getId() + ", user login: " + user.getLogin() +
                ", user email: "+user.getEmail() + ", user password: "+user.getPassword());

        Dog dog = new Dog("azor", "jamnik");
        System.out.println("Pieseł nazywa się: "+dog.getNazwa()+", jego rasa to: "+dog.getRasa());

        dog.setNazwa("fafik");
        System.out.println("Pieseł nazywa się: "+dog.getNazwa()+", jego rasa to: "+dog.getRasa());


        System.out.println(dog.toString());

        Human human = new Human("Daniel", "Luczun", 26);
        System.out.println(human);

        human.setWiek(30);
        System.out.println(human.toString());

        SuperHero superHero = new SuperHero("Daniel", "Luczun", 26, "Latanie");
        System.out.println(superHero);

        superHero.setWiek(30);
        human.setWiek(25);
        System.out.println(human.toString());
        System.out.println("\n" +superHero.toString());



    }
}
