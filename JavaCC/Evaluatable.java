public interface Evaluatable { 
    public Scope getLocalScope();
    public boolean equalsWithScope(Object o, Scope scope) throws Exception;
}  