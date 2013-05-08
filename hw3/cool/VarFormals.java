public class VarFormals extends Node
{
    public final VarFormalsSub1 v;
    public final String i;
    public final String t;

    protected VarFormals(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = null;
        this.i = null;
        this.t = null;
    }

    protected VarFormals(int id, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.v = null;
        this.t = t;
    }

    protected VarFormals(int id, VarFormalsSub1 v, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.i = i;
        this.t = t;
    }
}
