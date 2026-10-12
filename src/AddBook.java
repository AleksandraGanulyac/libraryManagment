import java.util.Scanner;

public class AddBook {
    Literature literature = new Literature();
    Exit exit = new Exit();
    Scanner scanner = new Scanner(System.in);

    private static int id = 1;
    public boolean choice = true;

    public void increment() {
        id++;
    }

    public int getId() {
        return id;
    }

    private String type(){
        System.out.println("Введите тип(книга, журнал, газета): ");
        String type = scanner.nextLine();// какая нибудь проверка на текст чтобы не вылетало с ошибкой
        if (!type.isEmpty()){
            type = type.substring(0,1).toUpperCase() + type.substring(1).toLowerCase();
        }
        return type;
    }

    private String name(){
        System.out.println("Введите название: ");
        String name = scanner.nextLine();// какая нибудь проверка на текст чтобы не вылетало с ошибкой
        if (!name.isEmpty()){
            name = name.substring(0,1).toUpperCase() +name.substring(1).toLowerCase();
        }
        return name;
    }

    private String author(){
        System.out.println("Введите автора: ");
        String author = scanner.nextLine();// какая нибудь проверка на текст чтобы не вылетало с ошибкой
        if (!author.isEmpty()){
           author =  author.substring(0,1).toUpperCase() + author.substring(1).toLowerCase();
        }
        return author;
    }

    private int year(){
        System.out.println("Введите год издания: ");
        int year = scanner.nextInt(); // какая нибудь проверка на число чтобы не вылетало с ошибкой
        scanner.nextLine();
        return year;
    }

    /*private void distributionByType(){
        if(literature.getTypeByID(getId()).equals("Книга")){
            Book.add(getId(), literature.getNameByID(getId()), literature.getAuthorByID(getId()), literature.getYearByID(getId()));
        } else if (literature.getTypeByID(getId()).equals("Журнал")) {
            Magazine.add(getId(), literature.getNameByID(getId()), literature.getAuthorByID(getId()), literature.getYearByID(getId()));
        } else if (literature.getTypeByID(getId()).equals("Газета")) {
            Newspapper.add(getId(), literature.getNameByID(getId()), literature.getAuthorByID(getId()), literature.getYearByID(getId()));
        }
        else{
            System.out.println("Вы неверно ввели тип попробуйте снова");
            Exit.exit();
        }
    }*/

    public void addBook(){
        literature.add(getId(), type(), name(), author(), year());
        //distributionByType();

        literature.outputByID(getId());
        increment();

        Continue();
        //Вывод введенной информации перед возвратом в меню
        //если нет, то начинается добавление еще одной книги

    }
    public void Continue(){
        System.out.println("\nХотите ввести еще книгу(1-да, 2-нет): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                addBook();
                break;
            case 2:
                Exit.exit();
                break;
            default:
                System.out.println("Неверная цифра попробуйте снова");
                Continue();
                break;
        }
    }

}




