import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Return {
    Scanner scanner = new Scanner(System.in);
    LocalDate dayOfReturn = LocalDate.now();
    LiteraturePresence literaturePresence = new LiteraturePresence();
    UserBook userBook = new UserBook();
    issuanceRepository issRep = new issuanceRepository();
//возврат книги
    //вводится id
    //Фиксируется дата возврата
    //Статус меняется на доступна
    //минусуются на 1 выдачи пользователя
    //Считается есть ли штраф
    //Общая сумма которая накапала по книге

    private void setPresence(int borrowID){
        issuanceRepository issRep = issuanceRepository.borrows.get(borrowID);
        literaturePresence.literaturePresence(issRep.getLiteratureID());
    }

    public void setNumberBook(int borrowID){
        issuanceRepository issRep = issuanceRepository.borrows.get(borrowID);
        userBook.putAwayUserBook(issRep.getUserID());
    }

    public void returnMenu(){
        System.out.println("Введите id выдачи: ");
        int borrowID = scanner.nextInt();
        System.out.println("Дата возврата: " + dayOfReturn);
        setPresence(borrowID);
        setNumberBook(borrowID);
        issRep.delete(borrowID);

    }

}
