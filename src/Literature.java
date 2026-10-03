import java.time.LocalDate;
import java.util.ArrayList;

public class Literature {
    LocalDate currentDate = LocalDate.now();

    public int id;
    public String type;
    public String name;
    public String author;
    public int year;
    public boolean presence;
    public LocalDate days;
    public LocalDate endDays;

    public Literature(int id, String type, String name, String author, int year) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.author = author;
        this.year = year;
        this.presence = true;// по умолчанию

    }
    public static ArrayList<Literature> literatures = new ArrayList<>();

    public Literature() {
    }

    public static void add(int id, String type, String name, String author, int year){
        literatures.add(new Literature(id, type, name, author, year));
    }

    public static void output(){
        for(Literature l : literatures){
            System.out.print("id: " + l.id + "|Тип: " + l.type + "|Название: " + l.name + "|Автор: " + l.author + "|Год написания: " + l.year + "|Наличие: ");
            if(l.presence == true){
                System.out.print("В наличии");
            }
            else{
                System.out.print("Нет в наличии");
            }

            if (!l.presence){
                System.out.print("Дата начала: " + l.days + " | Дата окончания: " + l.endDays);
            }
        }
    }





}
