import java.util.Scanner;

public class searchAuthor {
    Scanner scanner = new Scanner(System.in);
    Exit exit = new Exit();

    public void searchAuthor(){
        System.out.println("Книги какого автора вы ищите?");
        String search = scanner.nextLine();

        for(Literature.literature1 l:Literature.literatures){
            if (l.author().equalsIgnoreCase(search)){
                System.out.println("Вот все книги этого автора: ");
                System.out.println("id: " + l.id() + "|Тип: " + l.type() + "|Название: " + l.name() + "|Автор: " + l.author() + "|Год написания: " + l.year());
            }
            else if(l.author().toLowerCase().contains(search.toLowerCase())){
                System.out.println("Может вы имели ввиду: ");
                System.out.println(l.author());
            }
        }
        exit.exit();
        scanner.close();

    }
}
