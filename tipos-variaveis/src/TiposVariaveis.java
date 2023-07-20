public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos
        // estude a classe String que representa texto na aplicação

        String meuNome = "Paulo Roberto de Andrade Lima";
        
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;/*cuidado ao atribuir 
                                                valores de variaveis sem 
                                                observar a sua capacidade
                                                e característica*/
 
        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; /* "final" no inicio da declaração
                                         de variável, indica Constante para
                                          a liguagem JAVA, o nome em 
                                          CAIXA_ALTA é convenção. */
         

    }
}
