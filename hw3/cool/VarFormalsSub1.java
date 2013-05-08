public class VarFormalsSub1 extends Node
{
    public final VarFormalsSub1 v;
    public final String i;
    public final String t;

    protected VarFormalsSub1(int id, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.v = null;
        this.t = t;
    }

    protected VarFormalsSub1(int id, VarFormalsSub1 v, String i, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.i = i;
        this.t = t;
    }
}
