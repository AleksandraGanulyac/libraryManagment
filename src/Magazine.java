import java.util.ArrayList;

public class Magazine extends Literature{
    static final int storage = 7;

    static record magazine1(int id, String name, String author, int year){};
    public static ArrayList<magazine1> magazines  = new ArrayList<>();

    public static void add(int id, String name, String author, int year){
        magazines.add(new magazine1(id, name, author, year));
    }
    public static void output(){
        for(magazine1 magazine:magazines){
            System.out.println("ID: "+ magazine.id +"Название: " + magazine.name() + "|Автор: " + magazine.author() + "|Год написания: " + magazine.year() + "|Срок хранения: " + storage);
        }
    }
}

