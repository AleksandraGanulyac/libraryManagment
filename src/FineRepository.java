import java.time.LocalDate;
import java.util.ArrayList;

public class FineRepository {
    User user = new User();
    issuanceRepository issuanceRepository = new issuanceRepository();
    Fine fine = new Fine();

    public int userID; //Получается или вводится, добавлено
    public String userName; //Из user по id добавлено
    public String userSurname; //Из user по idб добавлено
    public int borrowLiterature; //добавлено Вся выданная литература, из issuanceRepository
    public int numberOverdueItems; //добавленое Просроченная литература, сделать getter
    public int idOverdueBorrows; //именно просрочено получается из issuanceRepository
    public int daysOverduePayment; //сколько дней просрочено, получать где-нибудь
    public int bookDailyFine; //штраф в день по книге
    public int accumulatedFineBook; //общий штраф по книге(накапливается)
    public int allDailyFine; //Сколько штрафа капает в день
    public int allFine; //Общий штраф пользователя

    public FineRepository(int userID){
        this.userID = userID;
        this.userName = this.user.getName(userID);
        this.userSurname = this.user.getSurname(userID);
        //очищать каждый раз после добавления в список
        this.borrowLiterature = issuanceRepository.userBorrowLiterature.size();
        //очищать каждый раз после добавления в список
        this.numberOverdueItems = issuanceRepository.overdueItems.size();
    }

    public static ArrayList<FineRepository> fineRepositories = new ArrayList<>();

    public static void add(int userID){
        fineRepositories.add(new FineRepository(userID));
    }

    public static void generalInformationOutput(){
        for(FineRepository all:fineRepositories){
            System.out.println("ID Пользователя: " + all.userID);
            System.out.println("Имя пользователя: " + all.userName);
            System.out.println("Фамилия пользователя: " + all.userSurname);
            System.out.print("(Всего выдано - " + all.borrowLiterature + "/Просроченных - " + all.numberOverdueItems);

        }
    }


}
