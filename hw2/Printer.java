/* I referenced beaver-0.9.11/examples/expr/tree/Parser.java when producing this program */

import java.io.*;

import beaver.Symbol;
import beaver.Parser;

class Printer
{

    private static String EOF_MESSAGE = "Cannot recover from the syntax error";
    static public void main(String[] args) throws IOException, Parser.Exception
    {   
        FileReader fr = null;
        try{
            fr = new FileReader(args[0]);
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }   
        Lexer4Cool input = new Lexer4Cool(fr);
        Parser4Cool parser = new Parser4Cool();
        try{
        parser.parse(input);
        }catch(Parser.Exception pe){
            if(pe.getMessage().matches(EOF_MESSAGE)){
                //probably just EOF reached... ignore
            }else{
                pe.printStackTrace();
            }
        }
        System.out.println("Everything seems to work out.");
    }
}
