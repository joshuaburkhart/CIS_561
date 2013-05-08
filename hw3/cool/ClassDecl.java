public class ClassDecl extends Node
{
    public final ClassBody c;
    public final VarFormals v;
    public final Actuals a;
    public final String t;

    protected ClassDecl(int id, VarFormals v, ClassBody c, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.c = c;
        this.a = null;
        this.t = t;
    }

    protected ClassDecl(int id, VarFormals v, Actuals a, ClassBody c, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.a = a;
        this.c = c;
        this.t = t;
    }
}
