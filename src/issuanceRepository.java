import java.time.LocalDate;
import java.util.ArrayList;

public class issuanceRepository {
    public int id;
    public String userName;
    public String userSurname;
    public String literatureType;
    public String literatureName;
    public String literatureAuthor;
    public LocalDate startDays;
    public LocalDate endDays;

    public issuanceRepository(int id, String userName, String userSurname, String literatureType, String literatureName, String literatureAuthor, LocalDate startDays, LocalDate endDays){
        this.id = id;
        this.userName = userName;
        this.userSurname = userSurname;
        this.literatureType = literatureType;
        this.literatureName = literatureName;
        this.literatureAuthor = literatureAuthor;
        this.startDays = startDays;
        this.endDays = endDays;
    }

    public static ArrayList<issuanceRepository> borrows = new ArrayList<>();

    public static void add(int id, String userName, String userSurname, String literatureType, String literatureName, String literatureAuthor, LocalDate startDays, LocalDate endDays){
        borrows.add(new issuanceRepository(id, userName, userSurname, literatureType, literatureName, literatureAuthor, startDays, endDays));
    }

    public static void output(){
        for(issuanceRepository b:borrows){
            System.out.println("id взятия: " + b.id + " | Имя пользователя: "
                    + b.userName + " | Фамилия пользователя: " + b.userSurname +
                    " | Тип литературы: " + b.literatureType + " | Название литературы: " +
                    b.literatureName + " | Автор: " + b.literatureAuthor +
                    " | Дата сделки: " + b.startDays + " | Дата окончания: " +
                    b.endDays);
        }
    }

}
