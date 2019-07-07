public class SuperHero extends Human {
    private String superHero;

    public SuperHero(String name, String lastName, int age, String superHero) {
        super(name, lastName, age);
        this.superHero = superHero;
    }

    public String getSuperHero() {
        return superHero;
    }

    //używając super - można odwoływac się do metod z klasy po której dziedziczymy
    @Override
    public String toString() {
        return super.toString() + "SuperHero{" +
                "superHero='" + superHero + '\'' +
                '}';
    }
}