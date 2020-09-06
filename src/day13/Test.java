package day13;

/**
 * В методе main() этого класса необходимо создать трех пользователей.
 * Затем необходимо:
 * Отправить 2 сообщения от пользователя 1 пользователю 2
 * Отправить 3 сообщения от пользователя 2 пользователю 1
 * Отправить 4 сообщения от пользователя 3 пользователю 1
 * Отправить 3 сообщения от пользователя 1 пользователю 3
 * <p>
 * Сообщения могут быть любыми.
 * После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
 */
public class Test {
    public static void main(String[] args) {

        User user1 = new User("Harry");
        User user2 = new User("Garry");
        User user3 = new User("Barry");

        user1.sendMessage(user2, "Hello!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hello!");
        user2.sendMessage(user1, "I'm fine!");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Hi!");
        user3.sendMessage(user1, "How are you?");
        user3.sendMessage(user1, "What are you doing today!");
        user3.sendMessage(user1, "Let's go to the bar.");

        user1.sendMessage(user3, "Hello!");
        user1.sendMessage(user3, "This is a great idea!");
        user1.sendMessage(user3, "Where will we meet?");

        MessageDatabase.showDialog(user3, user1);
    }
}
