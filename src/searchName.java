import java.util.Scanner;

public class searchName {
    Scanner scanner = new Scanner(System.in);
    Exit exit = new Exit();

    public void searchName(){
        System.out.println("Какую книгу вы ищите? ");
        String enter = scanner.nextLine().toLowerCase();

        for(Literature.literature1 l:Literature.literatures){
            if(l.name().equalsIgnoreCase(enter)){
                System.out.println("Книга найдена!");
                System.out.println("id: " + l.id() + "|Тип: " + l.type() + "|Название: " + l.name() + "|Автор: " + l.author() + "|Год написания: " + l.year());
            }
            else if(l.name().toLowerCase().contains(enter)){
                System.out.println("Найдено частичное совпадение");
                System.out.println("id: " + l.id() + "|Тип: " + l.type() + "|Название: " + l.name() + "|Автор: " + l.author() + "|Год написания: " + l.year());
            }
            else if (!l.name().toLowerCase().contains(enter)){
                System.out.println("Книга не найдена");
            }
        }
        exit.exit();
        scanner.close();
    }


}
