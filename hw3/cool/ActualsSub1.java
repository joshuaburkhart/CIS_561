public class ActualsSub1 extends Node
{
    public final Expr e;
    public final ActualsSub1 a;

    protected ActualsSub1(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
    }

    protected ActualsSub1(int id, ActualsSub1 a, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.a = a;
    }
}
