/* I referenced beaver-0.9.11/examples/expr/tree/Parser.java when producing this program */

import java.io.*;

import beaver.Symbol;
import beaver.Parser;
import beaver.Scanner;

import cool.*;

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
        Lexer4Cool lexer = new Lexer4Cool(fr);
        Parser4Cool parser = new Parser4Cool();
        try{
            Node n = (Node) parser.parse(lexer);
            print(n);
        }catch(Parser.Exception pe){
            pe.printStackTrace();
        }
        System.out.println("Seems Legit.");
    }

    static private void print(Node n)
    {
        print("", n);
    }

    static private void print(String prefix, Node n)
    {
        prefix = prefix + "\t";
        switch(n.PRODUCTION_ID){
            case -1:
                System.out.println("error detected...");
                System.out.println(n.toString());
                break;
            case 0:
                ClassDecl c0 = ((Program) n).c;
                print(prefix, c0);
                break;
            case 1:
                ClassDecl c1 = ((Program) n).c;
                Program p1 = ((Program) n).p;
                print(prefix,c1);
                print(prefix,p1);
                break;
            case 2:
                VarFormals v2 = ((ClassDecl) n).v;
                ClassBody c2 = ((ClassDecl) n).c;
                System.out.println(prefix + "CLASS TYPE");
                print(prefix,v2);
                print(prefix,c2);
                break;
            case 3:
                VarFormals v3 = ((ClassDecl) n).v;
                Actuals a3 = ((ClassDecl) n).a;
                ClassBody c3 = ((ClassDecl) n).c;
                System.out.println(prefix + "CLASS TYPE");
                print(prefix,v3);
                System.out.println(prefix + "EXTENDS TYPE");
                print(prefix,a3);
                print(prefix,c3);
                break;
            case 4:
                VarFormals v4 = ((ClassDecl) n).v;
                ClassBody c4 = ((ClassDecl) n).c;
                System.out.println(prefix + "CLASS TYPE");
                print(prefix,v4);
                System.out.println(prefix + "EXTENDS NATIVE");
                print(prefix,c4);
                break;
            case 5:
                System.out.println(prefix + "()");
                break;
            case 6:
                String i6 = ((VarFormals) n).i;
                System.out.println(prefix + "( VAR");
                System.out.println(prefix + i6);
                System.out.println(prefix + ": TYPE )");
                break;
            case 7:
                VarFormalsSub1 v7 = ((VarFormals) n).v;
                String i7 = ((VarFormals) n).i;
                System.out.println(prefix + "(");
                print(prefix,v7);
                System.out.println(prefix + "VAR");
                System.out.println(prefix + i7);
                System.out.println(prefix + ": TYPE )");
                break;
            case 8:
                String i8 = ((VarFormalsSub1) n).i;
                System.out.println(prefix + "VAR");
                System.out.println(prefix + i8);
                System.out.println(prefix + ": TYPE ,");
                break;
            case 9:
                VarFormalsSub1 v9 = ((VarFormalsSub1) n).v;
                String i9 = ((VarFormalsSub1) n).i;
                print(prefix,v9);
                System.out.println(prefix + "VAR");
                System.out.println(prefix + i9);
                System.out.println(prefix + ": TYPE ,");
                break;
            case 10:
                System.out.println(prefix + "()");
                break;
            case 11:
                Feature f11 = ((ClassBody) n).f;
                System.out.println(prefix + "(");
                print(prefix,f11);
                System.out.println(prefix + ")");
                break;
            case 12:
                ClassBodySub1 c12 = ((ClassBody) n).c;
                Feature f12 = ((ClassBody) n).f;
                System.out.println(prefix + "(");
                print(prefix,c12);
                print(prefix,f12);
                System.out.println(prefix + ")");
                break;
            case 13:
                Feature f13 = ((ClassBodySub1) n).f;
                print(prefix,f13);
                break;
            case 14:
                ClassBodySub1 c14 = ((ClassBodySub1) n).c;
                Feature f14 = ((ClassBodySub1) n).f;
                print(prefix,c14);
                print(prefix,f14);
                break;
            case 15:
                FeatureSub1 f15 = ((Feature) n).f;
                print(prefix,f15);
                System.out.println(prefix + "NATIVE ;");
                break;
            case 16:
                FeatureSub1 f16 = ((Feature) n).f;
                Expr e16 = ((Feature) n).e;
                print(prefix,f16);
                print(prefix,e16);
                System.out.println(prefix + ";");
                break;
            case 17:
                FeatureSub1 f17 = ((Feature) n).f;
                System.out.println(prefix + "OVERRIDE");
                print(prefix,f17);
                System.out.println(prefix + "NATIVE ;");
                break;
            case 18:
                FeatureSub1 f18 = ((Feature) n).f;
                Expr e18 = ((Feature) n).e;
                System.out.println(prefix + "OVERRIDE");
                print(prefix,f18);
                print(prefix,e18);
                System.out.println(prefix + ";");
                break;
            case 19:
                FeatureSub2 f219 = ((Feature) n).f2;
                print(prefix,f219);
                System.out.println(prefix + "= NATIVE ;");
                break;
            case 20:
                FeatureSub2 f220 = ((Feature) n).f2;
                Expr e20 = ((Feature) n).e;
                print(prefix,f220);
                System.out.println(prefix + ": TYPE =");
                print(prefix,e20);
                System.out.println(prefix + ";");
                break;
            case 21:
                Block b21 = ((Feature) n).b;
                System.out.println(prefix + "{");
                print(prefix,b21);
                System.out.println(prefix + "} ;");
                break;
            case 22:
                Formals f22 = ((FeatureSub1) n).f;
                String i22 = ((FeatureSub1) n).i;
                System.out.println(prefix + "DEF");
                System.out.println(prefix + i22);
                print(prefix,f22);
                System.out.println(prefix + ": TYPE =");
                break;
            case 23:
                String i23 = ((FeatureSub2) n).i;
                System.out.println(prefix + "VAR");
                System.out.println(prefix + i23);
                break;
            case 24:
                System.out.println(prefix + "()");
                break;
            case 25:
                String i25 = ((Formals) n).i;
                System.out.println(prefix + "(");
                System.out.println(prefix + i25);
                System.out.println(prefix + ": TYPE )");
                break;
            case 26:
                FormalsSub1 f26 = ((Formals) n).f;
                String i26 = ((Formals) n).i;
                System.out.println(prefix + "(");
                print(prefix,f26);
                System.out.println(prefix + i26);
                System.out.println(prefix + ": TYPE )");
                break;
            case 27:
                String i27 = ((FormalsSub1) n).i;
                System.out.println(prefix + i27);
                System.out.println(prefix + ": TYPE ,");
                break;
            case 28:
                FormalsSub1 f28 = ((FormalsSub1) n).f;
                String i28 = ((FormalsSub1) n).i;
                print(prefix,f28);
                System.out.println(prefix + i28);
                System.out.println(prefix + ": TYPE ,");
                break;
            case 29:
                System.out.println(prefix + "()");
                break;
            case 30:
                Expr e30 = ((Actuals) n).e;
                System.out.println(prefix + "(");
                print(prefix,e30);
                System.out.println(prefix + ")");
                break;
            case 31:
                ActualsSub1 a31 = ((Actuals) n).a;
                Expr e31 = ((Actuals) n).e;
                System.out.println(prefix + "(");
                print(prefix,a31);
                print(prefix,e31);
                System.out.println(prefix + ")");
                break;
            case 32:
                Expr e32 = ((ActualsSub1) n).e;
                print(prefix,e32);
                System.out.println(prefix + ",");
                break;
            case 33:
                ActualsSub1 a33 = ((ActualsSub1) n).a;
                Expr e33 = ((ActualsSub1) n).e;
                print(prefix,a33);
                print(prefix,e33);
                System.out.println(prefix + ",");
                break;
            case 34:
                System.out.println();
                break;
            case 35:
                Expr e35 = ((Block) n).e;
                print(prefix,e35);
                break;
            case 36:
                BlockSub1 b36 = ((Block) n).b;
                Expr e36 = ((Block) n).e;
                print(prefix,b36);
                print(prefix,e36);
                break;
            case 37:
                Expr e37 = ((BlockSub1) n).e;
                print(prefix,e37);
                System.out.println(prefix + ";");
                break;
            case 38:
                BlockSub1 b38 = ((BlockSub1) n).b;
                Expr e38 = ((BlockSub1) n).e;
                print(prefix,b38);
                print(prefix,e38);
                System.out.println(prefix + ";");
                break;
            case 39:
                Expr e39 = ((BlockSub1) n).e;
                String i39 = ((BlockSub1) n).i;
                System.out.println(prefix + "VAR");
                System.out.println(prefix + i39);
                System.out.println(prefix + ": TYPE =");
                print(prefix,e39);
                System.out.println(prefix + ";");
                break;
            case 40:
                BlockSub1 b40 = ((BlockSub1) n).b;
                String i40 = ((BlockSub1) n).i;
                Expr e40 = ((BlockSub1) n).e;
                print(prefix,b40);
                System.out.println(prefix + "VAR");
                System.out.println(prefix + i40);
                System.out.println(prefix + ": TYPE =");
                print(prefix,e40);
                System.out.println(prefix + ";");
                break;
            case 41:
                Primary p41 = ((Expr) n).p;
                print(prefix,p41);
                break;
            case 42:
                Primary p42 = ((Expr) n).p;
                ExprSub1 e142 = ((Expr) n).e1;
                print(prefix,p42);
                print(prefix,e142);
                break;
            case 43:
                ExprSub2 e243 = ((Expr) n).e2;
                Primary p43 = ((Expr) n).p;
                print(prefix,e243);
                print(prefix,p43);
                break;
            case 44:
                ExprSub2 e244 = ((Expr) n).e2;
                Primary p44 = ((Expr) n).p;
                ExprSub1 e144 = ((Expr) n).e1;
                print(prefix,e244);
                print(prefix,p44);
                print(prefix,e144);
                break;
            case 45:
                ExprSub11 e1145 = ((ExprSub1) n).e11;
                Expr e45 = ((ExprSub1) n).e;
                print(prefix,e1145);
                System.out.println(prefix + "(");
                print(prefix,e45);
                System.out.println(prefix + ")");
                break;
            case 46:
                ExprSub1 e146 = ((ExprSub1) n).e1;
                ExprSub11 e1146 = ((ExprSub1) n).e11;
                Expr e46 = ((ExprSub1) n).e;
                print(prefix,e146);
                print(prefix,e1146);
                System.out.println(prefix + "(");
                print(prefix,e46);
                System.out.println(prefix + ")");
                break;
            case 47:
                Cases c47 = ((ExprSub1) n).c;
                System.out.println(prefix + "MATCH");
                print(prefix,c47);
                break;
            case 48:
                ExprSub1 e148 = ((ExprSub1) n).e1;
                Cases c48 = ((ExprSub1) n).c;
                print(prefix,e148);
                System.out.println(prefix + "MATCH");
                print(prefix,c48);
                break;
            case 49:
                String i49 = ((ExprSub1) n).i;
                Actuals a49 = ((ExprSub1) n).a;
                System.out.println(prefix + ".");
                System.out.println(prefix + i49);
                print(prefix,a49);
                break;
            case 50:
                ExprSub1 e150 = ((ExprSub1) n).e1;
                String i50 = ((ExprSub1) n).i;
                Actuals a50 = ((ExprSub1) n).a;
                print(prefix,e150);
                System.out.println(prefix + ".");
                System.out.println(prefix + i50);
                print(prefix,a50);
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
                String i58 = ((ExprSub2) n).i;
                System.out.println(prefix + i58);
                System.out.println(prefix + "=");
                break;
            case 59:
                ExprSub2 e259 = ((ExprSub2) n).e2;
                String i59 = ((ExprSub2) n).i;
                print(prefix,e259);
                System.out.println(prefix + i59);
                System.out.println(prefix + "=");
                break;
            case 60:
                System.out.println(prefix + "!");
                break;
            case 61:
                ExprSub2 e261 = ((ExprSub2) n).e2;
                print(prefix,e261);
                System.out.println(prefix + "!");
                break;
            case 62:
                System.out.println(prefix + "-");
                break;
            case 63:
                ExprSub2 e263 = ((ExprSub2) n).e2;
                print(prefix,e263);
                System.out.println(prefix + "-");
                break;
            case 64:
                Expr e64 = ((ExprSub2) n).e;
                Expr ee64 = ((ExprSub2) n).ee;
                System.out.println(prefix + "IF (");
                print(prefix,e64);
                System.out.println(prefix + ")");
                print(prefix,ee64);
                System.out.println(prefix + "ELSE");
                break;
            case 65:
                ExprSub2 e265 = ((ExprSub2) n).e2;
                Expr e65 = ((ExprSub2) n).e;
                Expr ee65 = ((ExprSub2) n).ee;
                print(prefix,e265);
                System.out.println(prefix + "IF (");
                print(prefix,e65);
                System.out.println(prefix + ")");
                print(prefix,ee65);
                System.out.println(prefix + "ELSE");
                break;
            case 66:
                Expr e66 = ((ExprSub2) n).e;
                System.out.println(prefix + "WHILE (");
                print(prefix,e66);
                System.out.println(prefix + ")");
                break;
            case 67:
                ExprSub2 e267 = ((ExprSub2) n).e2;
                Expr e67 = ((ExprSub2) n).e;
                print(prefix,e267);
                System.out.println(prefix + "WHILE (");
                print(prefix,e67);
                System.out.println(prefix + ")");
                break;
            case 68:
                String i68 = ((Primary) n).i;
                Actuals a68 = ((Primary) n).a;
                System.out.println(prefix + i68);
                print(prefix,a68);
                break;
            case 69:
                String i69 = ((Primary) n).i;
                Actuals a69 = ((Primary) n).a;
                System.out.println(prefix + "SUPER .");
                System.out.println(prefix + i69);
                print(prefix,a69);
                break;
            case 70:
                Actuals a70 = ((Primary) n).a;
                System.out.println(prefix + "NEW TYPE");
                print(prefix,a70);
                break;
            case 71:
                Block b71 = ((Primary) n).b;
                System.out.println(prefix + "{");
                print(prefix,b71);
                System.out.println(prefix + "}");
                break;
            case 72:
                Expr e72 = ((Primary) n).e;
                System.out.println(prefix + "(");
                print(prefix,e72);
                System.out.println(prefix + ")");
                break;
            case 73:
                System.out.println(prefix + "NULL");
                break;
            case 74:
                System.out.println(prefix + "()");
                break;
            case 75:
                String i75 = ((Primary) n).i;
                System.out.println(prefix + i75);
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
                CasesSub1 c180 = ((Cases) n).c1;
                System.out.println(prefix + "{");
                print(prefix,c180);
                System.out.println(prefix + "}");
                break;
            case 81:
                Block b81 = ((CasesSub1) n).b;
                String i81 = ((CasesSub1) n).i;
                System.out.println(prefix + "CASE");
                System.out.println(prefix + i81);
                System.out.println(prefix + ": TYPE =>");
                print(prefix,b81);
                break;
            case 82:
                CasesSub1 c182 = ((CasesSub1) n).c1;
                String i82 = ((CasesSub1) n).i;
                Block b82 = ((CasesSub1) n).b;
                print(prefix,c182);
                System.out.println(prefix + "CASE");
                System.out.println(prefix + i82);
                System.out.println(prefix + ": TYPE =>");
                print(prefix,b82);
                break;
            case 83:
                Block b83 = ((CasesSub1) n).b;
                System.out.println(prefix + "CASE NULL =>");
                print(prefix,b83);
                break;
            case 84:
                CasesSub1 c184 = ((CasesSub1) n).c1;
                Block b84 = ((CasesSub1) n).b;
                print(prefix,c184);
                System.out.println(prefix + "CASE NULL =>");
                print(prefix,b84);
                break;
            default:
                System.out.println("something went wrong");
                System.exit(1);
                break;
        }
    }
}
