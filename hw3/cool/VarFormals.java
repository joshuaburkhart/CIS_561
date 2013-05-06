public class VarFormals extends Node
{
    public final VarFormalsSub1 v;
    public final Id i;

    protected VarFormals(int id)
    {
        super();
        this.PRODUCTION_ID = id;
    }

    protected VarFormals(int id, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
    }

    protected VarFormals(int id, VarFormalsSub1 v, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.i = i;
    }
}
