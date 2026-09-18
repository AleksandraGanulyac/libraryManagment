import java.util.ArrayList;

public class Student extends User{
    public static record student(int id, String name, String surname, int birthday){};

    static ArrayList<student> students = new ArrayList<>();

    public static void add(int id, String name, String surname, int birthday){
        students.add(new student(id, name, surname, birthday));
    }

    public static void output(){
        for(student student:students){
            System.out.println("ID: " + student.id() + "|Имя: " + student.name()  + "|Год рождения: " + student.birthday());
        }
    }
}
