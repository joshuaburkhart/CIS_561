public class ExprSub2 extends Node
{
    public final int i;
    public final ExprSub2 e2;
    public final Expr e;
    public final Expr ee;

    protected ExprSub2(int i)
    {
        super();
        this.i = i;
    }

    protected ExprSub2(ExprSub2 e2, int i)
    {
        super();
        this.e2 = e2
        this.i = i;
    }

    protected ExprSub2(Expr e, Expr ee)
    {
        super();
        this.e = e;
        this.ee = ee;
    }

    protected ExprSub2(ExprSub2 e2, Expr e, Expr ee)
    {
        super();
        this.e2 = e2;
        this.e = e;
        this.ee = ee;
    }

    protected ExprSub2(Expr e)
    {
        super();
        this.e = e;
    }

    protected ExprSub2(ExprSub2 e2, Expr e)
    {
        super();
        this.e2 = e2;
        this.e = e;
    }
}
