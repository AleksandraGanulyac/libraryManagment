import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fine {

    public LocalDate returnDays(){
        return LocalDate.now();
    }
    //количество просроченных дней
    public long dateComparison(int borrowId){
        for(issuanceRepository b:issuanceRepository.borrows){
            if(b.id == borrowId){
                return ChronoUnit.DAYS.between(b.endDays, returnDays()); //date2 -date1
            }
        }
        return 0;
    }
    //штраф
    public void dateCheck(int id){
        for(issuanceRepository b: issuanceRepository.borrows){
            if(b.id == id){
                if(returnDays().isBefore(b.endDays)){
                    System.out.println("Все хорошо, вы вернули вовремя");
                }
                else if(returnDays().isAfter(b.endDays)){
                    System.out.println("Вы задержали книгу, вы должны заплатить штраф.");
                    if(b.userType.equalsIgnoreCase("Студент")){
                        long fine = 5;
                        System.out.print("Штраф: ");
                        long allFine = fine * dateComparison(id);
                    } else if (b.userType.equalsIgnoreCase("Преподаватель")) {
                        int fine = 2;
                        System.out.print("Штраф: ");
                        long allFine = fine * dateComparison(id);
                    }
                }
            }
        }
    }
}
