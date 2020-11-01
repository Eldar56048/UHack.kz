package kz.edu.astanait.Models;

public class User {
    private int id;
    private String name;
    private String surname;
    private String login;
    private String password;

    public String getPassword() {
        return password;
    }

    public User(int id, String name, String surname, String login) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
    }

    public User(String name, String surname, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }
}
