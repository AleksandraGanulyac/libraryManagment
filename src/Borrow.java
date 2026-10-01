import java.util.Scanner;

public class Borrow {
    Scanner scanner = new Scanner(System.in);

    Verification verification = new Verification();

    public void Borrow(){
        System.out.print("Введите id клиента: ");
        int userId = scanner.nextInt();
        //реализовать пользователь не найден попробуйте снова

        System.out.print("Введите id книги/журнала/газеты: ");
        int literatureId = scanner.nextInt();

        if(verification.verefication(userId, literatureId)){
            //если true AddUserBook и LiteraturePresence
            AddUserBook.addUserBook(userId);
            LiteraturePresence.literaturePresence(literatureId);

            //реализовать вывод
        }


    }
}
