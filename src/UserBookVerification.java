public class UserBookVerification {
    public boolean userBookVerefication(int id){
        for(User user:User.users){
            if(id == user.id){
                //получаем количество книг, создать getter
                if(user.type.equalsIgnoreCase("студент")){
                    if(user.numberBook <= 3){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(user.type.equalsIgnoreCase("преподаватель")){
                    if(user.numberBook <= 10){
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
