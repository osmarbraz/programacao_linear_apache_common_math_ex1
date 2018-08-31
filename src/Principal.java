
/**
 * Aplicação exemplo que resolve um problema de programação linear utilizando a biblioteca Apache Common Math.
 * Download da biblioteca Apache Common Math: http://commons.apache.org/proper/commons-math/index.html
 *
 * Aplicação Java resolve o seguinte problema de programação linear.
 *
 * <br>
 * <b>Metalurgica Airman</b>
 * <br>
 * A metalúrgica Airman deseja maximizar sua receita bruta. A tabela a seguir
 * ilustra a proporção de cada material na mistura para a obtenção das ligas
 * passíveis de fabricação, assim como a disponibilidade de cada matéria prima
 * (em toneladas) e os preços de venda por tonelada de cada liga. Qual deve ser
 * a quantidade produzida de cada liga?
 *
 * ----------------------------------------------------------------------------------------------
 * | Ligas         |                           Liga Especial                                    |
 * ----------------------------------------------------------------------------------------------         
 * |               |Baixa Resistência *  |Alta Resistência *   |Disponibilidade de Matéria Prima|
 * ----------------------------------------------------------------------------------------------
 * |Cobre          |0.50                 |0.20                 |16 Ton.                         |
 * |Zinco          |0.25                 |0.30                 |11 Ton.                         |
 * |Chumbo         |0.25                 |0.50                 |15 Ton.                         |
 * ----------------------------------------------------------------------------------------------
 * |Preço de Venda |u.m. 3000            |u.m. 5000                                             |
 * |(u.m. por Ton.)|                     |                                                      |
 * ----------------------------------------------------------------------------------------------
 * Ton. de minério/Ton. de liga
 *
 * Solução:
 * Função Objetivo = MAX 3000x1 + 5000x2 *
 * Sujeito a:
 * 0.50x1 + 0.20x2 <=16 
 * 0.25x1 + 0.30x2 <=11 
 * 0.25x1 + 0.50x2 <=15
 * x1 >= 0 x2 >= 0
 *
 */
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.linear.LinearConstraint;
import org.apache.commons.math3.optim.linear.LinearConstraintSet;
import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optim.linear.Relationship;
import org.apache.commons.math3.optim.linear.SimplexSolver;

public class Principal {

    public static void main(String[] args) {

        //Descreve a funcao objetivo
        LinearObjectiveFunction funcaoObjetivo = new LinearObjectiveFunction(new double[]{3000, 5000}, 0);

        //Colllection das restrições
        Collection<LinearConstraint> restricoes = new ArrayList<LinearConstraint>();

        //Adiciona as restrições no Collection
        restricoes.add(new LinearConstraint(new double[]{0.5, 0.2}, Relationship.LEQ, 16));
        restricoes.add(new LinearConstraint(new double[]{0.25, 0.3}, Relationship.LEQ, 11));
        restricoes.add(new LinearConstraint(new double[]{0.25, 0.5}, Relationship.LEQ, 15));
        restricoes.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 0));
        restricoes.add(new LinearConstraint(new double[]{1, 0}, Relationship.GEQ, 0));

        //Cria e executa o solver
        PointValuePair solucao = new SimplexSolver().optimize(funcaoObjetivo, new LinearConstraintSet(restricoes), GoalType.MAXIMIZE);

        //Verifica se existe solucao
        if (solucao != null) {
            //Recupera o valor resultante da função objetivo
            double resultado = solucao.getValue();
            System.out.println("Otimizacao: " + resultado);
            //Imprime o valor das variáveis de decisão
            for (int i = 0; i < 2; i++) {
                System.out.print("x" + (i + 1) + "=" + solucao.getPoint()[i] + "\n");
            }
        }
    }
}
