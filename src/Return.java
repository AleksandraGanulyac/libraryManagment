import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Return {
    Scanner scanner = new Scanner(System.in);


    public LocalDate returnDays(){
        return LocalDate.now();
    }

    public long dateComparison(int borrowId){
        for(issuanceRepository b:issuanceRepository.borrows){
            if(b.id == borrowId){
                return ChronoUnit.DAYS.between(b.endDays, returnDays()); //date2 -date1
            }
        }
        return 0;
    }

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