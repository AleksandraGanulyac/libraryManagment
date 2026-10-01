import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Literature {
    //сколько можно держать у себя
    // Я не уверена еще насчет реализации id

    static record literature1(int id, String type, String name, String author, int year, boolean presence){};
    public static ArrayList<literature1> literatures = new ArrayList<>();

    public static void add(int id, String type, String name, String author, int year){
        boolean presence = true;
        literatures.add(new literature1(id, type, name, author, year, presence));
    }

    public static void output(){
        for(literature1 l : literatures){
            System.out.println("id: " + l.id() + "|Тип: " + l.type() + "|Название: " + l.name() + "|Автор: " + l.author() + "|Год написания: " + l.year());
        }
    }





}
