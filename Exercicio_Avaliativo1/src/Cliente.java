public class Cliente {
    String nome;
    long cpf;

    float CalculaTotalCompra(boolean[] carrinho){
        float valorTotal = 0;

        for (int i = 0; i < carrinho.length; i++) {
            if(carrinho[i]){
                if(i == 0){
                    valorTotal += 3300;
                }
                if(i == 1){
                    valorTotal += 8800;
                }
                if(i == 2){
                    valorTotal += 4800;
                }
            }
        }
    return valorTotal;
    }
}
