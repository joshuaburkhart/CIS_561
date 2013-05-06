public class Actuals extends Node
{
    public final Expr e;
    public final ActualsSub1 a;

    protected Actuals()
    {
        super();
    }

    protected Actuals(Expr e)
    {
        super();
        this.e = e;
    }

    protected Actuals(ActualsSub1 a, Expr e)
    {
        super();
        this.a = a;
        this.e = e;
    }
}
