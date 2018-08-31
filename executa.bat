@echo off

if exist bin (
	echo  *** Executando projeto ***
	java -cp lib/commons-math3-3.6.1.jar;bin Principal
)
pause