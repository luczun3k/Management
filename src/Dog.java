public class Dog {

    private String nazwa;
    private String rasa;

    public Dog(String nazwa, String rasa){
        this.nazwa = nazwa;
        this.rasa = rasa;
    }

    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getRasa() {
        return rasa;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nazwa='" + nazwa + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
