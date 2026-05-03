import java.util.Scanner;

class CoordenadasTriangulo{

    /*
    Exercício 5: Faça um programa que leia três coordenadas num espaço 2D e indique se
    formam um triângulo, juntamente com o seu tipo (equilátero, isósceles e escaleno)
        ○ Equilátero: todos os lados iguais
        ○ Isósceles: dois lados iguais
        ○ Escaleno: todos os lados diferentes
    */

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 Coordenadas para verificar se elas formam um triangulo no espaço 2D Ex: x1 y1 x2 y2 x3 y3");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        /*
        

        1.  **O Problema:** Três pontos nem sempre são um triângulo. Se eles estiverem em linha reta (ex: $(1,1), (2,2), (3,3)$), eles não formam um triângulo.

        2.  **O Determinante:** É um cálculo matemático que mede a "área" entre três pontos. 

        3.  **A Regra:**
            * **Determinante = 0:** Os pontos estão alinhados (colineares). **Não é triângulo.**
            * **Determinante $\neq$ 0:** Os pontos têm um "desvio" entre si. **É triângulo.**
        
        */

    

        double det = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);

        if(det != 0){
            System.out.println("Essas Coordenadas Fornecidas São um Triangulo");
            
            // Calculando distancias entre os pontos

            /* RESUMO DO FUNCIONAMENTO:
            1. Determinante: Se det == 0, os pontos estão em linha reta (não é triângulo).
            2. Math.sqrt: Calcula a distância real (lado) entre os pontos.
            3. Epsilon (0.01): Margem de erro para ignorar pequenas imprecisões da raiz quadrada.
            4. Classificação: Compara se a diferença entre os lados é menor que o Epsilon 
                para definir se são iguais (Equilátero), dois iguais (Isósceles) ou diferentes (Escaleno).
            */

            // long d1sq = (long)Math.pow(x2 - x1, 2) + (long)Math.pow(y2 - y1, 2);
            // long d2sq = (long)Math.pow(x3 - x2, 2) + (long)Math.pow(y3 - y2, 2);
            // long d3sq = (long)Math.pow(x1 - x3, 2) + (long)Math.pow(y1 - y3, 2);
            // long eps = 2; 


            double d1sq = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double d2sq = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double d3sq = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
            double eps = 0.01;

            boolean eq12 = Math.abs(d1sq - d2sq) <= eps;
            boolean eq23 = Math.abs(d2sq - d3sq) <= eps;
            boolean eq13 = Math.abs(d1sq - d3sq) <= eps;

            if (eq12 && eq23) {
                System.out.println("Triângulo é Equilátero (ou muito próximo disso).");
            } else if (eq12 || eq23 || eq13) {
                System.out.println("Triângulo é Isósceles.");
            } else {
                System.out.println("Triângulo é Escaleno.");
            }


        }else{
            System.out.println("Puxa infelizmente não é um triangulo!!");
        }

        sc.close();

    }
}