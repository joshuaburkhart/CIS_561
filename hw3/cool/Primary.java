public class Primary extends Node
{
    public final Actuals a;
    public final Block b;
    public final Expr e;
    public final String i;

    protected Primary(int id, Actuals a, String i)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.a = a;
        this.i = i;
        this.b = null;
        this.e = null;
    }

    protected Primary(int id, Actuals a)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.a = a;
        this.i = null;
        this.b = null;
        this.e = null;
    }

    protected Primary(int id, Block b)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.b = b;
        this.a = null;
        this.i = null;
        this.e = null;
    }

    protected Primary(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.e = e;
        this.b = null;
        this.a = null;
        this.i = null;
    }

    protected Primary(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.a = null;
        this.e = null;
        this.b = null;
        this.i = null;
    }

    protected Primary(int id, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.b = null;
        this.a = null;
        this.e = null;
    }
}
