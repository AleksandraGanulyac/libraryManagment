import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        addBook addBook = new addBook();
        addUser addUser = new addUser();
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
            System.out.println("6.Просмотр Штрафов");
            System.out.println("7.Отчеты");
            System.out.println("8.Выход");
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
                        Literature.output();
                    case 4:
                        User.output();
                        //реализовать
                        break;
                    case 5:
                        //реализовать
                        break;
                    case 6:
                        //реализовать
                        break;
                    case 7:
                        //реализовать
                        break;
                    case 8:
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
