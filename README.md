# Aplicação exemplo que resolve um problema de programação linear utilizando a biblioteca Apache Common Math.

Download da biblioteca Apache Common Math:<br>
http://commons.apache.org/proper/commons-math/index.html

Aplicação Java resolve o seguinte problema de programação linear.

<br>
<b>Metalurgica Airman</b>
<br>
A metalúrgica Airman deseja maximizar sua receita bruta. A tabela a seguir ilustra a proporção de cada material na mistura para a obtenção das  ligas passíveis de fabricação, assim como a disponibilidade de cada matéria prima (em toneladas) e os preços de venda(em u.m.) por tonelada de cada liga. Qual deve ser a quantidade produzida de cada liga?
<br>
<table>
  <tr>
    <th rowspan="2">Ligas</th>
    <th colspan="2">Liga Especial</th>
    <th rowspan="2">Disponibilidade de Matéria Prima</th>
  </tr>
  <tr>
    <td>Baixa Resistência * </td>
    <td>Alta Resistência *</td>
  </tr>
  <tr>
    <td>Cobre</td>
    <td>0.50</td>
    <td>0.20</td>
    <td>16 Ton.</td>
  </tr>
  <tr>
    <td>Zinco</td>
    <td>0.25</td>
    <td>0.30</td>
    <td>11 Ton.</td>
  </tr>
  <tr>
    <td>Chumbo</td>
    <td>0.25</td>
    <td>0.50</td>
    <td>15 Ton.</td>
  </tr>
  <tr>
    <td>Preço de Venda <br>(u.m. por Ton.)</td>
    <td>u.m. 3000</td>
    <td>u.m. 5000</td>
    <td></td>
  </tr>
</table>

<br>
<b>Solução:</b><br>
Função Objetivo = MAX 3000x1 + 5000x2<br>
Sujeito a:<br>
  0.50x1 + 0.20x2 <=16 <br>
  0.25x1 + 0.30x2 <=11 <br>
  0.25x1 + 0.50x2 <=15<br>
  x1 >= 0 x2 >= 0<br>
<br>
