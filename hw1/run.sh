#Usage: run.sh <cool file>

#Example run.sh A2I.cool

jflex lexer_spec.jflex && \
javac -cp beaver-rt-0.9.11.jar:. Lexer4Cool.java cool/Terminals.java Driver.java && \
java -classpath beaver-rt-0.9.11.jar:. Driver $1
