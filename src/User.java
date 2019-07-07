public class User {

    private Long id;
    private String login;
    private String password;

    public User(Long id, String login, String password, String email){
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getId(){
        return id;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
