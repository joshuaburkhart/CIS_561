/* Joshua Burkhart */
/* 4/11/2013 */
/* Dr. Young */
/* CIS 561 */

/* Jflex lexer specification for Cool 2013 */

import beaver.Symbol;
import beaver.Scanner;
import cool.ErrorReport;
import java.util.ArrayList;

%%

%class Lexer4Cool
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
    return newToken(Terminals.EOF, "end-of-file");
%eofval}
%unicode
%line
%column
%{
    private StringBuffer string = new StringBuffer();
    private ArrayList<ErrorReport> errors = new ArrayList<ErrorReport>();
    
    private Symbol newToken(short id)
    {
        return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
    }

    private Symbol newToken(short id, Object value)
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
    null                 {return newToken(Terminals.NULL,       yytext());}
    super                {return newToken(Terminals.SUPER,      yytext());}
    new                  {return newToken(Terminals.NEW,        yytext());}
    this                 {return newToken(Terminals.THIS,       yytext());}
    var                  {return newToken(Terminals.VAR,        yytext());}
    native               {return newToken(Terminals.NATIVE,     yytext());}
    not                  {return newToken(Terminals.NOT,        yytext());}
    case                 {return newToken(Terminals.CASE,       yytext());}
    class                {return newToken(Terminals.CLASS,      yytext());}
    while                {return newToken(Terminals.WHILE,      yytext());}
    if                   {return newToken(Terminals.IF,         yytext());}
    def                  {return newToken(Terminals.DEF,        yytext());}
    else                 {return newToken(Terminals.ELSE,       yytext());}
    match                {return newToken(Terminals.MATCH,      yytext());}
    extends              {return newToken(Terminals.EXTENDS,    yytext());}
    override             {return newToken(Terminals.OVERRIDE,   yytext());}
    "("                  {return newToken(Terminals.LPAREN,     yytext());}
    "{"                  {return newToken(Terminals.LBRACE,     yytext());}
    "-"                  {return newToken(Terminals.MINUS,      yytext());}
    "<"                  {return newToken(Terminals.LT,         yytext());}
    "<="                 {return newToken(Terminals.LE,         yytext());}
    "=="                 {return newToken(Terminals.EQUALS,     yytext());}
    "*"                  {return newToken(Terminals.TIMES,      yytext());}
    "/"                  {return newToken(Terminals.DIV,        yytext());}
    "+"                  {return newToken(Terminals.PLUS,       yytext());}
    "!"                  {return newToken(Terminals.NOT,        yytext());}
    ")"                  {return newToken(Terminals.RPAREN,     yytext());}
    ":"                  {return newToken(Terminals.COLON,      yytext());}
    "}"                  {return newToken(Terminals.RBRACE,     yytext());}
    ";"                  {return newToken(Terminals.SEMI,       yytext());}
    "="                  {return newToken(Terminals.ASSIGN,     yytext());}
    ","                  {return newToken(Terminals.COMMA,      yytext());}
    "=>"                 {return newToken(Terminals.ARROW,      yytext());}
    "."                  {return newToken(Terminals.DOT,        yytext());}
    {Illegal}            {errors.add(new ErrorReport("Reserved Word '"+yytext()+"'",yyline + 1,yycolumn + 1)); return newToken(Terminals.ID,yytext());}
    {Integer}            {return newToken(Terminals.INTEGER,    yytext());}
    {Boolean}            {return newToken(Terminals.BOOLEAN,    yytext());}
    {Type}               {return newToken(Terminals.TYPE,       yytext());}
    {Identifier}         {return newToken(Terminals.ID,         yytext());}
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
    \"|{LineTerminator}  {yybegin(YYINITIAL); return newToken(Terminals.STRING,string.toString());}
    \\0                  {string.append('\0');}
    \\b                  {string.append('\b');}
    \\t                  {string.append('\t');}
    \\f                  {string.append('\f');}
    \\\"                 {string.append('\"');}
    \\                   {string.append('\\');} 
    [^\0\b\t\n\r\f\"\\]+ {string.append(yytext());}
}

<OTHER_STRING> {
    \"\"\"               {yybegin(YYINITIAL); return newToken(Terminals.STRING,string.toString());}
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


