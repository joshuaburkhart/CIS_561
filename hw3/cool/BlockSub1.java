public class BlockSub1 extends Node
{
    public final Expr e;
    public final BlockSub1 b;
    public final String i;
    public final String t;

    protected BlockSub1(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.b = null;
        this.i = null;
        this.t = null;
    }

    protected BlockSub1(int id, BlockSub1 b, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.b = b;
        this.i = null;
        this.t = null;
    }

    protected BlockSub1(int id, Expr e, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.i = i;
        this.b = null;
        this.t = t;
    }

    protected BlockSub1(int id, Expr e, BlockSub1 b, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.b = b;
        this.i = i;
        this.t = t;
    }

}
