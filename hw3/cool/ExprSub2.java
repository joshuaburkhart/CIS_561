public class ExprSub2 extends Node
{
    public final ExprSub2 e2;
    public final Expr e;
    public final Expr ee;
    public final String i;

    protected ExprSub2(int id, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.e = null;
        this.ee = null;
        this.e2 = null;
    }

    protected ExprSub2(int id, ExprSub2 e2, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
        this.i = i;
        this.e = null;
        this.ee = null;
    }

    protected ExprSub2(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = null;
        this.i = null;
        this.e = null;
        this.ee = null;
    }

    protected ExprSub2(int id, ExprSub2 e2)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
        this.i = null;
        this.e = null;
        this.ee = null;
    }
    

    protected ExprSub2(int id, Expr e, Expr ee)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.ee = ee;
        this.e2 = null;
        this.i = null;
    }

    protected ExprSub2(int id, ExprSub2 e2, Expr e, Expr ee)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
        this.e = e;
        this.ee = ee;
        this.i = null;
    }

    protected ExprSub2(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.e2 = null;
        this.ee = null;
        this.i = null;
    }

    protected ExprSub2(int id, ExprSub2 e2, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e2 = e2;
        this.e = e;
        this.ee = null;
        this.i = null;
    }
}
