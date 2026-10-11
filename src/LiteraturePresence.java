public class LiteraturePresence {
    Literature literature = new Literature();

    public void literaturePresence(int id){
        if(literature.getPresence(id) == true){
            literature.setLiteraturePresence(id, false);
        }
        else if(literature.getPresence(id) == false){
            literature.setLiteraturePresence(id, true);
        }
    }


}
