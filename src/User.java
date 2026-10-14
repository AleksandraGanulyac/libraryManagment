import java.util.HashMap;
import java.util.Map;

public class User {
    public int id;
    private String name;
    private String surname;
    private String type;
    private int birthday; //год
    private int numberBook; //количество взятых книг

    public User(String name, String surname, String type, int birthday) {
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.birthday = birthday;
        this.numberBook = 0; // по умолчанию
        final int maxBook;
        final double fine;
    }
    private static Map<Integer, User> users = new HashMap<>();

    public User() {
    }


    public void add(int id, String name, String surname, String type, int birthday){
        users.put(id, new User(name, surname, type, birthday));
    }

   public void output() {
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            Integer id = entry.getKey();
            User user = entry.getValue();

            System.out.println("ID пользователя: " + id + " | Имя: " + getName() +
                    " | Фамилия: " + getSurname() + " | Тип(преподаватель, студент): "
            + getType() + " | Год рождения: " + getBirthday() + " | Количество взятых книг: "
            + getNumberBook());

        }
    }

    public void outputByID(int id){
        User user = users.get(id);
        if(user != null){
            System.out.println("ID пользователя: " + id + " | Имя: " + user.getName() +
                    " | Фамилия: " + user.getSurname() + " | Тип(преподаватель, студент): "
                    + user.getType() + " | Год рождения: " + user.getBirthday() + " | Количество взятых книг: "
                    + user.getNumberBook());
        }
    }

    public String getName() {
        return name;
    }

    public static String getNameByID(int id){
        User user = users.get(id);
        if(user != null){
            return user.getName();
        }
        return "Пользователь не найден";
    }

    public String getSurname() {
        return surname;
    }

    public static String getSurnameByID(int id){
        User user = users.get(id);
        if(user != null){
            return user.getSurname();
        }
        return "Пользователь не найден";
    }

    public String getType() {
        return type;
    }

    public static String getTypeByID(int id){
        User user = users.get(id);
        if(user != null){
            return user.getType();
        }
        return "Пользователь не найден";
    }

    public int getBirthday() {
        return birthday;
    }

    public static int getBirthdayByID(int id){
        User user = users.get(id);
        if(user != null){
            return user.getBirthday();
        }
        return 0;
    }

    public int getNumberBook() {
        return numberBook;
    }


}
