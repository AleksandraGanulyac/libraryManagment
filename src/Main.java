import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Literature literature = new Literature();
        User user = new User();
        AddBook addBook = new AddBook();
        AddUser addUser = new AddUser();
        //SearchName searchName = new SearchName();
        SearchAuthor searchAuthor = new SearchAuthor();
        //Borrow borrow = new Borrow();

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
                        //реализовано
                        break;
                    case 2:
                        addUser.addUser();
                        //реализовано
                        break;
                    case 3:
                        user.output();
                        //literature.output();
                        //Тут плюсом поиск книг 1)по автору 2)по названию 3) по id 4)вывод по типам то есть можно посмотреть
                        //книги журналы и газеты
                        break;
                    case 4:
                        literature.output();
                        //borrow.borrow();
                        //Сделать интерфейс
                        //1) посмотреть все книги
                        //2) Найти книгу по автору
                        //3) Найти книгу по названию
                        break;
                    case 5:
                        searchAuthor.searchAuthor();
                        //возврат книги
                        //вводится id
                        //Фиксируется дата возврата
                        //Статус меняется на доступна
                        //Считается есть ли штраф
                        //Общая сумма которая накапала по книге
                        //минусуются на 1 выдачи пользователя
                        break;
                    case 6:
                        //отчеты
                        //1) Посмотреть все книги
                        //2) Книги в наличии
                        //3) Найти книги автора
                        //4) Найти книгу по типу
                        //5) Все выдачи
                        //6) Выдачи с просрочкой
                        //7) Посмотреть выдачи пользователя
                        //8) посмотреть всех штрафников
                        //9) Штрафы пользователя по id
                        // Многое будет и так реализовано просто объединяется в одном месте
                        //реализовать
                        break;
                    case 7:
                        //Все штрафники
                        //Штрафы по id
                        //реализовать
                        break;
                    case 8:
                        //Выдачи пользователя по id
                        break;
                    case 9:
                        //вводится id пользователя
                        //Все его штрафы штраф + книги за которые капает штраф
                        //Заплатить штраф
                        user.output();
                        break;
                    case 10:
                        //Выход из программы
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


//Проанализировать все ошибки чтобы не вылетало, проверка на ввод и т.д.
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

//Перевести все в HashMap