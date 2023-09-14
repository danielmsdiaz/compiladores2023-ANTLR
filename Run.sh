export CLASSPATH=antlr.jar:.
java -jar antlr.jar -package graph -o graph Graph.g4
javac *.java graph/*.java
java Main