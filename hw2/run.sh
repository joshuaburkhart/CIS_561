#!/bin/bash
#
#This program builds and runs a cool lexer
#
#Usage: run.sh <cool file>
#Example: ./run.sh cool_examples/A2I.cool

java -jar beaver-cc.jar -a cool.grammar \
\
jflex lexer_spec.jflex &&               \
\
javac -cp beaver-rt-0.9.11.jar:.        \
Lexer4Cool.java                         \
Parser4Cool.java                        \
cool/Terminals.java                     \
cool/ErrorReport.java                   \
Parser.java &&                          \
\
java -classpath beaver-rt-0.9.11.jar:. Parser $1
