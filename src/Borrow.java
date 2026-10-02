import java.util.Scanner;

public class Borrow {
    Scanner scanner = new Scanner(System.in);

    Verification verification = new Verification();

    public void borrow(){
        System.out.print("Введите id клиента: ");
        int userId = scanner.nextInt();
        //реализовать пользователь не найден попробуйте снова

        System.out.print("Введите id книги/журнала/газеты: ");
        int literatureId = scanner.nextInt();

        if(verification.verefication(userId, literatureId) == true){
            //если true AddUserBook и LiteraturePresence
            System.out.print("Пользователь: " + userId);
            for(User user:User.users){
                if(user.id == userId){
                    System.out.print(" " + user.name + " " + user.surname);;
                }
            }

            System.out.print(" | Произведение: ");
            for(Literature l:Literature.literatures){
                if(l.id == literatureId){
                    System.out.println(l.type + " " + l.name + " " + l.author);
                }
            }

            AddUserBook.addUserBook(userId);
            LiteraturePresence.literaturePresence(literatureId);

            Exit.exit();
        }
    }
}
