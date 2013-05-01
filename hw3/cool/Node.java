/* got this from the beaver examples/expr/tree example */
import beaver.Symbol

public abstract class Node extends Symbol
{
    public abstract void accept(TreeWalker walker);
}
