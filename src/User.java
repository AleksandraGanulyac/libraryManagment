import java.util.ArrayList;

public class User {
    public int id;
    public String name;
    public String surname;
    public String type;
    public int birthday;
    public int numberBook;

    public User(int id, String name, String surname, String type, int birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.birthday = birthday;
        this.numberBook = 0; // по умолчанию
    }

    static ArrayList<User> users = new ArrayList<>();

    public User() {
    }

    public static void add(int id, String name, String surname, String type, int birthday){
        int numberBook = 0;
        users.add(new User(id, name, surname, type, birthday));
    }

    public static void output() {
        for (User user : users) {
            System.out.println("ID: " + user.id + "|Имя: " + user.name + "|Тип(студент, преподаватель): " + user.type + "|Год рождения: " + user.birthday);
        }
    }

}
