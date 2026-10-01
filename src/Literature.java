import java.util.ArrayList;

public class Literature {
    //сколько можно держать у себя
    // Я не уверена еще насчет реализации id
    public int id;
    public String type;
    public String name;
    public String author;
    public int year;
    public boolean presence;

    public Literature(int id, String type, String name, String author, int year) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.author = author;
        this.year = year;
        this.presence = true; // по умолчанию
    }
    public static ArrayList<Literature> literatures = new ArrayList<>();

    public Literature() {
    }

    public static void add(int id, String type, String name, String author, int year){
        literatures.add(new Literature(id, type, name, author, year));
    }

    public static void output(){
        for(Literature l : literatures){
            System.out.println("id: " + l.id + "|Тип: " + l.type + "|Название: " + l.name + "|Автор: " + l.author + "|Год написания: " + l.year);
        }
    }





}
