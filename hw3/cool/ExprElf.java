public class ExprElf extends Node
{
    public final ExprSub11 e11;
    public final ExprSub2 e2;
    public final Primary p;
    public final String i;
    public final Actuals a;
    public final Cases c;

    protected ExprElf(int id, ExprSub11 e11, ExprSub2 e2, Primary p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = e11;
        this.e2 = e2;
        this.p = p;
        this.i = null;
        this.a = null;
        this.c = null;
    }

    protected ExprElf(int id, ExprSub11 e11, Primary p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = e11;
        this.e2 = null;
        this.p = p;
        this.i = null;
        this.a = null;
        this.c = null;
    }

    protected ExprElf(int id, Cases c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = null;
        this.e2 = null;
        this.p = null;
        this.i = null;
        this.a = null;
        this.c = c;
    }

    protected ExprElf(int id, String i, Actuals a)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = null;
        this.e2 = null;
        this.p = null;
        this.i = i;
        this.a = a;
        this.c = null;
    }

}
