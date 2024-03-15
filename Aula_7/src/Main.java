public class Main {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5]; //não criei nenhuma instância ainda
        Conta conta1 = new Conta();
        conta1.saldo = 500; //Associando
        contas[0] = conta1;
        System.out.println(contas[0]); // vai mostrar um endereço de memória

        // Outra maneira de fazer

        Conta[] contas2 = new Conta[5];
        contas2[0] = new Conta();

        //matriz
        int matriz1 [] = new int [7];

        //Array Multidimensional
        int matriz2[][] = new int[5][5];


    }
}