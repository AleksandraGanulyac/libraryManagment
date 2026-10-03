public class UserBook {

    public static void addUserBook(int id){
        for(User user:User.users){
            if(user.id == id){
                user.numberBook += 1;
            }
        }
    }

    public static void putAwayUserBook(int id){
        for(User user:User.users){
            if(user.id == id){
                user.numberBook -= 1;
            }
        }
    }
}
