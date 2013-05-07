public class ExprSub1 extends Node
{
    public final ExprSub11 e11;
    public final ExprSub1 e1;
    public final Cases c;
    public final ExprSub2 e2;
    public final Actuals a;
    public final String i;
    public final Primary p;

    protected ExprSub1(int id, ExprSub11 e11, ExprSub2 e2, Primary p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = e11;
        this.e2 = e2;
        this.p = p;
        this.e1 = null;
        this.c = null;
        this.a = null;
        this.i = null;
    }

    protected ExprSub1(int id, ExprSub11 e11, Primary p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = e11;
        this.e1 = null;
        this.p = p;
        this.c = null;
        this.i = null;
        this.a = null;
        this.e2 = null;
    }

    protected ExprSub1(int id, ExprSub1 e1, ExprSub11 e11, ExprSub2 e2, Primary p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = e11;
        this.e1 = e1;
        this.e2 = e2;
        this.p = p;
        this.c = null;
        this.i = null;
        this.a = null;
    }

    protected ExprSub1(int id, ExprSub1 e1, ExprSub11 e11, Primary p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e11 = e11;
        this.e1 = e1;
        this.p = p;
        this.c = null;
        this.i = null;
        this.a = null;
        this.e2 = null;
    }

    protected ExprSub1(int id, Cases c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.c = c;
        this.e11 = null;
        this.e2 = null;
        this.e1 = null;
        this.a = null;
        this.i = null;
        this.p = null;
    }

    protected ExprSub1(int id, ExprSub1 e1, Cases c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e1 = e1;
        this.c = c;
        this.e11 = null;
        this.e2 = null;
        this.a = null;
        this.i = null;
        this.p = null;
    }

    protected ExprSub1(int id, Actuals a, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.a = a;
        this.i = i;
        this.e1 = null;
        this.c = null;
        this.e11 = null;
        this.e2 = null;
        this.p = null;
    }

    protected ExprSub1(int id, ExprSub1 e1, Actuals a, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e1 = e1;
        this.a = a;
        this.i = i;
        this.e11 = null;
        this.e2 = null;
        this.c = null;
        this.p = null;
    }
}
