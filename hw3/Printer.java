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
            Node n = (Node) parser.parse(input);
            print(sym);
        }catch(Parser.Exception pe){
            if(pe.getMessage().matches(EOF_MESSAGE)){
                //probably just EOF reached... ignore
            }else{
                pe.printStackTrace();
            }
        }
        System.out.println("Everything seems to work out.");
    }

    static private void print(Node n)
    {
        print("", n);
    }

    static private void print(String prefix, Node n)
    {
        prefix = prefix + "\t";
        switch(n.PRODUCTION_ID){
            case 0:
                ClassDecl c = ((Program) n).c;
                print(prefix, c);
                break;
            case 1:
                ClassDecl c = ((Program) n).c;
                Program p = ((Program) n).p;
                print(prefix,c);
                print(prefix,p);
                break;
            case 2:
                VarFormals v = ((ClassDecl) n).v;
                ClassBody c = ((ClassBody) n).c;
                System.out.println(prefix + "CLASS TYPE");
                print(prefix,v);
                print(prefix,c);
                break;
            case 3:
                VarFormals v = ((ClassDecl) n).v;
                Actuals a = ((ClassDecl) n).a;
                ClassBody c = ((ClassDecl) n).c;
                System.out.println(prefix + "CLASS TYPE");
                print(prefix,v);
                System.out.println(prefix + "EXTENDS TYPE");
                print(prefix,a);
                print(prefix,c);
                break;
            case 4:
                VarFormals v = ((ClassDecl) n).v;
                ClassBody c = ((ClassDecl) n).c;
                System.out.println(prefix + "CLASS TYPE");
                print(prefix,v);
                System.out.println(prefix + "EXTENDS NATIVE");
                print(prefix,c);
                break;
            case 5:
                System.out.println(prefix + "()");
                break;
            case 6:
                Id i = ((VarFormals) n).i;
                System.out.println(prefix + "( VAR");
                print(prefix,i);
                System.out.println(prefix + ": TYPE )");
                break;
            case 7:
                VarFormalsSub1 v = ((VarFormals) n).v;
                Id i = ((VarFormals) n).i;
                System.out.println(prefix + "(");
                print(prefix,v);
                System.out.println(prefix + "VAR");
                print(prefix,i);
                System.out.println(prefix + ": TYPE )");
                break;
            case 8:
                Id i = ((VarFormalsSub1) n).i;
                System.out.println(prefix + "VAR");
                print(prefix,i);
                System.out.println(prefix + ": TYPE ,");
                break;
            case 9:
                VarFormalsSub1 v = ((VarFormalsSub1) n).v;
                Id i = ((VarFormalsSub1) n).i;
                print(prefix,v);
                System.out.println(prefix + "VAR");
                print(prefix,i);
                System.out.println(prefix + ": TYPE ,");
                break;
            case 10:
                System.out.println(prefix + "()");
                break;
            case 11:
                Feature f = ((ClassBody) n).f;
                System.out.println(prefix + "(");
                print(prefix,f);
                System.out.println(prefix + ")");
                break;
            case 12:
                ClassBodySub1 c = ((ClassBody) n).c;
                Feature f = ((ClassBody) n).f;
                System.out.println(prefix + "(");
                print(prefix,c);
                print(prefix,f);
                System.out.println(prefix + ")");
                break;
            case 13:
                Feature f = ((ClassBodySub1) n).f;
                print(prefix,f);
                break;
            case 14:
                ClassBodySub1 c = ((ClassBodySub1) n).c;
                Feature f = ((ClassBodySub1) n).f;
                print(prefix,c);
                print(prefix,f);
                break;
            case 15:
                FeatureSub1 f = ((Feature) n).f;
                print(prefix,f);
                System.out.println(prefix + "NATIVE ;");
                break;
            case 16:
                FeatureSub1 f = ((Feature) n).f;
                Expr e = ((Feature) n).e;
                print(prefix,f);
                print(prefix,e);
                System.out.println(prefix + ";");
                break;
            case 17:
                FeatureSub1 f = ((Feature) n).f;
                System.out.println(prefix + "OVERRIDE");
                print(prefix,f);
                System.out.println(prefix + "NATIVE ;"):
                break;
            case 18:
                FeatureSub1 f = ((Feature) n).f;
                Expr e = ((Feature) n).e;
                System.out.println(prefix + "OVERRIDE");
                print(prefix,f);
                print(prefix,e);
                System.out.println(prefix + ";");
                break;
            case 19:
                FeatureSub2 f2 = ((Feature) n).f2;
                print(prefix,f2);
                System.out.println(prefix + "= NATIVE ;");
                break;
            case 20:
                FeatureSub2 f2 = ((Feature) n).f2;
                Expr e = ((Feature) n).e;
                print(prefix,f2);
                System.out.println(prefix + ": TYPE =");
                print(prefix,e);
                System.out.println(prefix + ";");
                break;
            case 21:
                Block b = ((Feature) n).b;
                System.out.println(prefix + "{");
                print(prefix,b);
                System.out.println(prefix + "} ;");
                break;
            case 22:
                Formals f = ((FeatureSub2) n).f;
                Id i = ((FeatureSub2) n).i;
                System.out.println(prefix + "DEF");
                print(prefix,i);
                print(prefix,f);
                System.out.println(prefix + ": TYPE =");
                break;
            case 23:
                Id i = ((FeatureSub2) n).i;
                System.out.println(prefix + "VAR");
                print(prefix,i);
                break;
            case 24:
                System.out.println(prefix + "()");
                break;
            case 25:
                Id i = ((Formals) n).i;
                System.out.println(prefix + "(");
                print(prefix,i);
                System.out.println(prefix + ": TYPE )");
                break;
            case 26:
                FormalsSub1 f = ((Formals) n).f;
                Id i = ((Formals) n).i;
                System.out.println(prefix + "(");
                print(prefix,f);
                print(prefix,i);
                System.out.println(prefix + ": TYPE )");
                break;
            case 27:
                Id i = ((FormalsSub1) n).i;
                print(prefix,i);
                System.out.println(prefix + ": TYPE ,");
                break;
            case 28:
                FormalsSub1 f = ((FormalsSub1) n).f;
                Id i = ((FormalsSub1) n).i;
                print(prefix,f);
                print(prefix,i);
                System.out.println(prefix + ": TYPE ,");
                break;
            case 29:
                System.out.println(prefix + "()");
                break;
            case 30:
                Expr e = ((Actuals) n).e;
                System.out.println(prefix + "(");
                print(prefix,e);
                System.out.println(prefix + ")");
                break;
            case 31:
                ActualsSub1 a = ((Actuals) n).a;
                Expr e = ((Actuals) n).e;
                System.out.println(prefix + "(");
                print(prefix,a);
                print(prefix,e);
                System.out.println(prefix + ")");
                break;
            case 32:
                Expr e = ((ActualsSub1) n).e;
                print(prefix,e);
                System.out.println(prefix + ",");
                break;
            case 33:
                ActualsSub1 a = ((ActualsSub1) n).a;
                Expr e = ((ActualsSub1) n).e;
                print(prefix,a);
                print(prefix,e);
                System.out.println(prefix + ",");
                break;
            case 34:
                System.out.println();
                break;
            case 35:
                Expr e = ((Block) n).e;
                print(prefix,e);
                break;
            case 36:
                BlockSub1 b = ((Block) n).b;
                Expr e = ((Block) n).e;
                print(prefix,b);
                print(prefix,e);
                break;
            case 37:
                Expr e = ((BlockSub1) n).e;
                print(prefix,e);
                System.out.println(prefix + ";");
                break;
            case 38:
                BlockSub1 b = ((BlockSub1) n).b;
                Expr e = ((BlockSub1) n).e;
                print(prefix,b);
                print(prefix,e);
                System.out.println(prefix + ";");
                break;
            case 39:
                Expr e = ((BlockSub1) n).e;
                Id i = ((BlockSub1) n).i;
                System.out.println(prefix + "VAR");
                print(prefix,i);
                System.out.println(prefix + ": TYPE =");
                print(prefix,e);
                System.out.println(prefix + ";");
                break;
            case 40:
                BlockSub1 b = ((BlockSub1) n).b;
                Id i = ((BlockSub1) n).i;
                Expr e = ((BlockSub1) n).e;
                print(prefix,b);
                System.out.println(prefix + "VAR");
                print(prefix,i);
                System.out.println(prefix + ": TYPE =");
                print(prefix,e);
                System.out.println(prefix + ";");
                break;
            case 41:
                Primary p = ((Expr) n).p;
                print(prefix,p);
                break;
            case 42:
                Primary p = ((Expr) n).p;
                ExprSub1 e1 = ((Expr) n).e1;
                print(prefix,p);
                print(prefix,e1);
                break;
            case 43:
                ExprSub2 e2 = ((Expr) n).e2;
                Primary p = ((Expr) n).p;
                print(prefix,e2);
                print(prefix,p);
                break;
            case 44:
                ExprSub2 e2 = ((Expr) n).e2;
                Primiary p = ((Expr) n).p;
                ExprSub1 e1 = ((Expr) n).e1;
                print(prefix,e2);
                print(prefix,p);
                print(prefix,e1);
                break;
            case 45:
                ExprSub11 e11 = ((ExprSub1) n).e11;
                Expr e = ((ExprSub1) n).e;
                print(prefix,e11);
                System.out.println(prefix + "(");
                print(prefix,e);
                System.out.println(prefix + ")");
                break;
            case 46:
                ExprSub1 e1 = ((ExprSub1) n).e1;
                ExprSub11 e11 = ((ExprSub1) n).e11;
                Expr e = ((ExprSub1) n).e;
                print(prefix,e1);
                print(prefix,e11);
                System.out.println(prefix + "(");
                print(prefix,e);
                System.out.println(prefix + ")");
                break;
            case 47:
                Cases c = ((ExprSub1) n).c;
                System.out.println(prefix + "MATCH");
                print(prefix,c);
                break;
            case 48:
                ExprSub1 e1 = ((ExprSub1) n).e1;
                Cases c = ((ExprSub1) n).c;
                print(prefix,e1);
                System.out.println(prefix + "MATCH");
                print(prefix,c;
                break;
            case 49:
                Id i = ((ExprSub1) n).i;
                Actuals a = ((ExprSub1) n).a;
                System.out.println(prefix + ".");
                print(prefix,i);
                print(prefix,a);
                break;
            case 50:
                ExprSub1 e1 = ((ExprSub1) n).e1;
                Id i = ((ExprSub1) n).i;
                Actuals a = ((ExprSub1) n).a;
                print(prefix,e1);
                System.out.println(prefix + ".");
                print(prefix,i);
                print(prefix,a);
                break;
            case 51:
                System.out.println(prefix + "<=");
                break;
            case 52:
                System.out.println(prefix + "<");
                break;
            case 53:
                System.out.println(prefix + "==");
                break;
            case 54:
                System.out.println(prefix + "*");
                break;
            case 55:
                System.out.println(prefix + "/");
                break;
            case 56:
                System.out.println(prefix + "+");
                break;
            case 57:
                System.out.println(prefix + "-");
                break;
            case 58:
                Id i = ((ExprSub2) n).i;
                print(prefix,i);
                System.out.println(prefix + "=");
                break;
            case 59:
                ExprSub2 = ((ExprSub2) n).e2;
                Id i = ((ExprSub2) n).i;
                print(prefix,e2);
                print(prefix,i);
                System.out.println(prefix + "=");
                break;
            case 60:
                System.out.println(prefix + "!");
                break;
            case 61:
                ExprSub2 e2 = ((ExprSub2) n).e2;
                print(prefix,e2);
                System.out.println(prefix + "!");
                break;
            case 62:
                System.out.printnl(prefix + "-");
                break;
            case 63:
                ExprSub2 e2 = ((ExprSub2) n).e2;
                print(prefix,e2);
                System.out.println(prefix + "-");
                break;
            case 64:
                Expr e = ((ExprSub2) n).e;
                Expr ee = ((ExprSub2) n).ee;
                System.out.println(prefix + "IF (");
                print(prefix,e);
                System.out.println(prefix + ")");
                print(prefix,ee);
                System.out.println(prefix + "ELSE");
                break;
            case 65:
                ExprSub2 e2 = ((ExprSub2) n).e2;
                Expr e = ((ExprSub2) n).e;
                Expr ee = ((ExprSub2) n).ee;
                print(prefix,e2);
                System.out.println(prefix + "IF (");
                print(prefix,e);
                System.out.println(prefix + ")");
                print(prefix,ee);
                System.out.println(prefix + "ELSE");
                break;
            case 66:
                Expr e = ((ExprSub2) n).e;
                System.out.println(prefix + "WHILE (");
                print(prefix,e);
                System.out.println(prefix + ")");
                break;
            case 67:
                ExprSub2 e2 = ((ExprSub2) n).e2;
                Expr e = ((ExprSub2) n).e;
                print(prefix,e2);
                System.out.println(prefix + "WHILE (");
                print(prefix,e);
                System.out.println(prefix + ")");
                break;
            case 68:
                Id i = ((Primary) n).i;
                Actuals a = ((Primary) n).a;
                print(prefix,i);
                print(prefix,a);
                break;
            case 69:
                Id i = ((Primary) n).i;
                Actuals a = ((Primary) n).a;
                System.out.println(prefix + "SUPER .");
                print(prefix,i);
                print(prefix,a);
                break;
            case 70:
                Actuals a = ((Primary) n).a;
                System.out.println(prefix + "NEW TYPE");
                print(prefix,a);
                break;
            case 71:
                Block b = ((Primary) n).b;
                System.out.println(prefix + "{");
                print(prefix,b);
                System.out.println(prefix + "}");
                break;
            case 72:
                Expr e = ((Primary) n).e;
                System.out.println(prefix + "(");
                print(prefix,e);
                System.out.println(prefix + ")");
                break;
            case 73:
                System.out.println(prefix + "NULL");
                break;
            case 74:
                System.out.println(prefix + "()");
                break;
            case 75:
                Id i = ((Primary) n).i;
                print(prefix,i);
                break;
            case 76:
                System.out.println(prefix + "INTEGER");
                break;
            case 77:
                System.out.println(prefix + "STRING");
                break;
            case 78:
                System.out.println(prefix + "BOOLEAN");
                break;
            case 79:
                System.out.println(prefix + "THIS");
                break;
            case 80:
                CasesSub1 c1 = ((Cases) n).c1;
                System.out.println(prefix + "{");
                print(prefix,c1);
                System.out.println(prefix + "}");
                break;
            case 81:
                Block b = ((CasesSub1) n).b;
                Id i = ((CasesSub1) n).i;
                System.out.println(prefix + "CASE");
                print(prefix,i);
                System.out.println(prefix + ": TYPE =>");
                print(prefix,b);
                break;
            case 82:
                CasesSub1 c1 = ((CasesSub1) n).c1;
                Id i = ((CasesSub1) n).i;
                Block b = ((CasesSub1) n).b;
                print(prefix,c1);
                System.out.println(prefix + "CASE");
                print(prefix,i);
                System.out.println(prefix + ": TYPE =>");
                print(prefix,b);
                break;
            case 83:
                Block b = ((CasesSub1) n).b;
                System.out.println(prefix + "CASE NULL =>");
                print(prefix,b);
                break;
            case 84:
                CasesSub1 c1 = ((CasesSub1) n).c1;
                Block b = ((CasesSub1) n).b;
                print(prefix,c1);
                System.out.println(prefix + "CASE NULL =>");
                print(prefix,b);
                break;
            default:
                System.out.println("something went wrong");
                System.exit(1);
                break;
        }
    }
}
