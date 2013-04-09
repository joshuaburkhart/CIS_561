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
%state STRING
%state COMMENT

Integer = 0|[1-9][0-9]*
Identifier = [a-z][0-9a-zA-Z_-]*

%%

<YYINITIAL> {
    //EOF
    "("                 {return new Symbol(Terminals.LPAREN);}
    "{"                 {return new Symbol(Terminals.LBRACE);}
    null                {return new Symbol(Terminals.NULL);}
    super               {return new Symbol(Terminals.SUPER);}
    new                 {return new Symbol(Terminals.NEW);}
    "-"                 {return new Symbol(Terminals.MINUS);}
    {Integer}           {return new Symbol(Terminals.INTEGER,yytext());}
    //STRING
    true|false          {return new Symbol(Terminals.BOOLEAN,yytext());}
    this                {return new Symbol(Terminals.THIS);}
    if                  {return new Symbol(Terminals.IF);}
    while               {return new Symbol(Terminals.WHILE);}
    "!"                 {return new Symbol(Terminals.NOT);}
    ")"                 {return new Symbol(Terminals.RPAREN);}
    //TYPE
    ":"                 {return new Symbol(Terminals.COLON);}
    var                 {return new Symbol(Terminals.VAR);}
    "}"                 {return new Symbol(Terminals.RBRACE);}
    ";"                 {return new Symbol(Terminals.SEMI);}
    "="                 {return new Symbol(Terminals.ASSIGN);}
    case                {return new Symbol(Terminals.CASE);}
    def                 {return new Symbol(Terminals.DEF);}
    //NATIVE
    ","                 {return new Symbol(Terminals.COMMA);}
    "<="                {return new Symbol(Terminals.ARROW);}
    "."                 {return new Symbol(Terminals.DOT);}
    {Identifier}        {return new Symbol(Terminals.ID,yytext());}

}

//<STRING> {

//}

//<COMMENT> {

//}

.|\n                    {throw new Scanner.Exception(yyline + 1, yycolumn + 1, "ERROR ON: '" + yytext() + "'");}



