public class Program extends Node
{
    public final ClassDecl c;
    public final Program p;

    protected Program(int id,ClassDecl c)
    {
        super();
        this.PRODUCTION_ID = id;
        this.c = c;
        this.p = null;
    }

    protected Program(int id, ClassDecl c, Program p)
    {
        super();
        this.PRODUCTION_ID = id;
        this.c = c;
        this.p = p;
    }
}
