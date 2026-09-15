import java.util.Scanner;

public class addBook {
    Literature literature;
    Exit exit = new Exit();
    Scanner scanner = new Scanner(System.in);


    public void addBook(){
        System.out.println("Введите тип(книга, журнал, газета): ");
        //Реализовать добавление в нужный массив в зависимости от выбора

        System.out.println("Введите название: ");
        System.out.println("Введите автора: ");
        System.out.println("Введите год издания: ");

        //реализовать вывод с ID|Тип|Название|Автор|Год издания|На сколько можно взять(в зависимости от типа)
        //реализовать выход по кнопке

        System.out.println("Хотите вернутся в меню 1-да, 2-нет");
        int choice = scanner.nextInt();

        if(choice == 1){
            Exit.exit();
        }
    }

}
