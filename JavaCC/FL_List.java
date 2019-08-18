import java.util.LinkedList;
import java.util.Collection;

public class FL_List extends LinkedList<Object> implements Evaluatable {

    private Scope scope;

    public FL_List(Collection<Object> e) {
        super(e);
        this.scope = new Scope();
    }

    public FL_List() {
        super();
        this.scope = new Scope();
    }

    @Override
    public boolean equalsWithScope(Object o, Scope scope) throws Exception { 
        if(o instanceof FL_List) {
            FL_List other = (FL_List) o;
            if(this.size() == other.size()) {
                for(int i = 0; i < this.size(); i++) {
                    Object o1 = ForteLang.evaluate(scope, this.get(i));
                    Object o2 = ForteLang.evaluate(scope, other.get(i));
                    if(!o1.equals(o2)) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false; 
        }
    }

    @Override
	public Scope getLocalScope() {
		return this.scope;
	}
}  