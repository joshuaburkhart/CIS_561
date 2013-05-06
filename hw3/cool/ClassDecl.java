public class ClassDecl extends Node
{
    public final ClassBody c;
    public final VarFormals v;
    public final Actuals a;

    protected ClassDecl(int id, VarFormals v, ClassBody c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.c = c;
    }

    protected ClassDecl(int id, VarFormals v, Actuals a, Classbody c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.a = a;
        this.c = c;
    }

    protected ClassDecl(int id, Classbody c, VarFormals v)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.c = c;
    }
}
