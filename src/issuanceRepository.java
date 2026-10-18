import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

//Активные выдачи
public class issuanceRepository {
    public static int ID = 1;
    private int userID;
    private String userType;
    private String userName;
    private String userSurname;
    private int literatureID;
    private String literatureType;
    private String literatureName;
    private String literatureAuthor;
    private LocalDate startDays;
    private LocalDate endDays;
    private LocalDate fineDay;


    public issuanceRepository(int userID, String userType, String userName, String userSurname, int literatureID, String literatureType, String literatureName, String literatureAuthor, LocalDate startDays, LocalDate endDays){
        this.userID = userID;
        this.userType = userType;
        this.userName = userName;
        this.userSurname = userSurname;
        this.literatureID = literatureID;
        this.literatureType = literatureType;
        this.literatureName = literatureName;
        this.literatureAuthor = literatureAuthor;
        this.startDays = startDays;
        this.endDays = endDays;
        this.fineDay = endDays.plusDays(1);
    }

    public issuanceRepository(){}
    public static Map<Integer, issuanceRepository> borrows = new HashMap<>();

    public static void add(int ID, int userId, String userType,
                           String userName, String userSurname,
                           int literatureID, String literatureType,
                           String literatureName, String literatureAuthor,
                           LocalDate startDays, LocalDate endDays) {
        borrows.put(ID, new issuanceRepository(userId, userType, userName, userSurname, literatureID, literatureType, literatureName, literatureAuthor, startDays, endDays));
    }

    public static void output(){
        for(Map.Entry<Integer, issuanceRepository> entry:borrows.entrySet()){
            Integer ID = entry.getKey();
            issuanceRepository issRep = entry.getValue();

            System.out.println("ID выдачи: " + ID + " | ID пользователя: " + issRep.getUserID() +
                    " | Тип пользователя: " + issRep.getUserType() + " | Имя пользователя: " + issRep.getUserName()+
                    " | Фамилия пользователя: " + issRep.getUserSurname() + " | ID книги: " + issRep.getLiteratureID() +
                    " | Тип литературы: " + issRep.getLiteratureType() + " | Название литературы: " + issRep.getLiteratureName() +
                    " | Автор литературы: " + issRep.getLiteratureAuthor() + " | Дата начала аренды: " +
                    issRep.getStartDays() + " | Дата окончания: " + issRep.getEndDays());
        }
    }

    public static void outputByID(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            System.out.println("ID выдачи: " + ID + " | ID пользователя: " + issRep.getUserID() +
                    " | Тип пользователя: " + issRep.getUserType() + " | Имя пользователя: " + issRep.getUserName()+
                    " | Фамилия пользователя: " + issRep.getUserSurname() + " | ID книги: " + issRep.getLiteratureID() +
                    " | Тип книги: " + issRep.getLiteratureType() + " | Название книги: " + issRep.getLiteratureName() +
                    " | Автор книги: " + issRep.getLiteratureAuthor() + " | Дата начала аренды: " +
                    issRep.getStartDays() + " | Дата окончания: " + issRep.getEndDays());
        }
    }

    public int getUserID() {
        return userID;
    }

    public int getUserIDByBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getUserID();
        }
        return 0;
    }

    public String getUserType() {
        return userType;
    }

    public String getUserTypeByBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getUserType();
        }
        return "Выдача не найдена";
    }

    public String getUserName() {
        return userName;
    }

    public String getUserNameByBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getUserName();
        }
        return "Выдача не найдена";
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserSurnameByBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getUserSurname();
        }
        return "Выдача не найдена";
    }

    public int getLiteratureID() {
        return literatureID;
    }

    public int getLiteratureIDByBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getLiteratureID();
        }
        return 0;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public String getLiteratureTypeByBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getLiteratureType();
        }
        return "Выдача не найден";
    }

    public String getLiteratureName() {
        return literatureName;
    }

    public String getLiteratureNameByBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getLiteratureName();
        }
        return "Выдача не найден";
    }

    public String getLiteratureAuthor() {
        return literatureAuthor;
    }

    public String getLiteratureAuthorByBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getLiteratureAuthor();
        }
        return "Выдача не найден";
    }

    public LocalDate getStartDays() {
        return startDays;
    }

    public LocalDate getStartDaysBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getStartDays();
        }
        return LocalDate.now();
    }

    public LocalDate getEndDays() {
        return endDays;
    }

    public LocalDate getEndDaysBorrow(int ID){
        issuanceRepository issRep = borrows.get(ID);
        if(issRep != null){
            return issRep.getEndDays();
        }
        return LocalDate.now();
    }

    public void delete(int borrowID){
        borrows.remove(borrowID);
    }

    public LocalDate getFineDay(){
        return fineDay;
    }
}
