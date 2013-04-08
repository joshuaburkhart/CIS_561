/* Joshua Burkhart */
/* 4/11/2013 */
/* Dr. Young */
/* CIS 561 */

/* Jflex lexer specification for Cool 2013 */

import beaver.Symbol;
import beaver.Scanner;

%%

%class Lexer4Cool
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
    return new Symbol(Terminals.EOF, "end-of-file");
%eofval}
%unicode
%line
%column
%{
    private int token_line;
    private int token_column;
    private String matched_text;
    
    private Symbol newSymbol(short id)
    {
        return new Symbol(id, yyline +1, yycolumn + 1, yylength(), yytext());
    }

    private Symbol newSymbol(short id, Object value)
    {
        return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
    }
%}

%%

<YYINITIAL> {
    //EOF
    //ID
    "("                 {return new Symbol(Terminals.LPAREN);}
    "{"                 {return new Symbol(Terminals.LBRACE);}
    "null"              {return new Symbol(Terminals.NULL);}
    "super"             {return new Symbol(Terminals.SUPER);}
    "new"               {return new Symbol(Terminals.NEW);}
    "-"                 {return new Symbol(Terminals.MINUS);}
    //INTEGER
    //STRING
    //BOOLEAN
    "this"              {return new Symbol(Terminals.THIS);}
    "if"                {return new Symbol(Terminals.IF);}
    "while"             {return new Symbol(Terminals.WHILE);}
    "!"                 {return new Symbol(Terminals.NOT);}
    ")"                 {return new Symbol(Terminals.RPAREN);}
    //TYPE
    ":"                 {return new Symbol(Terminals.COLON);}
    //VAR
    "}"                 {return new Symbol(Terminals.RBRACE);}
    ";"                 {return new Symbol(Terminals.SEMI);}
    "="                 {return new Symbol(Terminals.ASSIGN);}
    //CASE
    //DEF
    //NATIVE
    ","                 {return new Symbol(Terminals.COMMA);}
    //ARROW
    "."                 {return new Symbol(Terminals.DOT);}

}

.|\n                    {throw new Scanner.Exception(yyline + 1, yycolumn + 1, "ERROR ON: '" + yytext() + "'");}



