public class Primary extends Node
{
    public final Actuals a;
    public final int i;

    protected Primary(Actuals a, int i)
    {
        super();
        this.a = a;
        this.i = i;
    }

    protected Primary(int i)
    {
        super();
        this.i = i;
    }
}
