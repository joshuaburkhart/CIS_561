public class Expr extends Node
{
    public final Primary p;
    public final ExprSub1 e1;
    public final ExprSub2 e2;

    protected Expr(Primary p)
    {
        super();
        this.p = p
    }

    protected Expr(Primary p, ExprSub1 e1)
    {
        super();
        this.p = p;
        this.e1 = e1;
    }

    protected Expr(ExprSub2 e2, Primary p)
    {
        super();
        this.e2 = e2;
        this.p = p;
    }

    protected Expr(ExprSub2 e2, Primary p, ExprSub1 e1)
    {
        super();
        this.e2 = e2;
        this.p = p;
        this.e1 = e1;
    }
}
