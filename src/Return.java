import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Return {
    Scanner scanner = new Scanner(System.in);

    public int getLiteratureId(int borrowId){
        for(issuanceRepository b:issuanceRepository.borrows){
            if(b.id == borrowId){
                return b.literatureId;
            }
        }
        return 0;
    }

    public int getUserId(int borrowId){
        for(issuanceRepository b:issuanceRepository.borrows){
            if(b.id == borrowId){
                return b.userId;
            }
        }
        return 0;
    }

    public void returnBook(){
        System.out.println("Введите id выдачи: ");
        int borrowId = scanner.nextInt();

        LiteraturePresence.literaturePresence(getLiteratureId(borrowId));
        UserBook.putAwayUserBook(getUserId(borrowId));
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
