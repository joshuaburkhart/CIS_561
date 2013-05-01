public class VarFormals extends Node
{
    public final VarFormalsSub1 v;

    protected VarFormals(Number n)
    {
        super();
        int cn = Number.intValue();
        switch(cn){
            case 0: ;
                    break;
            case 1: ;
                    break;
            default: /* error */ ;
                    break;
        }
    }

    protected VarFormals(VarFormalsSub1 v)
    {
        super();
        this.v = v;
    }
}
