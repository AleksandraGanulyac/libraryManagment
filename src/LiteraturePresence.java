public class LiteraturePresence {
    public void literaturePresence(int id){
        for(Literature l:Literature.literatures){
            if(l.id == id){
                l.presence = false;
            }
        }
    }
}
