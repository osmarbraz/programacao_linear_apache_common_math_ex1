@echo off

if not exist doc (
	echo  *** Criando Diretorio doc ***
	mkdir doc
)

echo  *** Documentando projeto ***
javadoc -author src\dao\cliente\**.java src\dao\**.java src\**.java src\entidade\**.java src\controle\**.java src\formulario\**.java -author -d doc