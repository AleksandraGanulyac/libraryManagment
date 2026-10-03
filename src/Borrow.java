import java.time.LocalDate;
import java.util.Scanner;

public class Borrow {
    Scanner scanner = new Scanner(System.in);

    Verification verification = new Verification();

    public static int borrowID = 1;



    public String getUserName(int userId){
        for(User user:User.users) {
            if (user.id == userId) {
                String userName = user.name;
                return userName;
            }
        }
        return "0";
    }

    public String getUserSurname(int userId){
        for(User user:User.users) {
            if (user.id == userId) {
                String userSurname = user.name;
                return userSurname;
            }
        }
        return "0";
    }

    public String getLiteratureType(int literatureId){
        for(Literature l:Literature.literatures){
            if(l.id == literatureId){
                String literatureType = l.type;
                return literatureType;
            }
        }
        return "0";
    }

    public String getLiteratureName(int literatureId){
        for(Literature l:Literature.literatures){
            if(l.id == literatureId){
                String literatureName = l.name;
                return literatureName;
            }
        }
        return "0";
    }

    public String getLiteratureAuthor(int literatureId){
        for(Literature l:Literature.literatures){
            if(l.id == literatureId){
                String literatureAuthor = l.author;
                return literatureAuthor;
            }
        }
        return "0";
    }

    public LocalDate getStartDays(int literatureId){
        for(Literature l:Literature.literatures) {
            if (l.id == literatureId) {
                l.days = LocalDate.now();
                return l.days;
            }
        }
        return LocalDate.now();
    }

    public LocalDate getEndDays(int literatureId){
        for(Literature l:Literature.literatures){
            if(l.id == literatureId){
                if(l.type.equalsIgnoreCase("книга")){
                    l.endDays = getStartDays(literatureId).plusDays(30);
                } else if (l.type.equalsIgnoreCase("журнал")) {
                    l.endDays = getStartDays(literatureId).plusDays(7);
                } else if (l.type.equalsIgnoreCase("газета")) {
                    l.endDays = getStartDays(literatureId).plusDays(1);
                }
            }
            return l.endDays;
        }
        return LocalDate.now();
    }

    void addingList(int userId, int literatureId){
        issuanceRepository.add(borrowID, getUserName(userId), getUserSurname(userId), getLiteratureType(literatureId), getLiteratureName(literatureId), getLiteratureAuthor(literatureId), getStartDays(literatureId), getEndDays(literatureId));
    }

    public void borrowOutput(int userId, int literatureId){
        System.out.println("id взятия: " + borrowID + " | Имя пользователя: "
                + getUserName(userId) + " | Фамилия пользователя: " + getUserSurname(userId) +
                " | Тип литературы: " + getLiteratureType(literatureId) + " | Название литературы: " +
                getLiteratureName(literatureId) + " | Автор: " + getLiteratureAuthor(literatureId) +
                " | Дата сделки: " + getStartDays(literatureId) + " | Дата окончания: " +
                getEndDays(literatureId));
    }

    public void borrow(){
        System.out.print("Введите id клиента: ");
        int userId = scanner.nextInt();

        System.out.print("Введите id книги/журнала/газеты: ");
        int literatureId = scanner.nextInt();

        if(verification.verefication(userId, literatureId) == true) {
            AddUserBook.addUserBook(userId);
            LiteraturePresence.literaturePresence(literatureId);

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
    //Отдельные методы для 1)ввода пользователя id user и literature id +
    //                     2)получения имени, фамилии +
    //                     3)Получение типа названия и автора литературы +
    //                     4)получение даты начала и конца +
    //                     5)добавление в коллекцию +
    //                     6)вывод

}

/*
public void borrow(){
        System.out.print("Введите id клиента: ");
        int userId = scanner.nextInt();
        //реализовать пользователь не найден попробуйте снова

        System.out.print("Введите id книги/журнала/газеты: ");
        int literatureId = scanner.nextInt();
        if(verification.verefication(userId, literatureId) == true){
            AddUserBook.addUserBook(userId);
            LiteraturePresence.literaturePresence(literatureId);
            //если true AddUserBook и LiteraturePresence

            System.out.print("Пользователь: " + userId);
            for(User user:User.users){
                if(user.id == userId){
                    System.out.print(" " + user.name + " " + user.surname);
                    String userName = user.name;
                    String userSurname = user.surname;
                }
            }

            System.out.print(" | Произведение: ");
            for(Literature l:Literature.literatures){
                if(l.id == literatureId){
                    l.days = LocalDate.now();
                    if(l.type.equalsIgnoreCase("книга")){
                        l.endDays = l.days.plusDays(30);
                    } else if (l.type.equalsIgnoreCase("журнал")) {
                        l.endDays = l.days.plusDays(7);
                    } else if (l.type.equalsIgnoreCase("газета")) {
                        l.endDays = l.days.plusDays(1);
                    }
                    System.out.println(l.type + " " + l.name + " " + l.author + " | Дата начала: " + l.days + " Дата окончания: " + l.endDays);

                    String literatureType = l.type;
                    String literatureName = l.name;
                    String literatureAuthor = l.author;
                    LocalDate startDays = l.days;
                    LocalDate endDays = l.endDays;
                }
            }

            borrowID++;

            Exit.exit();
        }
 */
