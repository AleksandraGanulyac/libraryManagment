import java.util.Scanner;

public class addBook {
    Literature literature = new Literature();
    Exit exit = new Exit();
    Scanner scanner = new Scanner(System.in);
    public String name;
    public String author;
    public int year;
    public String type;

    public void addBook(){
        int id = 1;
        System.out.println("Введите тип(книга, журнал, газета): ");
        type = scanner.nextLine();
        //Реализовать добавление в нужный массив в зависимости от выбора

        System.out.println("Введите название: ");
        name = scanner.nextLine();
        System.out.println("Введите автора: ");
        author = scanner.nextLine();
        System.out.println("Введите год издания: ");
        year = scanner.nextInt();

        //реализовать вывод с ID|Тип|Название|Автор|Год издания|На сколько можно взять(в зависимости от типа)
        //реализовать id с автоматическим увелечением
        //реализовать добавление в ArrayList
        Literature.add(id, type,  name, author, year);
        id++;
        System.out.println("Хотите вернутся в меню 1-да, 2-нет");
        int choice = scanner.nextInt();

        if(choice == 1){
            Exit.exit();
        }
    }

}
