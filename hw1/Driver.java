import java.io.*;
import beaver.Symbol;
import cool.Terminals;

public class Driver{
    public static void main(String[] args){
        FileReader fr = null;
        try{
            fr = new FileReader(args[0]);
        }catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }
        Lexer4Cool lexer = new Lexer4Cool(fr);
        Boolean eof = false;
        do{
            try{
                Symbol output = lexer.nextToken();
                if(output.getId() != Terminals.EOF){
                    int id = output.getId();
                    System.out.println(
                            Terminals.NAMES[id] + ", " +
                            Symbol.getLine(output.getStart()) + ", " +
                            Symbol.getColumn(output.getStart()) + ", " +
                            output.value
                            );
                }else{
                    eof = true;
                }
            }catch(IOException io){
                io.printStackTrace();
            }catch(beaver.Scanner.Exception bse){
                System.out.println("An error was detected on line " +
                        bse.line +
                        " at column " +
                        bse.column +
                        ":\n"
                        );
                bse.printStackTrace();
            }
        }while(!eof);
    }
}
