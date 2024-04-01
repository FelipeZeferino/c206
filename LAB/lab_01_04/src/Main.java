public class Main {
    public static void main(String[] args) {
        Produto[] prods = new Produto[2];
        Produto c1 = new Camiseta("vermelha","GG","Camiseta básica vermelha", 59.90);
        Produto Acer = new Notebook(500,"3060ti", "i7 11400", "Acer nitro 5", 5499);
        prods[0] = Acer;
        prods[1] = c1;
        //System.out.println(prods[0].etiquetaPreco());
        //System.out.println(prods[1].etiquetaPreco());

        for (int i = 0; i < prods.length; i++) {
            if(prods[i] instanceof Camiseta) {
                System.out.println(prods[i].etiquetaPreco());
            }
            if(prods[i] instanceof Notebook) {
                System.out.println(prods[i].etiquetaPreco());
            }


        }
    }
}