public class VarFormals extends Node
{
    public final VarFormalsSub1 v;
    public final String i;

    protected VarFormals(int id)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = null;
        this.i = null;
    }

    protected VarFormals(int id, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.v = null;
    }

    protected VarFormals(int id, VarFormalsSub1 v, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.i = i;
    }
}
