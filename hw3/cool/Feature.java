public class Feature extends Node
{
    public final FeatureSub1 c;
    public final Expr e;
    public final Block b;

    protected Feature(FeatureSub1 f, Number n)
    {
        super();
        this.f = f;
        int cn = n.intValue();
        switch(cn){
            case 0: ;
                    break;
            case 1: ;
                    break;
            case 2:
                    break;
            default:
                    break;
        }
    }

    protected Feature(FeatureSub1 f, Expr e, Number n)
    {
        super();
        this.f = f;
        this.e = e;
        int cn = n.intValue();
        switch(cn){
            case 0: ;
                    break;
            case 1: ;
                    break;
            case 2:
                    break;
            default:
                    break;
        }
    }

    protected Feature(Block b)
    {
        super();
        this.b = b;
    }
}
