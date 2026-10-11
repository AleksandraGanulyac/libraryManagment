import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Return {
    UserBook userBook = new UserBook();
    Scanner scanner = new Scanner(System.in);
    issuanceRepository issuanceRepository = new issuanceRepository();
    LiteraturePresence presence = new LiteraturePresence();

    public void returnBook(){
        System.out.println("Введите id выдачи: ");
        int borrowId = scanner.nextInt();

        presence.literaturePresence(issuanceRepository.getLiteratureId(borrowId));
        userBook.putAwayUserBook(issuanceRepository.getUserID(borrowId));
        issuanceRepository.borrows.remove(borrowId - 1);
    }
}


//Добавить хранилище штрафов, которые будут суммироваться.
//Добавить хранилище выдач отдельно по пользователю, все его выдачи
//9. Выдачи пользователя
// id Фамилия Имя(кол-во книг):
//      1.id выдачи|Название книги|Автор книги| Дата выдачи|До какого числа вернуть|(если есть) Накопленные штрафы
//10. Штрафы пользователя
//id Фамилия Имя(кол-во книг выданных/ просроченных):(просроченные книги)
//      1. id выдачи| Дата выдачи| Дата окончания | Сколько дней просрочено| Штраф в день| Общий штраф по книге
//      2. То же самое если несколько книг
//  Штраф в день:
//  Общий накопленный штраф:
//Следующий пользователь
