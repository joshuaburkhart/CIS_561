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
        prefix = prefix + " ";
        System.out.println(prefix + "{");
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
                String t2 = ((ClassDecl) n).t;

                printJSON(prefix,"CLASS");
                printJSON(prefix,"type",t2);
                print(prefix,v2);
                print(prefix,c2);
                break;
            case 3:
                VarFormals v3 = ((ClassDecl) n).v;
                Actuals a3 = ((ClassDecl) n).a;
                ClassBody c3 = ((ClassDecl) n).c;
                String t3 = ((ClassDecl) n).t;
                String tt3 = ((ClassDecl) n).tt;

                printJSON(prefix,"CLASS");
                printJSON(prefix,"type",t3);
                print(prefix,v3);
                printJSON(prefix,"EXTENDS");
                printJSON(prefix,"type",tt3);
                print(prefix,a3);
                print(prefix,c3);
                break;
            case 4:
                VarFormals v4 = ((ClassDecl) n).v;
                ClassBody c4 = ((ClassDecl) n).c;
                String t4 = ((ClassDecl) n).t;

                printJSON(prefix,"CLASS");
                printJSON(prefix,"type",t4);
                print(prefix,v4);
                printJSON(prefix,"EXTENDS");
                printJSON(prefix,"NATIVE");
                print(prefix,c4);
                break;
            case 5:
                printJSON(prefix,"(");
                printJSON(prefix,")");
                break;
            case 6:
                String i6 = ((VarFormals) n).i;
                String t6 = ((VarFormals) n).t;

                printJSON(prefix,"(");
                printJSON(prefix,"VAR");
                printJSON(prefix,"id",i6);
                printJSON(prefix,"type",t6);
                printJSON(prefix,")");
                break;
            case 7:
                VarFormalsSub1 v7 = ((VarFormals) n).v;
                String i7 = ((VarFormals) n).i;
                String t7 = ((VarFormals) n).t;

                printJSON(prefix,"(");
                print(prefix,v7);
                printJSON(prefix,"VAR");
                printJSON(prefix,"id",i7);
                printJSON(prefix,":");
                printJSON(prefix,"type",t7);
                printJSON(prefix,")");
                break;
            case 8:
                String i8 = ((VarFormalsSub1) n).i;
                String t8 = ((VarFormalsSub1) n).t;

                printJSON(prefix,"VAR");
                printJSON(prefix,"id",i8);
                printJSON(prefix,"type",t8); 
                printJSON(prefix,",");
                break;
            case 9:
                VarFormalsSub1 v9 = ((VarFormalsSub1) n).v;
                String i9 = ((VarFormalsSub1) n).i;
                String t9 = ((VarFormalsSub1) n).t;

                print(prefix,v9);
                printJSON(prefix,"VAR"); 
                printJSON(prefix,"id",i9); 
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t9); 
                printJSON(prefix,",");
                break;
            case 10:
                printJSON(prefix,"(");
                printJSON(prefix,")");
                break;
            case 11:
                Feature f11 = ((ClassBody) n).f;

                printJSON(prefix,"(");
                print(prefix,f11);
                printJSON(prefix,")");
                break;
            case 12:
                ClassBodySub1 c12 = ((ClassBody) n).c;
                Feature f12 = ((ClassBody) n).f;

                printJSON(prefix,"(");
                print(prefix,c12);
                print(prefix,f12);
                printJSON(prefix,")");
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
                printJSON(prefix,"NATIVE"); 
                printJSON(prefix,";");
                break;
            case 16:
                FeatureSub1 f16 = ((Feature) n).f;
                Expr e16 = ((Feature) n).e;

                print(prefix,f16);
                print(prefix,e16);
                printJSON(prefix,";");
                break;
            case 17:
                FeatureSub1 f17 = ((Feature) n).f;

                printJSON(prefix,"OVERRIDE");
                print(prefix,f17);
                printJSON(prefix,"NATIVE"); 
                printJSON(prefix,";");
                break;
            case 18:
                FeatureSub1 f18 = ((Feature) n).f;
                Expr e18 = ((Feature) n).e;

                printJSON(prefix,"OVERRIDE");
                print(prefix,f18);
                print(prefix,e18);
                printJSON(prefix,";");
                break;
            case 19:
                FeatureSub2 f219 = ((Feature) n).f2;

                print(prefix,f219);
                printJSON(prefix,"="); 
                printJSON(prefix,"NATIVE"); 
                printJSON(prefix,";");
                break;
            case 20:
                FeatureSub2 f220 = ((Feature) n).f2;
                Expr e20 = ((Feature) n).e;
                String t20 = ((Feature) n).t;

                print(prefix,f220);
                printJSON(prefix,":");
                printJSON(prefix,"type",t20); 
                printJSON(prefix,"=");
                print(prefix,e20);
                printJSON(prefix,";");
                break;
            case 21:
                Block b21 = ((Feature) n).b;

                printJSON(prefix,"{");
                print(prefix,b21);
                printJSON(prefix,"}");
                printJSON(prefix,";");
                break;
            case 22:
                Formals f22 = ((FeatureSub1) n).f;
                String i22 = ((FeatureSub1) n).i;
                String t22 = ((FeatureSub1) n).t;

                printJSON(prefix,"DEF"); 
                printJSON(prefix,"id",i22);
                print(prefix,f22);
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t22); 
                printJSON(prefix,"=");
                break;
            case 23:
                String i23 = ((FeatureSub2) n).i;

                printJSON(prefix,"VAR"); 
                printJSON(prefix,"id",i23);
                break;
            case 24:
                printJSON(prefix,"(");
                printJSON(prefix,")");
                break;
            case 25:
                String i25 = ((Formals) n).i;
                String t25 = ((Formals) n).t;

                printJSON(prefix,"("); 
                printJSON(prefix,"id",i25);
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t25);
                printJSON(prefix,")");
                break;
            case 26:
                FormalsSub1 f26 = ((Formals) n).f;
                String i26 = ((Formals) n).i;
                String t26 = ((Formals) n).t;

                printJSON(prefix,"(");
                print(prefix,f26);
                printJSON(prefix,"id",i26);
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t26); 
                printJSON(prefix,")");
                break;
            case 27:
                String i27 = ((FormalsSub1) n).i;
                String t27 = ((FormalsSub1) n).t;

                printJSON(prefix,"id",i27);
                printJSON(prefix,":");
                printJSON(prefix,"type",t27); 
                printJSON(prefix,",");
                break;
            case 28:
                FormalsSub1 f28 = ((FormalsSub1) n).f;
                String i28 = ((FormalsSub1) n).i;
                String t28 = ((FormalsSub1) n).t;

                print(prefix,f28);
                printJSON(prefix,"id",i28);
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t28); 
                printJSON(prefix,",");
                break;
            case 29:
                printJSON(prefix,"(");
                printJSON(prefix,")");
                break;
            case 30:
                Expr e30 = ((Actuals) n).e;

                printJSON(prefix,"(");
                print(prefix,e30);
                printJSON(prefix,")");
                break;
            case 31:
                ActualsSub1 a31 = ((Actuals) n).a;
                Expr e31 = ((Actuals) n).e;

                printJSON(prefix,"(");
                print(prefix,a31);
                print(prefix,e31);
                printJSON(prefix,")");
                break;
            case 32:
                Expr e32 = ((ActualsSub1) n).e;

                print(prefix,e32);
                printJSON(prefix,",");
                break;
            case 33:
                ActualsSub1 a33 = ((ActualsSub1) n).a;
                Expr e33 = ((ActualsSub1) n).e;

                print(prefix,a33);
                print(prefix,e33);
                printJSON(prefix,",");
                break;
            case 34:
                printJSON(prefix,"");
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
                printJSON(prefix,";");
                break;
            case 38:
                BlockSub1 b38 = ((BlockSub1) n).b;
                Expr e38 = ((BlockSub1) n).e;

                print(prefix,b38);
                print(prefix,e38);
                printJSON(prefix,";");
                break;
            case 39:
                Expr e39 = ((BlockSub1) n).e;
                String i39 = ((BlockSub1) n).i;
                String t39 = ((BlockSub1) n).t;

                printJSON(prefix,"VAR"); 
                printJSON(prefix,"id",i39); 
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t39); 
                printJSON(prefix,"=");
                print(prefix,e39);
                printJSON(prefix,";");
                break;
            case 40:
                BlockSub1 b40 = ((BlockSub1) n).b;
                String i40 = ((BlockSub1) n).i;
                Expr e40 = ((BlockSub1) n).e;
                String t40 = ((BlockSub1) n).t;

                print(prefix,b40);
                printJSON(prefix,"VAR");
                printJSON(prefix,"id",i40); 
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t40); 
                printJSON(prefix,"=");
                print(prefix,e40);
                printJSON(prefix,";");
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
                ExprSub2 e245 = ((ExprSub1) n).e2;
                Primary p45 = ((ExprSub1) n).p;

                print(prefix,e1145);
                print(prefix,e245);
                print(prefix,p45);
                break;
            case 451:
                ExprSub11 e11451 = ((ExprSub1) n).e11;
                Primary p451 = ((ExprSub1) n).p;

                print(prefix,e11451);
                print(prefix,p451);
                break;
            case 46:
                ExprSub1 e146 = ((ExprSub1) n).e1;
                ExprSub11 e1146 = ((ExprSub1) n).e11;
                ExprSub2 e246 = ((ExprSub1) n).e2;
                Primary p46 = ((ExprSub1) n).p;

                print(prefix,e146);
                print(prefix,e1146);
                print(prefix,e246);
                print(prefix,p46);
                break;
            case 461:
                ExprSub1 e1461 = ((ExprSub1) n).e1;
                ExprSub11 e11461 = ((ExprSub1) n).e11;
                Primary p461 = ((ExprSub1) n).p;

                print(prefix,e1461);
                print(prefix,e11461);
                print(prefix,p461);
                break;
            case 47:
                Cases c47 = ((ExprSub1) n).c;

                printJSON(prefix,"MATCH");
                print(prefix,c47);
                break;
            case 48:
                ExprSub1 e148 = ((ExprSub1) n).e1;
                Cases c48 = ((ExprSub1) n).c;

                print(prefix,e148);
                printJSON(prefix,"MATCH");
                print(prefix,c48);
                break;
            case 49:
                String i49 = ((ExprSub1) n).i;
                Actuals a49 = ((ExprSub1) n).a;

                printJSON(prefix,".");
                printJSON(prefix,"id",i49);
                print(prefix,a49);
                break;
            case 50:
                ExprSub1 e150 = ((ExprSub1) n).e1;
                String i50 = ((ExprSub1) n).i;
                Actuals a50 = ((ExprSub1) n).a;

                print(prefix,e150);
                printJSON(prefix,".");
                printJSON(prefix,"id",i50);
                print(prefix,a50);
                break;
            case 51:
                printJSON(prefix,"<=");
                break;
            case 52:
                printJSON(prefix,"<");
                break;
            case 53:
                printJSON(prefix,"==");
                break;
            case 54:
                printJSON(prefix,"*");
                break;
            case 55:
                printJSON(prefix,"/");
                break;
            case 56:
                printJSON(prefix,"+");
                break;
            case 57:
                printJSON(prefix,"-");
                break;
            case 58:
                String i58 = ((ExprSub2) n).i;

                printJSON(prefix,"id",i58); 
                printJSON(prefix,"=");
                break;
            case 59:
                ExprSub2 e259 = ((ExprSub2) n).e2;
                String i59 = ((ExprSub2) n).i;

                print(prefix,e259);
                printJSON(prefix,"id",i59); 
                printJSON(prefix,"=");
                break;
            case 60:
                printJSON(prefix,"!");
                break;
            case 61:
                ExprSub2 e261 = ((ExprSub2) n).e2;

                print(prefix,e261);
                printJSON(prefix,"!");
                break;
            case 62:
                printJSON(prefix,"-");
                break;
            case 63:
                ExprSub2 e263 = ((ExprSub2) n).e2;

                print(prefix,e263);
                printJSON(prefix,"-");
                break;
            case 64:
                Expr e64 = ((ExprSub2) n).e;
                Expr ee64 = ((ExprSub2) n).ee;

                printJSON(prefix,"IF");
                printJSON(prefix,"(");
                print(prefix,e64);
                printJSON(prefix,")");
                print(prefix,ee64);
                printJSON(prefix,"ELSE");
                break;
            case 65:
                ExprSub2 e265 = ((ExprSub2) n).e2;
                Expr e65 = ((ExprSub2) n).e;
                Expr ee65 = ((ExprSub2) n).ee;

                print(prefix,e265);
                printJSON(prefix,"IF");
                printJSON(prefix,"(");
                print(prefix,e65);
                printJSON(prefix,")");
                print(prefix,ee65);
                printJSON(prefix,"ELSE");
                break;
            case 66:
                Expr e66 = ((ExprSub2) n).e;

                printJSON(prefix,"WHILE");
                printJSON(prefix,"(");
                print(prefix,e66);
                printJSON(prefix,")");
                break;
            case 67:
                ExprSub2 e267 = ((ExprSub2) n).e2;
                Expr e67 = ((ExprSub2) n).e;

                print(prefix,e267);
                printJSON(prefix,"WHILE");
                printJSON(prefix,"(");
                print(prefix,e67);
                printJSON(prefix,")");
                break;
            case 68:
                String i68 = ((Primary) n).i;
                Actuals a68 = ((Primary) n).a;

                printJSON(prefix,"id",i68);
                print(prefix,a68);
                break;
            case 69:
                String i69 = ((Primary) n).i;
                Actuals a69 = ((Primary) n).a;

                printJSON(prefix,"SUPER");
                printJSON(prefix,"."); 
                printJSON(prefix,"id",i69);
                print(prefix,a69);
                break;
            case 70:
                Actuals a70 = ((Primary) n).a;
                String t70 = ((Primary) n).t;

                printJSON(prefix,"NEW"); 
                printJSON(prefix,"type",t70);
                print(prefix,a70);
                break;
            case 71:
                Block b71 = ((Primary) n).b;

                printJSON(prefix,"{");
                print(prefix,b71);
                printJSON(prefix,"}");
                break;
            case 72:
                Expr e72 = ((Primary) n).e;

                printJSON(prefix,"(");
                print(prefix,e72);
                printJSON(prefix,")");
                break;
            case 73:
                printJSON(prefix,"NULL");
                break;
            case 74:
                printJSON(prefix,"(");
                printJSON(prefix,")");
                break;
            case 75:
                String i75 = ((Primary) n).i;

                printJSON(prefix,"id",i75);
                break;
            case 76:
                String n76 = ((Primary) n).n;

                printJSON(prefix,"integer",n76);
                break;
            case 77:
                String s77 = ((Primary) n).s;

                printJSON(prefix,"string",s77);
                break;
            case 78:
                String o78 = ((Primary) n).o;

                printJSON(prefix,"boolean",o78);
                break;
            case 79:
                printJSON(prefix,"THIS");
                break;
            case 80:
                CasesSub1 c180 = ((Cases) n).c1;

                printJSON(prefix,"{");
                print(prefix,c180);
                printJSON(prefix,"}");
                break;
            case 81:
                Block b81 = ((CasesSub1) n).b;
                String i81 = ((CasesSub1) n).i;
                String t81 = ((CasesSub1) n).t;

                printJSON(prefix,"CASE"); 
                printJSON(prefix,"id",i81); 
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t81); 
                printJSON(prefix,"=>");
                print(prefix,b81);
                break;
            case 82:
                CasesSub1 c182 = ((CasesSub1) n).c1;
                String i82 = ((CasesSub1) n).i;
                Block b82 = ((CasesSub1) n).b;
                String t82 = ((CasesSub1) n).t;

                print(prefix,c182);
                printJSON(prefix,"CASE"); 
                printJSON(prefix,"id",i82); 
                printJSON(prefix,":"); 
                printJSON(prefix,"type",t82); 
                printJSON(prefix,"=>");
                print(prefix,b82);
                break;
            case 83:
                Block b83 = ((CasesSub1) n).b;

                printJSON(prefix,"CASE");
                printJSON(prefix,"NULL"); 
                printJSON(prefix,"=>");
                print(prefix,b83);
                break;
            case 84:
                CasesSub1 c184 = ((CasesSub1) n).c1;
                Block b84 = ((CasesSub1) n).b;

                print(prefix,c184);
                printJSON(prefix,"CASE"); 
                printJSON(prefix,"NULL"); 
                printJSON(prefix,"=>");
                print(prefix,b84);
                break;
            default:
                System.out.println("something went wrong");
                System.exit(1);
                break;
        }
        System.out.println(prefix + "}");
    }

    private static void printJSON(String pre, String in)
    {
        printJSON(pre,"terminal","\"" + in + "\"");   
    }

    private static void printJSON(String pre, String label, String in)
    {
        System.out.println(pre + " \"" + label + "\": " + in);
    }
}
