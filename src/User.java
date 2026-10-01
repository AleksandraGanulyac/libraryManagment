import java.util.ArrayList;

public class User {
    public static record user(int id, String name, String surname, String type, int birthday, int numberBook){};

    static ArrayList<user> users = new ArrayList<>();

    public static void add(int id, String name, String surname, String type, int birthday){
        int numberBook = 0;
        users.add(new user(id, name, surname, type, birthday, numberBook));
    }

    public static void output() {
        for (user user : users) {
            System.out.println("ID: " + user.id() + "|Имя: " + user.name() + "|Тип(студент, преподаватель): " + user.type() + "|Год рождения: " + user.birthday());
        }
    }


}
