public class ExprSub1 extends Node
{
    public final ExprSub11 e11;
    public final Expr e;
    public final ExprSub1 e1;
    public final Cases c;
    public final Actuals a;
    public final Id i;

    protected ExprSub1(int id, ExprSub11 e11, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = e11;
        this.e = e;
    }

    protected ExprSub1(int id, ExprSub1 e1, ExprSub11 e11, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = e11;
        this.e1 = e1;
        this.e = e;
    }

    protected ExprSub1(int id, Cases c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.c = c;
    }

    protected ExprSub1(int id, ExprSub1 e1, Cases c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e1 = e1;
        this.c = c;
    }

    protected ExprSub1(int id, Actuals a, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.a = a;
        this.i = i;
    }

    protected ExprSub1(int id, ExprSub1 e1, Actuals a, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e1 = e1;
        this.a = a;
        this.i = i;
    }
}
