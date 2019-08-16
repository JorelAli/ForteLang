import java.util.LinkedList;
import java.util.Collection;

public class FL_List extends LinkedList<Object> implements Evaluatable {
    public FL_List(Collection<Object> e) {
        super(e);
    }

    public FL_List() {
        super();
    }

    @Override
    public boolean equalsWithScope(Object o, FL_Set scope) { 
        return false; 
    }
}  