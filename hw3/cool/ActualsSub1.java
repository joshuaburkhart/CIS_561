public class ActualsSub1 extends Node
{
    public final Expr e;
    public final ActualsSub1 a;

    protected ActualsSub1(Expr e)
    {
        super();
        this.e = e;
    }

    protected ActualsSub1(ActualsSub1 a, Expr e)
    {
        super();
        this.e = e;
        this.a = a;
    }
}
