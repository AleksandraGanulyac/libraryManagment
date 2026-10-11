import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fine {
    issuanceRepository issuanceRepository = new issuanceRepository();
    User user = new User();
    Borrow borrow = new Borrow();
    //получаем дни просрочки
    public long daysOverduePayment(int borrowID){
        for(issuanceRepository b:issuanceRepository.borrows){
            if(issuanceRepository.getBorrowID(borrowID) == borrowID){
                return ChronoUnit.DAYS.between(b.getEndDays(borrowID), LocalDate.now());
            }
        }
        return 0;
    }

    public int daileFine(int userID){
        for(User user:User.users){
            if(user.id == userID){
                if(user.getUserSurname(userID).equalsIgnoreCase("студент")){
                    return 5;
                } else if (user.getUserType(userID).equalsIgnoreCase("преподаватель")) {
                    return 2;
                }
            }
        }

        return 0;
    }
}