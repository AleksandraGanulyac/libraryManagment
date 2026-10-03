public class LiteraturePresence {
    public static void literaturePresence(int id){
        for(Literature l:Literature.literatures){
            if(l.id == id && l.presence == true){
                l.presence = false;
            }
            else if(l.id == id && l.presence == false){
                l.presence = true;
            }
        }
    }
}
