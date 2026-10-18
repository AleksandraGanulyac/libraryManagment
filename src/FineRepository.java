import java.util.HashMap;
import java.util.Map;

public class FineRepository {
    Map<Integer, Fine> fineRepo = new HashMap<>();

    public void add(int ID, int userID, int literatureID){
        fineRepo.put(ID, new Fine(userID, literatureID));
    }

    public void delete(int ID){
        fineRepo.remove(ID);
    }
}
