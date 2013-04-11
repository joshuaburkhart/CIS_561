/* Joshua Burkhart */
/* 4/11/2013 */
/* Dr. Young */
/* CIS 561 */

/* Jflex lexer specification for Cool 2013 */

import beaver.Symbol;
import beaver.Scanner;
import cool.Terminals;
import cool.ErrorReport;
import java.util.ArrayList;

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
    private StringBuffer string = new StringBuffer();
    private ArrayList<ErrorReport> errors = new ArrayList<ErrorReport>();
    
    private Symbol newSymbol(short id)
    {
        return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
    }

    private Symbol newSymbol(short id, Object value)
    {
        return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
    }
%}
%state SIMPLE_STRING
%state OTHER_STRING
%state EOL_COMMENT
%state C_STYLE_COMMENT

Integer        = 0|[1-9][0-9]*
Identifier     = [a-z][0-9a-zA-Z_-]*
Type           = [A-Z][0-9a-zA-Z_-]*
Boolean        = true|false
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator}|[ \t\f]
Illegal        = abstract|catch|do|final|finally|for|forSome|implicit|import|lazy|object|package|private|protected|requires|return|sealed|throw|trait|try|type|val|with|yield

%%

<YYINITIAL> {
    null                 {return newSymbol(Terminals.NULL,yytext());}
    super                {return newSymbol(Terminals.SUPER,yytext());}
    new                  {return newSymbol(Terminals.NEW,yytext());}
    this                 {return newSymbol(Terminals.THIS,yytext());}
    var                  {return newSymbol(Terminals.VAR,yytext());}
    native               {return newSymbol(Terminals.NATIVE,yytext());}
    not                  {return newSymbol(Terminals.NOT,yytext());}
    case                 {return newSymbol(Terminals.CASE,yytext());}
    class                {return newSymbol(Terminals.CLASS,yytext());}
    while                {return newSymbol(Terminals.WHILE,yytext());}
    if                   {return newSymbol(Terminals.IF,yytext());}
    def                  {return newSymbol(Terminals.DEF,yytext());}
    else                 {return newSymbol(Terminals.ELSE,yytext());}
    match                {return newSymbol(Terminals.MATCH,yytext());}
    extends              {return newSymbol(Terminals.EXTENDS,yytext());}
    override             {return newSymbol(Terminals.OVERRIDE,yytext());}
    "("                  {return newSymbol(Terminals.LPAREN,yytext());}
    "{"                  {return newSymbol(Terminals.LBRACE,yytext());}
    "-"                  {return newSymbol(Terminals.MINUS,yytext());}
    "<"                  {return newSymbol(Terminals.LT,yytext());}
    "<="                 {return newSymbol(Terminals.LE,yytext());}
    "=="                 {return newSymbol(Terminals.EQUALS,yytext());}
    "*"                  {return newSymbol(Terminals.TIMES,yytext());}
    "/"                  {return newSymbol(Terminals.DIV,yytext());}
    "+"                  {return newSymbol(Terminals.PLUS,yytext());}
    "!"                  {return newSymbol(Terminals.NOT,yytext());}
    ")"                  {return newSymbol(Terminals.RPAREN,yytext());}
    ":"                  {return newSymbol(Terminals.COLON,yytext());}
    "}"                  {return newSymbol(Terminals.RBRACE,yytext());}
    ";"                  {return newSymbol(Terminals.SEMI,yytext());}
    "="                  {return newSymbol(Terminals.ASSIGN,yytext());}
    ","                  {return newSymbol(Terminals.COMMA,yytext());}
    "=>"                 {return newSymbol(Terminals.ARROW,yytext());}
    "."                  {return newSymbol(Terminals.DOT,yytext());}
    {Illegal}            {errors.add(new ErrorReport("Reserved Word '"+yytext()+"'",yyline + 1,yycolumn + 1)); return newSymbol(Terminals.ID,yytext());}
    {Integer}            {return newSymbol(Terminals.INTEGER,yytext());}
    {Boolean}            {return newSymbol(Terminals.BOOLEAN,yytext());}
    {Type}               {return newSymbol(Terminals.TYPE,yytext());}
    {Identifier}         {return newSymbol(Terminals.ID,yytext());}
    \"                   {string.setLength(0); yybegin(SIMPLE_STRING);}
    \"\"\"               {string.setLength(0); yybegin(OTHER_STRING);}
    \/\/                 {yybegin(EOL_COMMENT);}
    \/\*                 {yybegin(C_STYLE_COMMENT);}
    {WhiteSpace}         {/* do nothing */}
}

<EOL_COMMENT> {
    {LineTerminator}     {yybegin(YYINITIAL);}
    [^\n\r]              {/* do nothing */}
}

<C_STYLE_COMMENT> {
    \*\/                 {yybegin(YYINITIAL);}
    .|\n                    {/* do nothing */}
}

<SIMPLE_STRING> {
    \"                   {yybegin(YYINITIAL); return newSymbol(Terminals.STRING,string.toString());}
    \\0                  {string.append('\0');}
    \\b                  {string.append('\b');}
    \\t                  {string.append('\t');}
    \\n                  {string.append('\n');}
    \\r                  {string.append('\r');}
    \\f                  {string.append('\f');}
    \\\"                 {string.append('\"');}
    \\                   {string.append('\\');} 
    [^\0\b\t\n\r\f\"\\]+ {string.append(yytext());}
}

<OTHER_STRING> {
    \"\"\"               {yybegin(YYINITIAL); return newSymbol(Terminals.STRING,string.toString());}
    \\0                  {string.append('\0');}
    \\b                  {string.append('\b');}
    \\t                  {string.append('\t');}
    \\n                  {string.append('\n');}
    \\r                  {string.append('\r');}
    \\f                  {string.append('\f');}
    \\\"                 {string.append('\"');}
    \\                   {string.append('\\');} 
    .|\n                 {string.append(yytext());}
}

.|\n                     {errors.add(new ErrorReport("Unkown Symbol '"+yytext()+"'",yyline + 1, yycolumn + 1));}


