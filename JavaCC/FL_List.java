import java.util.LinkedList;
import java.util.Collection;

public class FL_List extends LinkedList<Object> implements Evaluatable {
    public FL_List(Collection e) {
        super(e);
    }

    public FL_List() {
        super();
    }
}  