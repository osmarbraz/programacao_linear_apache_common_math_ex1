@echo off

if not exist bin (
	echo  *** Criando Diretorio bin ***
	mkdir bin
)

echo  *** Compilando projeto ***
javac -cp lib/commons-math3-3.6.1.jar;lib -Xlint -sourcepath src -d bin src/*.java