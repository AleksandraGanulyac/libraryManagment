import java.util.HashMap;
import java.util.Map;

public class Teacher extends User{
    final int maxBook = 10;
    final double fine = 2;

    public Teacher(String name, String surname, String type, int birthday){
        super(name, surname,type, birthday);
    }

    public Teacher(){}

    private static Map<Integer, Teacher> teachers = new HashMap<>();

    public void add(int id, String name, String surname, String type, int birthday){
        teachers.put(id, new Teacher(name, surname, type, birthday));
    }

    @Override
    public void output(){
        for(Map.Entry<Integer, Teacher> entry:teachers.entrySet()){
            Integer ID = entry.getKey();
            Teacher teacher = entry.getValue();

            System.out.println("ID пользователя: " + id + " | Имя: " + getName() +
                    " | Фамилия: " + getSurname()  + " | Год рождения: " + getBirthday() + " | Количество взятых книг: "
                    + getNumberBook());
        }
    }
}
