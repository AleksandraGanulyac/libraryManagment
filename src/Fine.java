import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fine {
    issuanceRepository issuanceRepository = new issuanceRepository();
    User user = new User();
    //получаем дни просрочки
    public long daysOverduePayment(int borrowID){
        for(issuanceRepository b:issuanceRepository.borrows){
            if(b.id == borrowID){
                return ChronoUnit.DAYS.between(b.startDays, LocalDate.now());
            }
        }
        return 0;
    }

    public int daileFine(int userID){
        for(User u:User.users){
            if(u.id == userID){
                if(u.type.equalsIgnoreCase("студент")){
                    return 5;
                } else if (u.type.equalsIgnoreCase("преподаватель")) {
                    return 2;
                }
            }
        }

        return 0;
    }
}