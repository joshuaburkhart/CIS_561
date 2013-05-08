public class Primary extends Node
{
    public final Actuals a;
    public final Block b;
    public final Expr e;
    public final String i;
    public final String n;
    public final String t;
    public final String o;
    public final String s;

    protected Primary(String t, int id, Actuals a)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.a = a;
        this.i = null;
        this.b = null;
        this.e = null;
        this.n = null;
        this.t = t;
        this.o = null;
        this.s = null;
    }

    protected Primary(int id, Actuals a, String i)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.a = a;
        this.i = i;
        this.b = null;
        this.e = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.s = null;
    }

    protected Primary(int id, Actuals a)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.a = a;
        this.i = null;
        this.b = null;
        this.e = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.s = null;
    }

    protected Primary(int id, Block b)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.b = b;
        this.a = null;
        this.i = null;
        this.e = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.s = null;
    }

    protected Primary(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.e = e;
        this.b = null;
        this.a = null;
        this.i = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.s = null;
    }

    protected Primary(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.a = null;
        this.e = null;
        this.b = null;
        this.i = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.s = null;
    }

    protected Primary(String n, int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.n = n;
        this.a = null;
        this.e = null;
        this.b = null;
        this.i = null;
        this.t = null;
        this.o = null;
        this.s = null;
    }

    protected Primary(int id, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.b = null;
        this.a = null;
        this.e = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.s = null;
    }

    protected Primary(int id, String o, int dummy)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = null;
        this.b = null;
        this.a = null;
        this.e = null;
        this.n = null;
        this.t = null;
        this.o = o;
        this.s = null;
    }

    protected Primary(int id, String s, int dummy, int dummy2)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = null;
        this.b = null;
        this.a = null;
        this.e = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.s = s;
    }
}
