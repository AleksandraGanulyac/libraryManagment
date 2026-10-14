import java.util.Map;
import java.util.Scanner;

public class SearchName {
    Literature literature = new Literature();
    Scanner scanner = new Scanner(System.in);
    Exit exit = new Exit();

    private static boolean found = false;
    private static boolean partiallyFound = false;

    private void searchBook(String search){
        for(Map.Entry<Integer, Literature> entry: Literature.literatures.entrySet()) {
            Integer ID = entry.getKey();
            Literature literature1 = entry.getValue();

            if(literature1.getName().equalsIgnoreCase(search)){
                if(!found){
                    System.out.println("Книга найдена!");
                    found = true;
                }
                System.out.println("id: " + ID + "|Тип: " +
                        literature1.getType() + "|Название: " +
                        literature1.getName() + "|Автор: " +
                        literature1.getAuthor() + "|Год написания: "
                        + literature1.getYear());
            }
            else if(literature1.getName().toLowerCase().contains(search)){
                if(!partiallyFound){
                    System.out.println("Возможно вы имели ввиду: ");
                    partiallyFound = true;
                }
                System.out.println("id: " + ID + "|Тип: " +
                        literature1.getType() + "|Название: " +
                        literature1.getName() + "|Автор: " +
                        literature1.getAuthor() + "|Год написания: "
                        + literature1.getYear());
            }
        }
        if (!found && !partiallyFound) {
            System.out.println("Книга не найдена");
        }
    }

    public void searchName(){
        System.out.println("Какую книгу вы ищите? ");
        String search = scanner.nextLine().toLowerCase();
        searchBook(search);
        found = false;
        partiallyFound = false;
        exit.exit();


    }


}
