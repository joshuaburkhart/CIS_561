public class Feature extends Node
{
    public final FeatureSub1 f;
    public final FeatureSub2 f2;
    public final Expr e;
    public final Block b;

    protected Feature(int id, FeatureSub1 f)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.f2 = null;
        this.e = null;
        this.b = null;
    }

    protected Feature(int id, FeatureSub1 f, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.e = e;
        this.f2 = null;
        this.b = null;
    }

    protected Feature(int id, FeatureSub2 f2)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f2 = f2;
        this.f = null;
        this.e = null;
        this.b = null;
    }

    protected Feature(int id, FeatureSub2 f2, Expr e)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f2 = f2;
        this.e = e;
        this.f = null;
        this.b = null;
    }

    protected Feature(int id, Block b)
    {
        super();
        this.PRODUCTION_ID = id;
        this.b = b;
        this.f2 = null;
        this.e = null;
        this.f = null;
    }
}
