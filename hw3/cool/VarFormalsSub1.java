public class VarFormalsSub1 extends Node
{
    public final VarFormalsSub1 v;
    public final String i;

    protected VarFormalsSub1(int id, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.v = null;
    }

    protected VarFormalsSub1(int id, VarFormalsSub1 v, String i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.i = i;
    }
}
