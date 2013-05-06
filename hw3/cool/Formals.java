public class Formals extends Node
{
    public final FormalsSub1 f;
    public final Id i;

    protected Formals(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = null;
        this.f = null;
    }

    protected Formals(int id, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.f = null;
    }

    protected Formals(int id, FormalsSub1 f, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.i = i;
    }

}
