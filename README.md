# Aplicação exemplo que resolve um problema de programação linear utilizando a biblioteca Apache Common Math.

Download da biblioteca Apache Common Math:<br>
http://commons.apache.org/proper/commons-math/index.html

Aplicação Java resolve o seguinte problema de programação linear.

<br>
<b>Metalurgica Airman</b>
<br>
A metalúrgica Airman deseja maximizar sua receita bruta. A tabela a seguir ilustra a proporção de cada material na mistura para a obtenção das  ligas passíveis de fabricação, assim como a disponibilidade de cada matéria prima (em toneladas) e os preços de venda por tonelada de cada liga. Qual deve ser a quantidade produzida de cada liga?

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
.tg .tg-c3ow{border-color:inherit;text-align:center;vertical-align:top}
.tg .tg-7btt{font-weight:bold;border-color:inherit;text-align:center;vertical-align:top}
</style>
<table class="tg">
  <tr>
    <th class="tg-7btt" rowspan="2">Ligas</th>
    <th class="tg-7btt" colspan="2">Liga Especial</th>
    <th class="tg-7btt" rowspan="2">Disponibilidade de Matéria Prima</th>
  </tr>
  <tr>
    <td class="tg-7btt">Baixa Resistência * </td>
    <td class="tg-7btt">Alta Resistência *</td>
  </tr>
  <tr>
    <td class="tg-7btt">Cobre</td>
    <td class="tg-c3ow">0.50</td>
    <td class="tg-c3ow">0.20</td>
    <td class="tg-c3ow">16 Ton.</td>
  </tr>
  <tr>
    <td class="tg-7btt">Zinco</td>
    <td class="tg-c3ow">0.25</td>
    <td class="tg-c3ow">0.30</td>
    <td class="tg-c3ow">11 Ton.</td>
  </tr>
  <tr>
    <td class="tg-7btt">Chumbo</td>
    <td class="tg-c3ow">0.25</td>
    <td class="tg-c3ow">0.50</td>
    <td class="tg-c3ow">15 Ton.</td>
  </tr>
  <tr>
    <td class="tg-7btt">Preço de Venda <br>(u.m. por Ton.)</td>
    <td class="tg-c3ow">u.m. 3000</td>
    <td class="tg-c3ow">u.m. 5000</td>
    <td class="tg-c3ow"></td>
  </tr>
</table>

Solução:
Função Objetivo = MAX 3000x1 + 5000x2
Sujeito a:
  0.50x1 + 0.20x2 <=16 
  0.25x1 + 0.30x2 <=11 
  0.25x1 + 0.50x2 <=15
  x1 >= 0 x2 >= 0

<br>
