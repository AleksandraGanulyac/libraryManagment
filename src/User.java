import java.util.ArrayList;

public class User {
    public int id;
    private String name;
    private String surname;
    private String type;
    private int birthday; //год
    private int numberBook; //количество взятых книг

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
        users.add(new User(id, name, surname, type, birthday));
    }

    public static void output() {
        for (User user : users) {
            System.out.println("ID: " + user.id + "|Имя: " + user.name + "|Тип(студент, преподаватель): " + user.type + "|Год рождения: " + user.birthday + "|Количество взятых книг: " + user.numberBook);
        }
    }

    //имя пользователя по ID
    public String getUserName(int userId){
        for(User user:users) {
            if (user.id == userId) {
                String userName = user.name;
                return user.name;
            }
        }
        return "0";
    }

    //Фамилия пользователя по ID
    public String getUserSurname(int userId){
        for(User user:users) {
            if (user.id == userId) {
                String userSurname = user.surname;
                return user.surname;
            }
        }
        return "0";
    }

    //Тип пользователя
    public String getUserType(int userID){
        for(User user:users) {
            if (user.id == userID) {
                return user.type;
            }
        }
        return "0";
    }

    //Получение и выставление года рождения
    public int getBirthday(int userID){
        for(User user:users) {
            if (user.id == userID) {
                return user.birthday;
            }
        }
        return 0;
    }

    //количество взятых книг
    public int getUserNumberBook(int userID){
        for(User user:users){
            if(user.id == userID){
                return user.numberBook;
            }
        }
        return 0;
    }

    public void setUserPlusNumberBook(int userID, int numberBook){
        for(User u:users){
            if(u.id == userID){
                u.numberBook += numberBook;
            }
        }
    }

    public void setUserMinusNumberBook(int userID, int numberBook){
        for(User u:users){
            if(u.id == userID){
                u.numberBook -= numberBook;
            }
        }
    }
}
