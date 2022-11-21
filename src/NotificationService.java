import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    String duckType;
    public List<Listeners> listeners = new ArrayList<Listeners>(); 

    public void setDuckType(String duckType) {
        this.duckType = duckType;
    }

    public void addListener(Listeners listener) {
        listeners.add(listener);
    }

    public void removeListener(Listeners listener) {
        listeners.remove(listener);
    }

    public void notifyListeners() {
        for (Listeners listener : listeners) {
            if(listener.interest.equals(duckType)) {
                listener.onEvent();
            }
        }
    }

}
