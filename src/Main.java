import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Literature literature = new Literature();
        User user = new User();
        AddBook addBook = new AddBook();
        AddUser addUser = new AddUser();
        SearchName searchName = new SearchName();
        SearchAuthor searchAuthor = new SearchAuthor();
        Borrow borrow = new Borrow();

        int choice;
        boolean isRunning = true;


        while(isRunning){
            System.out.println("Привет! Вы находитесь в библиотеке, ведите себя пожалуйста тихо");
            System.out.println("Выберите и введите цифру");
            System.out.println("1.Добавить книгу");
            System.out.println("2.Добавить пользователя");
            System.out.println("3.Посмотреть книги");
            System.out.println("4.Выдача книги");
            System.out.println("5.Возврат книги");
            System.out.println("6.Отчеты");
            System.out.println("7.Просмотр штрафов");
            System.out.println("8.Активные выдачи пользователя");
            System.out.println("9.Погасить штраф, частично или полностью");
            System.out.println("10.Выход");
            System.out.print("Выберите и введите цифру, соответствующую нужной информации: ");
            choice = scanner.nextInt();
            if(1<= choice && choice <= 8){
                switch(choice){
                    case 1:
                        addBook.addBook();
                        break;
                    case 2:
                        addUser.addUser();
                        break;
                    case 3:
                        searchName.searchName();
                        break;
                    case 4:
                        borrow.borrow();
                        //реализовать
                        break;
                    case 5:
                        searchAuthor.searchAuthor();
                        //реализовать
                        break;
                    case 6:
                        User.output();
                        //реализовать
                        break;
                    case 7:
                        issuanceRepository.output();
                        //реализовать
                        break;
                    case 8:
                        literature.output();
                        break;
                    case 9:
                        user.output();
                        break;
                    case 10:
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Неверный символ, попробуйте еще раз");
                        break;

                }
            }else{
                System.out.println("Вы ввели неверное число, попробуйте снова");
            }
        }


        scanner.close();
    }
}
