public class Program extends Node
{
    public final ClassDecl c;
    public final Program p;

    protected Program(ClassDecl c)
    {
        super();
        this.c = c;
    }

    protected Program(ClassDecl c, Program p)
    {
        super();
        this.c = c;
        this.p = p;
    }
}
