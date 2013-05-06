public class VarFormalsSub1 extends Node
{
    public final VarFormalsSub1 v;
    public final Id i;

    protected VarFormalsSub1(int id, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.i = i;
        this.v = null;
    }

    protected VarFormalsSub1(int id, VarFormalsSub1 v, Id i)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.i = i;
    }
}
