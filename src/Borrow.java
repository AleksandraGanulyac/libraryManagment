import java.time.LocalDate;
import java.util.Scanner;

public class Borrow {
    Scanner scanner = new Scanner(System.in);
    UserBook userBook = new UserBook();
    User user = new User();
    LiteraturePresence presence = new LiteraturePresence();

    Verification verification = new Verification();

    private static int borrowID = 1;
    private LocalDate endDays;

    private LocalDate getStartDays(){
        return LocalDate.now();
    }

    private LocalDate getEndDays(int ID){
        Literature literature = Literature.literatures.get(ID);
        if(literature.getType().equalsIgnoreCase("книга")){
            Book book = new Book();
            endDays = LocalDate.now().plusDays(book.storage);
        } else if (literature.getType().equalsIgnoreCase("журнал")){
            Magazine magazine = new Magazine();
            endDays = LocalDate.now().plusDays(magazine.storage);
        } else if (literature.getType().equalsIgnoreCase("газета")){
            Newspapper newspapper = new Newspapper();
            endDays = LocalDate.now().plusDays(newspapper.storage);
        }
        return LocalDate.now();
    }

    private void addingList(int userId, int literatureId){
        issuanceRepository.add(borrowID, userId, user.getUserType(userId), user.getUserName(userId), user.getUserSurname(userId), literatureId, literature.getLiteratureType(literatureId), literature.getLiteratureName(literatureId), literature.getLiteratureAuthor(literatureId), getStartDays(), getEndDays(literatureId));
    }

    public void borrowOutput(int userId, int literatureId){
        System.out.println("id взятия: " + borrowID + " | Имя пользователя: "
                + user.getUserName(userId) + " | Фамилия пользователя: " + user.getUserSurname(userId) +
                " | Тип литературы: " + literature.getLiteratureType(literatureId) + " | Название литературы: " +
                literature.getLiteratureName(literatureId) + " | Автор: " + literature.getLiteratureAuthor(literatureId) +
                " | Дата сделки: " + getStartDays() + " | Дата окончания: " +
                getEndDays(literatureId));
    }

    public void borrow(){
        System.out.print("Введите id клиента: ");
        int userId = scanner.nextInt();

        System.out.print("Введите id книги/журнала/газеты: ");
        int literatureId = scanner.nextInt();

        if(verification.verefication(userId, literatureId) == true) {
            userBook.addUserBook(userId);
            presence.literaturePresence(literatureId);

            borrowOutput(userId, literatureId);
            addingList(userId, literatureId);
            borrowID++;

            Exit.exit();
        }
        else{
            System.out.println("Неудача");
            Exit.exit();
        }
    }
}
