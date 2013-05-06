public class ExprSub1 extends Node
{
    public final ExprSub11 e11;
    public final Expr e;
    public final ExprSub1 e1;
    public final Cases c;
    public final Actuals a;

    protected ExprSub1(ExprSub11 e11, Expr e)
    {
        super();
        this.e11 = e11;
        this.e = e;
    }

    protected ExprSub1(ExprSub1 e1, ExprSub11 e11, Expr e)
    {
        super();
        this.e11 = e11;
        this.e1 = e1;
        this.e = e;
    }

    protected ExprSub1(Cases c)
    {
        super();
        this.c = c;
    }

    protected ExprSub1(ExprSub1 e1, Cases c)
    {
        super();
        this.e1 = e1;
        this.c = c;
    }

    protected ExprSub1(Actuals a)
    {
        super();
        this.a = a;
    }

    protected ExprSub1(ExprSub1 e1, Actuals a)
    {
        super();
        this.e1 = e1;
        this.a = a;
    }
}