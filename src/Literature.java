import java.time.LocalDate;
import java.util.ArrayList;

public class Literature {
    LocalDate currentDate = LocalDate.now();

    public int id;
    private String type;
    private String name;
    private String author;
    private int year;
    private boolean presence;

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
                System.out.println("В наличии");
            }
            else{
                System.out.println("Нет в наличии");
            }
        }
    }

    //Тип литературы по id
    public String getLiteratureType(int literatureId){
        for(Literature l:literatures){
            if(l.id == literatureId){
                return l.type;
            }
        }
        return "0";
    }
    public String getLiteratureType(){
        return type;
    }

    //название литературы по id
    public String getLiteratureName(int literatureId){
        for(Literature l:literatures){
            if(l.id == literatureId){
                return l.name;
            }
        }
        return "0";
    }

    public String getLiteratureName(){
        return name;
    }

    //Автор по id
    public String getLiteratureAuthor(int literatureId){
        for(Literature l:literatures){
            if(l.id == literatureId){
                return l.author;
            }
        }
        return "0";
    }

    public String getLiteratureAuthor(){
        return author;
    }

    //получаем год написания
    public int getLiteratureYear(int literatureId){
        for(Literature l:literatures){
            if(l.id == literatureId){
                return l.year;
            }
        }
        return 0;
    }

    public int getLiteratureYear(){
        return year;
    }

    //Получение наличия
    public boolean getPresence(int literatureID){
        for(Literature l:literatures){
            if(l.id == literatureID){
                return l.presence;
            }
        }
        return false;
    }

    public void setLiteraturePresence(int literatureID, boolean presence){
        for(Literature l:literatures){
            if(l.id == literatureID){
                l.presence = presence;
            }
        }
    }

    public void setId(int id) {
        this.id = id;
    }
}
