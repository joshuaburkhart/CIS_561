public class CasesSub1 extends Node
{
    public final Block b;
    public final int i;
    public final CasesSub1 c1;

    protected CasesSub1(Block b, int i)
    {
        super();
        this.b = b;
        this.i = i;
    }

    protected CasesSub1(CasesSub1 c1, Block b, int i)
    {
        super();
        this.c1 = c1;
        this.b = b;
        this.i = i;
    }
}
