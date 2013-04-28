#!/bin/bash
#
#This program builds and runs a cool lexer
#
#Usage: run.sh <cool file>
#Example: ./run.sh cool_examples/A2I.cool

java -jar beaver-cc.jar -T cool.grammar \
&& \
jflex lexer_spec.jflex                  \
&& \
javac -cp beaver-rt-0.9.11.jar:.        \
Terminals.java                          \
cool/ErrorReport.java                   \
Lexer4Cool.java                         \
Parser4Cool.java                        \
Printer.java                            \
&& \
java -classpath beaver-rt-0.9.11.jar:. Printer $1
