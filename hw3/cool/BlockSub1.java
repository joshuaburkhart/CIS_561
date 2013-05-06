public class BlockSub1 extends Node
{
    public final Expr e;
    public final BlockSub1 b;

    protected BlockSub1(Expr e, Number n)
    {
        super();
        this.e = e;
        int cn = n.intValue();
        switch(cn){
            case 0: ;
                    break;
            case 1: ;
                    break;
            default: ;
                     break;
        }
    }

    protected BlockSub1(Expr e, BlockSub1 b, Number n)
    {
        super();
        this.e = e;
        this.b = b;
        int cn = n.intValue();
        switch(cn){
            case 0: ;
                    break;
            case 1: ;
                    break;
            default: ;
                     break;
        }
    }

}
