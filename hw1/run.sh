#!/bin/bash
#
#This program builds and runs a cool lexer
#
#Usage: run.sh <cool file>
#Example: ./run.sh cool_examples/A2I.cool

jflex lexer_spec.jflex && \
\
javac -cp beaver-rt-0.9.11.jar:. \
Lexer4Cool.java \
cool/Terminals.java \
cool/ErrorReport.java \
Driver.java && \
\
java -classpath beaver-rt-0.9.11.jar:. Driver $1
