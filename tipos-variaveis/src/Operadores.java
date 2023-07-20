public class Operadores {
    public static void main(String[] args){
        String nomeUm = "Paulo"; 
        String nomeDois = new String("Paulo");// Criação do Objeto "nomeDois"
        System.out.println("Nome 1 é igual a nome 2? " + (nomeUm.equals(nomeDois)));//equals(=), método para relacionar objetos

        int numero1 = 1, numero2 = 2;
        
        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("A condição é verdadeira");
        }
        System.out.println("Número 1 é igual ao número 2? " + simNao);
        
        simNao = numero1 != numero2;
        System.out.println("Número 1 é diferente do número 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Número 1 é maior que o número 2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Número 1 é menor que o número 2? " + simNao);

        //Teste booleano

        boolean condicao1=true, condicao2=true;

        if(condicao1 && (7>4)){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeiras");
        }
        System.out.println("fim");
    }
}

