import java.util.HashMap;
import java.util.Map;

public class Student extends User{
    final int maxBook = 3;
    final double fine = 5;

    public Student(String name, String surname, String type, int birthday){
        super(name, surname,type, birthday);
    }

    public Student(){}

    static Map<Integer, Student> students = new HashMap<>();

    public void add(int id, String name, String surname, String type, int birthday){
        students.put(id, new Student(name, surname, type, birthday));
    }

    @Override
    public void output(){
        for(Map.Entry<Integer, Student> entry:students.entrySet()){
            Integer ID = entry.getKey();
            Student student = entry.getValue();

            System.out.println("ID пользователя: " + ID + " | Имя: " + student.getName() +
                    " | Фамилия: " + student.getSurname()  + " | Год рождения: " + student.getBirthday() + " | Количество взятых книг: "
                    + student.getNumberBook());
        }
    }


}
