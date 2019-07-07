public class Human {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Human(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString(){
        return "Human{" +
                "name='" + imie + '\'' +
                ", lastName='" + nazwisko + '\'' +
                ", age=" + wiek +
                '}';

    }

}
