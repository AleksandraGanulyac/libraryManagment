import java.util.ArrayList;

public class Teacher extends User{
    public static record teacher(int id, String name, String surname, int birthday){};

    static ArrayList<teacher> teachers = new ArrayList<>();

    public static void add(int id, String name, String surname, int birthday){
        teachers.add(new teacher(id, name, surname, birthday));
    }

    public static void output(){
        for(teacher teacher:teachers){
            System.out.println("ID: " + teacher.id() + "|Имя: " + teacher.name() +  "|Год рождения: " + teacher.birthday());
        }
    }
}
