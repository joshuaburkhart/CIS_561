public class FormalsSub1 extends Node
{
    public final FormalsSub1 f;
    public final String i;
    public final String t;

    protected FormalsSub1(int id, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.f = null;
        this.t = t;
    }

    protected FormalsSub1(int id, FormalsSub1 f, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.i = i;
        this.t = t;
    }
}
