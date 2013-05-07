public class Formals extends Node
{
    public final FormalsSub1 f;
    public final String i;

    protected Formals(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = null;
        this.f = null;
    }

    protected Formals(int id, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.f = null;
    }

    protected Formals(int id, FormalsSub1 f, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.i = i;
    }

}
