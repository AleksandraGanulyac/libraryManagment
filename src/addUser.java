import java.util.Scanner;

public class addUser {
    User user = new User();
    Teacher teacher = new Teacher();
    Student student = new Student();
    Exit exit = new Exit();
    Scanner scanner = new Scanner(System.in);

    public static int id = 1;
    public static String name;
    public static String surname;
    public static String type;
    public boolean choice = true;
    public static int year;

    public void increment() {
        id++;
    }

    public int getId() {
        return id;
    }

    public void addUser(){
        while(choice){
            System.out.println("Введите тип(студент, преподаватель): ");
            type = scanner.nextLine();// какая нибудь проверка на текст чтобы не вылетало с ошибкой
            if (!type.isEmpty()){
                type = type.substring(0,1).toUpperCase() + type.substring(1);
            }
            //Реализовать добавление в нужный массив в зависимости от выбора

            System.out.println("Введите Имя: ");
            name = scanner.nextLine();// какая нибудь проверка на текст чтобы не вылетало с ошибкой
            if (!name.isEmpty()){
                name = name.substring(0,1).toUpperCase() + name.substring(1);
            }

            System.out.println("Введите Фамилию: ");
            surname = scanner.nextLine();// какая нибудь проверка на текст чтобы не вылетало с ошибкой
            if (!surname.isEmpty()){
                surname = surname.substring(0,1).toUpperCase() + surname.substring(1);
            }

            System.out.println("Введите год рождения: ");
            year = scanner.nextInt(); // какая нибудь проверка на число чтобы не вылетало с ошибкой

            //реализовать вывод с ID|Тип|Название|Автор|Год издания|На сколько можно взять(в зависимости от типа)
            //реализовать id с автоматическим увелечением
            //реализовать добавление в ArrayList
            if(type.equals("Студент")){
                student.add(getId(), name, surname, year);
            } else if (type.equals("Преподаватель")) {
                student.add(getId(), name, surname, year);
            }
            else{
                System.out.println("Вы неверно ввели тип попробуйте снова");
                Exit.exit();
            }
            User.add(getId(),  name,  surname, type, year);
            increment();

            Exit.exit();
        }
        scanner.close();
    }


}
