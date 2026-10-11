import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class issuanceRepository {
    private int id;
    private int userId;
    private String userType;
    private String userName;
    private String userSurname;
    private int literatureId;
    private String literatureType;
    private String literatureName;
    private String literatureAuthor;
    private LocalDate startDays;
    private LocalDate endDays;

    public issuanceRepository(int id, int userId, String userType, String userName, String userSurname, int literatureId, String literatureType, String literatureName, String literatureAuthor, LocalDate startDays, LocalDate endDays){
        this.id = id;
        this.userId = userId;
        this.userType = userType;
        this.userName = userName;
        this.userSurname = userSurname;
        this.literatureId = literatureId;
        this.literatureType = literatureType;
        this.literatureName = literatureName;
        this.literatureAuthor = literatureAuthor;
        this.startDays = startDays;
        this.endDays = endDays;
    }

    public issuanceRepository(){}
    public static ArrayList<issuanceRepository> borrows = new ArrayList<>();

    public static void add(int id, int userId, String userType, String userName, String userSurname, int literatureId, String literatureType, String literatureName, String literatureAuthor, LocalDate startDays, LocalDate endDays){
        borrows.add(new issuanceRepository(id, userId, userType, userName, userSurname, literatureId, literatureType, literatureName, literatureAuthor, startDays, endDays));
    }

    public static void output(){
        for(issuanceRepository b:borrows){
            System.out.println("id взятия: " + b.id + " | id Пользователя" + b.userId + " | Имя пользователя: "
                    + b.userName + " | Фамилия пользователя: " + b.userSurname + " | id Литературы: " + b.literatureId +
                    " | Тип литературы: " + b.literatureType + " | Название литературы: " +
                    b.literatureName + " | Автор: " + b.literatureAuthor +
                    " | Дата сделки: " + b.startDays + " | Дата окончания: " +
                    b.endDays);
        }
    }


    //литература
    List<Integer> userBorrowLiterature = new ArrayList<>();

    //получаем id литературы по которой просрочка
    public void getBorrowLiterature(int userID){
        for(issuanceRepository b:borrows){
            if(userID == b.userId){
                userBorrowLiterature.add(b.literatureId);
            }
        }
    }

    //id просроченной литературы
    List<Integer> overdueItems = new ArrayList<>();
    public void getOverdueItems(){
        for(issuanceRepository b:borrows){ //проходимся по общему списку
            for (int l:userBorrowLiterature){ // проходимся по литературе конкретного пользователя
                if(b.literatureId == l){ //если id сходятся проверяем:
                    if(b.endDays.isAfter(LocalDate.now())){ //если просроченно добавляем в ArrayList
                        overdueItems.add(b.literatureId);
                    }
                }
            }
        }
    }

    //id выдач
    List<Integer> idOverdueBorrows = new ArrayList<>();
    public void getIdOverdueBorrows(){
        for(int b:overdueItems){
            for(issuanceRepository l:borrows){
                if(b == l.literatureId){
                    idOverdueBorrows.add(l.id);
                }
            }
        }
    }

    public LocalDate getStartDays(int userID){
        for(issuanceRepository b:borrows){
            if(userID == b.userId){
                return b.startDays;
            }
        }
        return LocalDate.now();
    }

    public LocalDate getEndDays(int borrowsID){
        for(issuanceRepository b:borrows){
            if(borrowsID == b.id){
                return b.endDays;
            }
        }
        return LocalDate.now();
    }


    //userId по выдаче
    public int getUserID(int borrowID){
        for(issuanceRepository u:borrows){
            if(u.id == borrowID){
                return u.userId;
            }
        }
        return 0;
    }

    //literatureID по выдаче
    public int getLiteratureId(int borrowID){
        for(issuanceRepository u:borrows){
            if(u.id == borrowID){
                return u.literatureId;
            }
        }
        return 0;
    }

    //id выдачи
    public int getBorrowID(int borrowID) {
        for(issuanceRepository b:borrows){
            if(b.id == borrowID){
                return b.id;
            }
        }
        return 0;
    }

}
