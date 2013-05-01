public class ClassBodySub1 extends Node
{
    public final ClassBodySub1 c;
    public final Feature f;

    protected ClassBodySub1(Feature f)
    {
        super();
        this.f = f;
    }

    protected ClassBodySub1(ClassBodySub1 c, Feature f)
    {
        super();
        this.c = c;
        this.f = f;
    }
}
