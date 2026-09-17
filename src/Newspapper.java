import java.util.ArrayList;

public class Newspapper extends Literature{
    static final int storage = 1;

    static record newspapper1(String name, String author, int year){};
    public static ArrayList<newspapper1> newspappers = new ArrayList<>();

    public static void add(String name, String author, int year){
        newspappers.add(new newspapper1(name, author, year));
    }
    public static void output(){
        for(newspapper1 newspapper:newspappers){
            System.out.println("Название: " + newspapper.name() + "|Автор: " + newspapper.author() + "|Год написания: " + newspapper.year() + "|Срок хранения: " + storage);
        }
    }

}
