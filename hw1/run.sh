jflex lexer_spec.jflex && \
javac -cp beaver-rt-0.9.11.jar:. Lexer4Cool.java Terminals.java Driver.java && \
java -classpath beaver-rt-0.9.11.jar:. Driver A2I.cool
