/* I referenced beaver-0.9.11/examples/expr/tree/Parser.java when producing this program */

import java.io.IOException;
import java.io.StringReader;

import beaver.Symbol;
import beaver.Parser;

class Printer
{
    static public void main(String[] args) throws IOException, Parser.Exception
    {   
        Parser4Cool parser = new Parser4Cool();
        Lexer4Cool input = new Lexer4Cool(new StringReader(args[0]));
        parser.parse(input);
        System.out.println("Everything seems to work out.");
    }
}
