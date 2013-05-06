public class ExprSub2 extends Node
{
    public final ExprSub2 e2;
    public final Expr e;
    public final Expr ee;
    public final Id i;

    protected ExprSub2(int id, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
    }

    protected ExprSub2(int id, ExprSub2 e2, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2
        this.i = i;
    }

    protected ExprSub2(int id)
    {
        super();
        this.PRODUCTION_ID = id;
    }

    protected ExprSub2(int id, ExprSub2 e2)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
    }
    

    protected ExprSub2(int id, Expr e, Expr ee)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.ee = ee;
    }

    protected ExprSub2(int id, ExprSub2 e2, Expr e, Expr ee)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
        this.e = e;
        this.ee = ee;
    }

    protected ExprSub2(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
    }

    protected ExprSub2(int id, ExprSub2 e2, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
        this.e = e;
    }
}
