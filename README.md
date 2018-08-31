# Aplicação exemplo que resolve um problema de programação linear utilizando a biblioteca Apache Common Math.

Download da biblioteca Apache Common Math:<br>
http://commons.apache.org/proper/commons-math/index.html

Aplicação Java resolve o seguinte problema de programação linear.

<br>
<b>Metalurgica Airman</b>
<br>
A metalúrgica Airman deseja maximizar sua receita bruta. A tabela a seguir ilustra a proporção de cada material na mistura para a obtenção das  ligas passíveis de fabricação, assim como a disponibilidade de cada matéria prima (em toneladas) e os preços de venda por tonelada de cada liga. Qual deve ser a quantidade produzida de cada liga?

----------------------------------------------------------------------------------------------
| Ligas         |                           Liga Especial                                    |
----------------------------------------------------------------------------------------------         
|               |Baixa Resistência *  |Alta Resistência *   |Disponibilidade de Matéria Prima|
----------------------------------------------------------------------------------------------
|Cobre          |0.50                 |0.20                 |16 Ton.                         |
||Zinco         |0.25                 |0.30                 |11 Ton.                         |
|Chumbo         |0.25                 |0.50                 |15 Ton.                         |
----------------------------------------------------------------------------------------------
|Preço de Venda |u.m. 3000            |u.m. 5000                                             |
|(u.m. por Ton.)|                     |                                                      |
----------------------------------------------------------------------------------------------
* Ton. de minério/Ton. de liga

Solução:
Função Objetivo = MAX 3000x1 + 5000x2
Sujeito a:
  0.50x1 + 0.20x2 <=16 
  0.25x1 + 0.30x2 <=11 
  0.25x1 + 0.50x2 <=15
  x1 >= 0 x2 >= 0

<br>
