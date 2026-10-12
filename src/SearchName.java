/*import java.util.Scanner;

public class SearchName {
    Literature literature = new Literature();
    Scanner scanner = new Scanner(System.in);
    Exit exit = new Exit();

    public void searchName(){
        System.out.println("Какую книгу вы ищите? ");
        String enter = scanner.nextLine().toLowerCase();

        for(Literature l:Literature.literatures){
            if(literature.getLiteratureName().equalsIgnoreCase(enter)){
                System.out.println("Книга найдена!");
                System.out.println("id: " + l.id + "|Тип: " + literature.getLiteratureType() + "|Название: " + literature.getLiteratureName() + "|Автор: " + literature.getLiteratureAuthor() + "|Год написания: " + literature.getLiteratureYear());
            }
            else if(literature.getLiteratureName().toLowerCase().contains(enter)){
                System.out.println("Найдено частичное совпадение");
                System.out.println("id: " + l.id + "|Тип: " + literature.getLiteratureType() + "|Название: " + literature.getLiteratureName() + "|Автор: " + literature.getLiteratureAuthor() + "|Год написания: " + literature.getLiteratureYear());
            }
            else if (!literature.getLiteratureName().toLowerCase().contains(enter)){
                System.out.println("Книга не найдена");
            }
        }
        exit.exit();
        scanner.close();
    }


}*/
