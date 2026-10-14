import java.util.HashMap;
import java.util.Map;

public class Newspapper extends Literature{
    static final int storage = 1;
    private boolean presence;

    public Newspapper(String type, String name, String author, int year) {
        super(type, name, author, year);
        final int storage = 30;
        this.presence = true;
    }

    public static Map<Integer, Newspapper> newspappers = new HashMap<>();

    public static void add(int id, String type, String name, String author, int year){
        newspappers.put(id, new Newspapper(type, name, author, year));
    }

    @Override
    public void output(){
        for(Map.Entry<Integer, Newspapper> entry:newspappers.entrySet()){
            Integer ID = entry.getKey();
            Newspapper newspapper = entry.getValue();

            System.out.print("ID газеты: " + ID + " | Название газеты: " + getName() +
                    " | Автор газеты: " + getAuthor() +  " | Год написания: " + getYear());
            if(newspapper.presence == true){
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
