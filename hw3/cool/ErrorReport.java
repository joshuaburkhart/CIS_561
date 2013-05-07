package cool;

public class ErrorReport
{
    private String message;
    private int line;
    private int column;

    public ErrorReport(String message, int line, int column)
    {
        this.message = message;
        this.line = line;
        this.column = column;
        System.err.println("ERROR AT LINE="+line+" COL="+column+": "+message);
    }
}
