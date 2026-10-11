public class UserBookVerification {
    User user = new User();
    public boolean userBookVerefication(int id){
        for(User user:User.users){
            if(user.id == id){
                //получаем количество книг, создать getter
                if(user.getUserType(id).equalsIgnoreCase("студент")){
                    if(user.getUserNumberBook(id) < 3){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(user.getUserType(id).equalsIgnoreCase("преподаватель")){
                    if(user.getUserNumberBook(id) < 10){
                        return true;
                    }
                    else{
                        return false;
                    }
                }

            }

        }
        return false; // реализовать пользователь не найден
    }
}
