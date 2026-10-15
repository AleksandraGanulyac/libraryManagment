public class UserBook {

    public void addUserBook(int id){
        User user1 = User.users.get(id);
        user1.setNumberBook(user1.getNumberBook()+1);
    }

    public void putAwayUserBook(int id){
        User user1 = User.users.get(id);
        user1.setNumberBook(user1.getNumberBook()-1);
    }
}
