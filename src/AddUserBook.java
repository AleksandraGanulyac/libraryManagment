public class AddUserBook {

    public static void addUserBook(int id){
        for(User user:User.users){
            if(user.id == id){
                user.numberBook += 1;
            }
        }
    }
}
