import java.time.LocalDate;
import java.util.Scanner;

public class Borrow {
    Scanner scanner = new Scanner(System.in);
    UserBook userBook = new UserBook();
    LiteraturePresence presence = new LiteraturePresence();
    issuanceRepository issRep = new issuanceRepository();

    Verification verification = new Verification();

    private LocalDate endDays;

    private LocalDate getStartDays(){
        return LocalDate.now();
    }

    private LocalDate getEndDays(int ID){
        Literature literature = Literature.literatures.get(ID);
        if(literature.getType().equalsIgnoreCase("книга")){
            Book book = new Book();
            return endDays = LocalDate.now().plusDays(book.storage);
        } else if (literature.getType().equalsIgnoreCase("журнал")){
            Magazine magazine = new Magazine();
            return endDays = LocalDate.now().plusDays(magazine.storage);
        } else if (literature.getType().equalsIgnoreCase("газета")){
            Newspapper newspapper = new Newspapper();
            return endDays = LocalDate.now().plusDays(newspapper.storage);
        }
        return LocalDate.now();
    }

    private void addingList(int userID, int literatureID){
        User user1 = User.users.get(userID);
        Literature literature1 = Literature.literatures.get(literatureID);

        issRep.add(issRep.ID, userID, user1.getType(), user1.getName(),
                user1.getSurname(),literatureID, literature1.getType(), literature1.getName(),
                literature1.getAuthor(), LocalDate.now(), getEndDays(literatureID));
    }

    public void borrowOutput(){
        issRep.outputByID(issRep.ID);
    }

    public void borrow(){
        System.out.print("Введите id клиента: ");
        int userId = scanner.nextInt();

        System.out.print("Введите id книги/журнала/газеты: ");
        int literatureId = scanner.nextInt();

        if(verification.verefication(userId, literatureId) == true) {
            userBook.addUserBook(userId);
            presence.literaturePresence(literatureId);

            addingList(userId, literatureId);
            borrowOutput();
            issRep.ID++;

            Exit.exit();
        }
        else{
            System.out.println("Неудача");
            Exit.exit();
        }
    }
}
