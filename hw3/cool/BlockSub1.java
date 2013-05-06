public class BlockSub1 extends Node
{
    public final Expr e;
    public final BlockSub1 b;
    public final Id i;

    protected BlockSub1(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.b = null;
        this.i = null;
    }

    protected BlockSub1(int id, BlockSub1 b, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.b = b;
        this.i = null;
    }

    protected BlockSub1(int id, Expr e, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.i = i;
        this.b = null;
    }

    protected BlockSub1(int id, Expr e, BlockSub1 b, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
        this.b = b;
        this.i = i;
    }

}
