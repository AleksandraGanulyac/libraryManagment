public class Verification {
    UserBookVerification userBookVerification = new UserBookVerification();
    LiteraturePresenceVerification literaturePresenceVerification = new LiteraturePresenceVerification();
    public boolean verefication(int userID, int bookID){
        if(userBookVerification.userBookVerefication(userID) && literaturePresenceVerification.literaturePresenceVerefication(bookID)){
            return true;
        }
        else if(userBookVerification.userBookVerefication(userID) && !literaturePresenceVerification.literaturePresenceVerefication(bookID)){
            System.out.println("Книги нет в наличии");
            return false;
        }
        else if(!userBookVerification.userBookVerefication(userID) && literaturePresenceVerification.literaturePresenceVerefication(bookID)){
            System.out.println("У пользователя превышен лимит");
            return false;
        }
        return false;
    }
}
