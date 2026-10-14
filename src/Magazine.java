import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Magazine extends Literature{
    private boolean presence;

    public Magazine(String type, String name, String author, int year) {
        super(type, name, author, year);
        final int storage = 7;
        this.presence = true;
    }

    public static Map<Integer, Magazine> magazines = new HashMap<>();

    public static void add(int id, String type, String name, String author, int year){
        magazines.put(id, new Magazine(type, name, author, year));
    }

    @Override
    public void output(){
        for(Map.Entry<Integer, Magazine> entry:magazines.entrySet()){
            Integer ID = entry.getKey();
            Magazine magazine = entry.getValue();

            System.out.print("ID журнала: " + ID + " | Название журнала: " + getName() +
                    " | Автор журнала: " + getAuthor() +  " | Год написания: " + getYear());
            if(magazine.presence == true){
                System.out.println(" | В наличии");
            }
            else{
                System.out.println("Нет в наличии");
                //Добавить дату начала
                //Дату окончания
            }
        }
    }
}

