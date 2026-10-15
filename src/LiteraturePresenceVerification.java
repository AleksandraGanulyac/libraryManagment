public class LiteraturePresenceVerification {

    public boolean literaturePresenceVerefication(int id) {
        //получаем количество книг, создать getter
        Literature literature = Literature.literatures.get(id);
        if (literature.getPresence()) {
            return true;
        } else {
            return false;
        }
    }
}
