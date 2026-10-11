import java.util.Scanner;

public class SearchAuthor {
    Literature literature = new Literature();
    Scanner scanner = new Scanner(System.in);
    Exit exit = new Exit();

    boolean found = false;
    boolean partiallyFound = false;

    public void searchAuthor(){
        System.out.println("Книги какого автора вы ищите?");
        String search = scanner.nextLine();

        for(Literature l:Literature.literatures){
            if (literature.getLiteratureAuthor().equalsIgnoreCase(search)){
               if(!found){
                   System.out.println("Вот все книги этого автора: ");
                   found = true;
               }
                System.out.println("id: " + literature.id + "|Тип: " + literature.getLiteratureType() + "|Название: " + literature.getLiteratureName() + "|Автор: " + literature.getLiteratureAuthor() + "|Год написания: " + literature.getLiteratureYear());
            }
            else if(literature.getLiteratureAuthor().toLowerCase().contains(search.toLowerCase())){
                if(!partiallyFound){
                    System.out.println("Может вы имели ввиду: ");
                    partiallyFound = true;
                }
                System.out.println(literature.getLiteratureAuthor());
            }
        }
        if(!found && !partiallyFound){
            System.out.println("К сожалению автор или книги не найдены");
        }
        exit.exit();
        scanner.close();

    }
}
