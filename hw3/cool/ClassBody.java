public class ClassBody extends Node
{
    public final Feature f;
    public final ClassBodySub1 c;

    protected ClassBody()
    {
        super();
    }

    protected ClassBody(Feature f)
    {
        super();
        this.f = f;
    }

    protected ClassBody(ClassBodySub1 c, Feature f)
    {
        super();
        this.c = c;
        this.f = f;
    }
}
