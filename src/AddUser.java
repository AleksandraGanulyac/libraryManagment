import java.util.Scanner;

public class AddUser {
    Student student = new Student();
    Teacher teacher = new Teacher();
    Exit exit = new Exit();
    User user = new User();
    Scanner scanner = new Scanner(System.in);

    public static int id = 1;
    private boolean choice = true;

    public void increment() {
        id++;
    }

    public int getId() {
        return id;
    }

    //Распределение по типам
    private void distributionByType(){
        if(user.getTypeByID(id).equals("Студент")){
            student.add(getId(), user.getNameByID(getId()), user.getSurnameByID(getId()), user.getTypeByID(getId()), user.getBirthdayByID(getId()));
        } else if (user.getTypeByID(id).equals("Преподаватель")) {
            teacher.add(getId(), user.getNameByID(getId()), user.getSurnameByID(getId()), user.getTypeByID(getId()), user.getBirthdayByID(getId()));
        }
        else{
            System.out.println("Вы неверно ввели тип попробуйте снова");
            Continue();
        }
    }

    private String type(){
        System.out.println("Введите тип(студент, преподаватель): ");
        // какая нибудь проверка на текст чтобы не вылетало с ошибкой
        String type = scanner.nextLine();
        if (!type.isEmpty()){
            type = type.substring(0,1).toUpperCase() + type.substring(1).toLowerCase();
        }
        return type;
    }

    private String name(){
        System.out.println("Введите Имя: ");
        String name = scanner.nextLine();// какая нибудь проверка на текст чтобы не вылетало с ошибкой
        if (!name.isEmpty()){
            name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        }
        return name;
    }

    private String surname(){
        System.out.println("Введите Фамилию: ");
        String surname = scanner.nextLine();// какая нибудь проверка на текст чтобы не вылетало с ошибкой
        if (!surname.isEmpty()){
            surname = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
        }
        return surname;
    }

    private int year(){
        System.out.println("Введите год рождения: ");
        int year = scanner.nextInt(); // какая нибудь проверка на число чтобы не вылетало с ошибкой
        return year;
    }

    private void output(){
        System.out.println("Вы добавили: ");
        System.out.printf("ID: " + getId() + " | Имя: %s | Фамилия: %s | Тип(преподаватель, студент): %s | Год рождения: %s",
                user.getName(), user.getSurname(), user.getType(), user.getBirthday());
    }

    public void addUser(){
        user.add(getId(), name(), surname(), type(), year());
        distributionByType();
        System.out.println("Вы добавили: ");
        user.outputByID(getId());
        increment();
        Continue();
    }

    public void Continue(){
        System.out.println("\nХотите ввести еще пользователя(1-да, 2-нет): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                addUser();
                break;
            case 2:
                Exit.exit();
                break;
            default:
                System.out.println("Неверная цифра попробуйте снова");
                Continue();
                break;
        }
        scanner.close();
    }

}
