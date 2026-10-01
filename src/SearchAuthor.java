import java.util.Scanner;

public class SearchAuthor {
    Scanner scanner = new Scanner(System.in);
    Exit exit = new Exit();

    boolean found = false;
    boolean partiallyFound = false;

    public void searchAuthor(){
        System.out.println("Книги какого автора вы ищите?");
        String search = scanner.nextLine();

        for(Literature l:Literature.literatures){
            if (l.author.equalsIgnoreCase(search)){
               if(!found){
                   System.out.println("Вот все книги этого автора: ");
                   found = true;
               }
                System.out.println("id: " + l.id + "|Тип: " + l.type + "|Название: " + l.name + "|Автор: " + l.author + "|Год написания: " + l.year);
            }
            else if(l.author.toLowerCase().contains(search.toLowerCase())){
                if(!partiallyFound){
                    System.out.println("Может вы имели ввиду: ");
                    partiallyFound = true;
                }
                System.out.println(l.author);
            }
        }
        if(!found && !partiallyFound){
            System.out.println("К сожалению автор или книги не найдены");
        }
        exit.exit();
        scanner.close();

    }
}
