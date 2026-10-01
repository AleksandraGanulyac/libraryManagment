public class LiteraturePresenceVerification {
    public boolean literaturePresenceVerefication(int id){
        for(Literature l:Literature.literatures){
            if(id == l.id){
                //получаем количество книг, создать getter
                if(l.presence){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
}
