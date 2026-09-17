import java.util.ArrayList;

public class Literature {
    //сколько можно держать у себя
    // Я не уверена еще насчет реализации id
    protected String name;
    protected String author;
    protected int year;
    protected String type;

    static record literature1(int id, String type, String name, String author, int year){};
    public static ArrayList<literature1> literaturs = new ArrayList<>();

    public static void add(int id, String type, String name, String author, int year){
        literaturs.add(new literature1(id, type, name, author, year));
    }

    public static void output(){
        for(literature1 l : literaturs){
            System.out.println("id: " + l.id() + "|Тип: " + l.type() + "|Название: " + l.name() + "|Автор: " + l.author() + "|Год написания: " + l.year());
        }
    }
}
