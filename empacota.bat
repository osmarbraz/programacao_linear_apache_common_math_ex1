@echo off

if not exist bin (
	call compila.bat
)

if not exist jar (
	echo  *** Criando Diretorio jar ***
	mkdir jar
)

echo  *** Empacotando projeto ***
cd bin
jar cvfe ..\jar\cliente3c.jar Principal bin/ .
cd ..
