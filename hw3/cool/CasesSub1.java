public class CasesSub1 extends Node
{
    public final Block b;
    public final CasesSub1 c1;
    public final String i;

    protected CasesSub1(int id, Block b, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.b = b;
        this.i = i;
        this.c1 = null;
    }

    protected CasesSub1(int id, CasesSub1 c1, Block b, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.c1 = c1;
        this.b = b;
        this.i = i;
    }

    protected CasesSub1(int id, Block b)
    {
        super();
        this.PRODUCTION_ID = id;
        this.b = b;
        this.i = null;
        this.c1 = null;
    }

    protected CasesSub1(int id, CasesSub1 c1, Block b)
    {
        super();
        this.PRODUCTION_ID = id;
        this.c1 = c1;
        this.b = b;
        this.i = null;
    }
}
