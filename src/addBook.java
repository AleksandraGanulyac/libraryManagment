import java.util.Scanner;

public class addBook {
    Literature literature = new Literature();
    Book book = new Book();
    Magazine magazine = new Magazine();
    Newspapper newspapper = new Newspapper();

    Exit exit = new Exit();
    Scanner scanner = new Scanner(System.in);
    public String name;
    public String author;
    public int year;
    public String type;
    private static int id = 1;

    public void increment() {
        id++;
    }

    public int getId() {
        return id;
    }

    public void addBook(){
        System.out.println("Введите тип(книга, журнал, газета): ");
        type = scanner.nextLine().substring(0,1).toUpperCase() + type.substring(1);// какая нибудь проверка на текст чтобы не вылетало с ошибкой
        //Реализовать добавление в нужный массив в зависимости от выбора

        System.out.println("Введите название: ");
        name = scanner.nextLine().substring(0,1).toUpperCase() + name.substring(1);; // какая нибудь проверка на текст чтобы не вылетало с ошибкой
        System.out.println("Введите автора: ");
        author = scanner.nextLine().substring(0,1).toUpperCase() + author.substring(1);;// какая нибудь проверка на текст чтобы не вылетало с ошибкой
        System.out.println("Введите год издания: ");
        year = scanner.nextInt(); // какая нибудь проверка на число чтобы не вылетало с ошибкой

        //реализовать вывод с ID|Тип|Название|Автор|Год издания|На сколько можно взять(в зависимости от типа)
        //реализовать id с автоматическим увелечением
        //реализовать добавление в ArrayList
        Literature.add(getId(), type,  name, author, year);
        if(type.equals("Книга")){
            book.add(getId(), name, author, year);
        } else if (type.equals("Журнал")) {
            magazine.add(getId(), name, author, year);
        } else if (type.equals("Газета")) {
            newspapper.add(getId(), name, author, year);
        }
        else{
            System.out.println("Вы неверно ввели тип попробуйте снова");
            addBook();
        }
        increment();


        //Вывод введенной информации перед возвратом в меню
        System.out.println("Хотите вернутся в меню 1-да, 2-нет"); //если нет, то начинается добавление еще одной книги
        int choice = scanner.nextInt();

        if(choice == 1){
            Exit.exit();
        }
        else{
            addBook();
        }
    }

}
