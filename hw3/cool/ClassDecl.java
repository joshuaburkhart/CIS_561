public class ClassDecl extends Node
{
    public final ClassBody c;
    public final VarFormals v;
    public final Actuals a;
    public final String t;
    public final String tt;

    protected ClassDecl(int id, VarFormals v, ClassBody c, String t)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.c = c;
        this.a = null;
        this.t = t;
        this.tt = null;
    }

    protected ClassDecl(int id, VarFormals v, Actuals a, ClassBody c, String t, String tt)
    {
        super();
        this.PRODUCTION_ID = id;
        this.v = v;
        this.a = a;
        this.c = c;
        this.t = t;
        this.tt = tt;
    }
}
