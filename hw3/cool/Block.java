public class Block extends Node
{
    public final Expr e;
    public final BlockSub1 b;

    protected Block(int id)
    {
        super();
        this.PRODUCTION_ID = id;
    }

    protected Block(int id, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.e = e;
    }

    protected Block(int id, BlockSub1 b, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.b = b;
        this.e = e;
    }
}
