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
        this.a = null;
    }

    protected ClassDecl(int id, VarFormals v, Actuals a, ClassBody c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.a = a;
        this.c = c;
    }
}
