import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Literature {
    LocalDate currentDate = LocalDate.now();

    public int id;
    private String type;
    private String name;
    private String author;
    private int year;
    private boolean presence;

    public Literature(String type, String name, String author, int year) {
        this.type = type;
        this.name = name;
        this.author = author;
        this.year = year;
        this.presence = true;// по умолчанию

    }

    private static Map<Integer, Literature> literatures = new HashMap<>();

    public Literature() {
    }

    public static void add(int id, String type, String name, String author, int year) {
        literatures.put(id, new Literature(type, name, author, year));
    }

    public void output(){
        for(Map.Entry<Integer, Literature> entry:literatures.entrySet()){
            Integer id = entry.getKey();
            Literature literature = entry.getValue();

            System.out.print("ID книги: " + id + " | Тип: " + literature.getType() +
                    " | Название книги: " + literature.getName() +
                    " | Автор: " + literature.getAuthor() + " | Год написания: " + literature.getYear() + " | ");
            if(literature.presence == true){
                System.out.println(" В наличии");
            }
            else{
                System.out.println("Нет в наличии");
                //Добавить дату начала
                //Дату окончания
            }
        }
    }

    public static void outputByID(int id){
        Literature literature = literatures.get(id);
        if(literature != null){
            System.out.println("ID книги: " + id + " | Тип: " + literature.getType() +
                    " | Название книги: " + literature.getName() +
                    " | Автор: " + literature.getAuthor() + " | Год написания: " + literature.getYear());
        }
    }

    public String getType() {
        return type;
    }

    public String getTypeByID(int id) {
        Literature literature = literatures.get(id);
        if(literature != null){
            return literature.getType();
        }
        return "Книга не найдена";
    }

    public String getName() {
        return name;
    }

    public String getNameByID(int id) {
        Literature literature = literatures.get(id);
        if(literature != null){
            return literature.getName();
        }
        return "Книга не найдена";
    }

    public String getAuthor() {
        return author;
    }

    public String getAuthorByID(int id) {
        Literature literature = literatures.get(id);
        if(literature != null){
            return literature.getAuthor();
        }
        return "Книга не найдена";
    }

    public int getYear() {
        return year;
    }

    public int getYearByID(int id) {
        Literature literature = literatures.get(id);
        if(literature != null){
            return literature.getYear();
        }
        return 0;
    }
}