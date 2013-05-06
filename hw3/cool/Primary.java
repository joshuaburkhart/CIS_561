public class Primary extends Node
{
    public final Actuals a;
    public final Block b;
    public final Expr e;
    public final Id i;

    protected Primary(int id, Actuals a, Id i)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.a = a;
        this.i = i;
    }

    protected Primary(int id, Actuals a)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.a = a;
    }

    protected Primary(int id, Block b)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.b = b;
    }

    protected Primary(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.e = e;
    }

    protected Primary(int id)
    {
        super();
        this.PRODUCTION_ID = id;
    }

    protected Primary(int id, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
    }
}
