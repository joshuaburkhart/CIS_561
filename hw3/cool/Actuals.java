public class Actuals extends Node
{
    public final Expr e;
    public final ActualsSub1 a;

    protected Actuals(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = null;
        this.a = null;
    }

    protected Actuals(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.a = null;
    }

    protected Actuals(int id, ActualsSub1 a, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.a = a;
        this.e = e;
    }
}
