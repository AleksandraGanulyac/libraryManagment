public class UserBook {
    User user = new User();

    public void addUserBook(int id){
        for(User user:User.users){
            if(user.id == id){
                user.setUserPlusNumberBook(id, 1);
            }
        }
    }

    public void putAwayUserBook(int id){
        for(User user:User.users){
            if(user.id == id){
                user.setUserMinusNumberBook(id, 1);
            }
        }
    }
}
