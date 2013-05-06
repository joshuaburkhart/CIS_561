public class Expr extends Node
{
    public final Primary p;
    public final ExprSub1 e1;
    public final ExprSub2 e2;

    protected Expr(int id, Primary p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.p = p
    }

    protected Expr(int id, Primary p, ExprSub1 e1)
    {
        super();
        this.PRODUCTION_ID = id;
        this.p = p;
        this.e1 = e1;
    }

    protected Expr(int id, ExprSub2 e2, Primary p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
        this.p = p;
    }

    protected Expr(int id, ExprSub2 e2, Primary p, ExprSub1 e1)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
        this.p = p;
        this.e1 = e1;
    }
}
