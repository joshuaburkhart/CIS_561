public class Block extends Node
{
    public final Expr e;
    public final BlockSub1 b;

    protected Block()
    {
        super();
    }

    protected Block(Expr e)
    {
        super();
        this.e = e;
    }

    protected Block(BlockSub1 b, Expr e)
    {
        super();
        this.b = b;
        this.e = e;
    }
}
