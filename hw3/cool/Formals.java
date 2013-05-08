public class Formals extends Node
{
    public final FormalsSub1 f;
    public final String i;
    public final String t;

    protected Formals(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = null;
        this.f = null;
        this.t = null;
    }

    protected Formals(int id, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.f = null;
        this.t = t;
    }

    protected Formals(int id, FormalsSub1 f, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.i = i;
        this.t = t;
    }

}
