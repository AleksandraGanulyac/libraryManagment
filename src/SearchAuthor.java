import java.util.Map;
import java.util.Scanner;

public class SearchAuthor {
    Literature literature = new Literature();
    Scanner scanner = new Scanner(System.in);
    Exit exit = new Exit();

    private static boolean found = false;
    private static boolean partiallyFound = false;

    private void searchBook(String search){
        for(Map.Entry<Integer, Literature> entry: Literature.literatures.entrySet()){
            Integer ID = entry.getKey();
            Literature literature1 = entry.getValue();

            if(literature1.getAuthor().equalsIgnoreCase(search)){
                if(!found){
                    System.out.println("Вот все книги этого автора: ");
                    found = true;
                }
                System.out.println("id: " + ID + "|Тип: " +
                        literature1.getType() + "|Название: " +
                        literature1.getName() + "|Автор: " +
                        literature1.getAuthor() + "|Год написания: "
                        + literature1.getYear());

            }
            else if(literature1.getAuthor().toLowerCase().contains(search.toLowerCase())){
                if(!partiallyFound){
                    System.out.println("Может вы имели ввиду: ");
                    partiallyFound = true;
                }
                System.out.println(literature1.getAuthor());
            }
        }
        if(!found && !partiallyFound){
            System.out.println("К сожалению автор или книги не найдены");
        }
    }
    public void searchAuthor(){
        System.out.println("Книги какого автора вы ищите?");
        String search = scanner.nextLine();
        searchBook(search);
        found = false;
        partiallyFound = false;
        exit.exit();

    }
}
