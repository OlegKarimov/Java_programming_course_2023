//Создать класс User, содержащий логин, пароль и объект класса Basket.

import java.util.ArrayList;

public class User {

    private String name;
    private String login;
    private String password;
    private Basket basket;

    public User(String name, String login, String password, Basket basket) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

//    @Override
//    public String toString() {
//        return "User " +
//                "name: " + name +
//                ", basket: " + basket;
//    }


    @Override
    public String toString() {
        return "User: " +
                "name: " + name + '\'' +
                ", basket: " + basket;
    }
}
