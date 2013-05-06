public class ClassBodySub1 extends Node
{
    public final ClassBodySub1 c;
    public final Feature f;

    protected ClassBodySub1(int id, Feature f)
    {
        super();
        this.PRODUCTION_ID = id;
        this.f = f;
        this.c = null;
    }

    protected ClassBodySub1(int id, ClassBodySub1 c, Feature f)
    {
        super();
        this.PRODUCTION_ID = id; 
        this.c = c;
        this.f = f;
    }
}
