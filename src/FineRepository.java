import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FineRepository {
    User user = new User();
    issuanceRepository issuanceRepository = new issuanceRepository();
    Fine fine = new Fine();

    private int userID; //Получается или вводится, добавлено
    private String userName; //Из user по id добавлено
    private String userSurname; //Из user по id добавлено
    private int borrowLiterature; //добавлено Вся выданная литература, из issuanceRepository
    private int numberOverdueItems; //добавленое Просроченная литература, сделать getter
    private List<Integer> idOverdueBorrows; //именно просрочено получается из issuanceRepository

    public int allDailyFine; //Сколько штрафа капает в день
    public int allFine; //Общий штраф пользователя

    public FineRepository(int userID){
        this.userID = userID;
        this.userName = this.user.getUserName(userID);
        this.userSurname = this.user.getUserSurname(userID);
        //очищать каждый раз после добавления в список
        this.borrowLiterature = issuanceRepository.userBorrowLiterature.size();
        //очищать каждый раз после добавления в список
        this.numberOverdueItems = issuanceRepository.overdueItems.size();
        this.idOverdueBorrows = new ArrayList<>(issuanceRepository.idOverdueBorrows);
        this.allDailyFine = 0;
        this.allFine = 0;
    }

    public static ArrayList<FineRepository> fineRepositories = new ArrayList<>();

    public void add(int userID){
        fineRepositories.add(new FineRepository(userID));
        issuanceRepository.userBorrowLiterature.clear();
        issuanceRepository.overdueItems.clear();
        issuanceRepository.idOverdueBorrows.clear();
    }

    public static void generalInformationOutput(){
        for(FineRepository all:fineRepositories){
            System.out.println("ID Пользователя: " + all.userID);
            System.out.println("Имя пользователя: " + all.userName);
            System.out.println("Фамилия пользователя: " + all.userSurname);
            System.out.print("(Всего выдано - " + all.borrowLiterature + "/Просроченных - " + all.numberOverdueItems);

        }
    }

    public void literatureInfo(int userID){
        for(FineRepository all:fineRepositories){
            if(all.userID == userID){
                for(Integer b:idOverdueBorrows){
                    for(int i = 1; i <= idOverdueBorrows.size(); i++){
                        System.out.println(i + ". ID выдачи: " + idOverdueBorrows.get(i-1) + " | " +
                                "Дни просрочки" +  fine.daysOverduePayment(b) + "Штраф по книге в день: " +
                                fine.daileFine(userID) + " | Общий штраф по книге: " + fine.daysOverduePayment(b) * fine.daileFine(userID));
                        all.allDailyFine += fine.daysOverduePayment(b);
                        all.allFine += fine.daysOverduePayment(b) * fine.daileFine(userID);
                    }
                }
            }
        }
    }

    public void allFineInfo(int userID){
        for(FineRepository all:fineRepositories){
            if(all.userID == userID){
                System.out.println("Общий штраф в день: " + all.allDailyFine);
                System.out.println("Накопленный штраф: " + all.allFine);
            }
        }
    }
    //для вывода литературы перебор idOverdueBorrows и последующее его очищение

}
