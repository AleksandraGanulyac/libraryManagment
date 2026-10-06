import java.time.LocalDate;
import java.util.ArrayList;

public class FineRepository {
    User user = new User();
    issuanceRepository issuanceRepository = new issuanceRepository();

    public int userID; //Получается или вводится, добавлено
    public String userName; //Из user по id добавлено
    public String userSurname; //Из user по idб добавлено
    public int borrowLiterature; //добавлено Вся выданная литература, из issuanceRepository
    public int numberOverdueItems; //добавленое Просроченная литература, сделать getter
    public int borrowID; //получается из issuanceRepository
    public LocalDate startBorrow; //получается из issuanceRepository
    public LocalDate endBorrow; //получается из issuanceRepository
    public int daysOverduePayment; //сколько дней просрочено, получать где-нибудь
    public int bookDailyFine; //штраф в день по книге
    public int accumulatedFineBook; //общий штраф по книге(накапливается)
    public int allDailyFine; //Сколько штрафа капает в день
    public int allFine; //Общий штраф пользователя

    public FineRepository(int userID, String userName, String userSurname,
                          int borrowLiterature, int numberOverdueItems,
                          int borrowID, LocalDate startBorrow, LocalDate endBorrow,
                          int daysOverduePayment, int accumulatedFineBook,
                          int allDailyFine, int allFine){
        this.userID = userID;
        this.userName = this.user.getName(userID);
        this.userSurname = this.user.getSurname(userID);
        this.borrowID = borrowID;
    }

    public static ArrayList<FineRepository> fineRepositories = new ArrayList<>();

    public void add(int userID, int borrowLiterature, int borrowID){
        fineRepositories.add(userID, userName, userSurname,
                issuanceRepository.userBorrowLiterature,
                issuanceRepository.userBorrowLiterature.size(),
                borrowID, );
    }


}
