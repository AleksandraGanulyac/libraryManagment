public class AddUserBook {
    User user = new User();

    public void addUserBook(int id){
        for(User user:User.users){
            if(user.id == id){
                user.numberBook += 1;
            }
        }
    }
}
