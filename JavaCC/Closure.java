public class Closure { 

    private Scope scope;
    private Evaluatable expression;

    public Closure(Scope scope, Evaluatable expression) {
        this.scope = scope;
        this.expression = expression;
    }

    public Closure(Evaluatable expression) {
        this(new Scope(), expression);
    }

    public Scope getScope() {
        return this.scope;
    }

    public Evaluatable getExpression() {
        return this.expression;
    }
}  