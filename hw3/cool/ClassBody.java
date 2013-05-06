public class ClassBody extends Node
{
    public final Feature f;
    public final ClassBodySub1 c;

    protected ClassBody(int id)
    {
        super();
        this.PRODUCTION_ID = id;
    }

    protected ClassBody(int id, Feature f)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
    }

    protected ClassBody(int id, ClassBodySub1 c, Feature f)
    {
        super();
        this.PRODUCTION_ID = id;
        this.c = c;
        this.f = f;
    }
}
