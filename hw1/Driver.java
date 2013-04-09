import java.io.*;
import beaver.Symbol;

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
                            id + ", " +
                            output.value + ", " +
                            Symbol.getLine(output.getStart()) + ", " +
                            Symbol.getColumn(output.getStart())
                            );
                }else{
                    eof = true;
                }
            }catch(IOException io){
                io.printStackTrace();
            }catch(beaver.Scanner.Exception bse){
                bse.printStackTrace();
            }
        }while(!eof);
    }
}
