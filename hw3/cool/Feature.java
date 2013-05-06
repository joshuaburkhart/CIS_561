public class Feature extends Node
{
    public final FeatureSub1 c;
    public final Expr e;
    public final Block b;

    protected Feature(int id, FeatureSub1 f, Number n)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        int cn = n.intValue();
    }

    protected Feature(int id, FeatureSub1 f, Expr e, Number n)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.e = e;
        int cn = n.intValue();
    }

    protected Feature(int id, Block b)
    {
        super();
        this.PRODUCTION_ID = id;
        this.b = b;
    }
}
