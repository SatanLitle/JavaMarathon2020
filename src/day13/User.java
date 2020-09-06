package day13;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс User должен иметь следующую структуру:
 * <p>
 * Поля:
 * Строковое поле “имя пользователя” (англ. username)
 * Список, параметризованный классом User, с названием “подписки” (англ. subscriptions).
 * В этом списке должны храниться те пользователи, на которых подписан пользователь.
 * <p>
 * Конструктор:
 * Должен принимать в качестве аргумента только имя пользователя.
 * Также, должен инициализировать поле “подписки” пустым списком.
 * <p>
 * Методы:
 * Геттеры на все поля
 * <p>
 * public void subscribe(User user) - подписывает пользователя на пользователя user
 * <p>
 * public boolean isSubscribed(User user) - возвращает True, если пользователь подписан на пользователя user и False,
 * если не подписан.
 * <p>
 * public boolean isFriend(User user) - возвращает True, если пользователь user является другом и False,
 * если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.
 * <p>
 * public void sendMessage(User user, String text) - отправляет сообщение с текстом text пользователю user.
 * Здесь должен использоваться статический метод из MessageDatabase.
 * <p>
 * public String toString() - возвращает строковое представление пользователя (имя пользователя).
 */
public class User {


    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User us : subscriptions) {
            if (us.getUsername().equals(user.getUsername()))
                return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        for (User us : subscriptions) {
            if (us.getUsername().equals(user.getUsername()))
                if (user.getUsername().equals(us.getUsername()))
                    return true;
        }
        return false;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    public String toString() {
        return username;
    }
}
