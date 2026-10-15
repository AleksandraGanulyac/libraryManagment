public class LiteraturePresence {

    public void literaturePresence(int id){
        Literature literature = Literature.literatures.get(id);
        if(literature.getPresence() == true){
            literature.setPresence(false);
        }
        else if(literature.getPresence() == false){
            literature.setPresence(true);
        }
    }


}
