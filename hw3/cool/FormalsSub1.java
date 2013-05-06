public class FormalsSub1 extends Node
{
    public final FormalsSub1 f;
    public final Id i;

    protected FormalsSub1(int id, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.f = null;
    }

    protected FormalsSub1(int id, FormalsSub1 f, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.i = i;
    }
}
