public class ClassDecl extends Node
{
    public final ClassBody c;
    public final VarFormals v;
    public final Actuals a;

    protected ClassDecl(VarFormals v, ClassBody c)
    {
        super();
        this.v = v;
        this.c = c;
    }

    protected ClassDecl(VarFormals v, Actuals a, Classbody c)
    {
        super();
        this.v = v;
        this.a = a;
        this.c = c;
    }

    protected ClassDecl(Classbody c, VarFormals v)
    {
        super();
        this.v = v;
        this.c = c;
    }
}
