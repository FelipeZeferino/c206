import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean[] carrinho = { false, false, false };

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Chris";
        cliente1.cpf = 32131231;

        //criando objetos Computador
        Computador Positivo = new Computador();
        Computador Acer = new Computador();
        Computador Vaio = new Computador();

        //Injetando valores nos computadores
        //Positivo
        Positivo.marca = "Positivo";
        Positivo.preco = 3300;
        Positivo.hardware[0] = new HardwareBasico();
        Positivo.hardware[0].nome = "Pentium Core i3";
        Positivo.hardware[0].capacidade = 2200;
        Positivo.hardware[1] = new HardwareBasico();
        Positivo.hardware[1].nome = "Memória Ram";
        Positivo.hardware[1].capacidade = 8;
        Positivo.hardware[2] = new HardwareBasico();
        Positivo.hardware[2].nome = "HD";
        Positivo.hardware[2].capacidade = 500;
        Positivo.sistema.nome = "Linux Ubuntu";
        Positivo.sistema.tipo = 32;
        //Criando objeto pendrive
        MemoriaUSB pendrive16 = new MemoriaUSB();
        pendrive16.capacidade = 16;
        pendrive16.nome = "Pen-drive";
        Positivo.addMemoriaUSB(pendrive16);



        //Acer
        Acer.marca = "Acer";
        Acer.preco = 8800;
        Acer.hardware[0] = new HardwareBasico();
        Acer.hardware[0].nome = "Pentium Core i5";
        Acer.hardware[0].capacidade = 3370;
        Acer.hardware[1] = new HardwareBasico();
        Acer.hardware[1].nome = "Memória Ram";
        Acer.hardware[1].capacidade = 16;
        Acer.hardware[2] = new HardwareBasico();
        Acer.hardware[2].nome = "HD";
        Acer.hardware[2].capacidade = 1000;
        Acer.sistema.nome = "Windows 8";
        Acer.sistema.tipo = 64;
        //Objeto Pendrive
        MemoriaUSB pendrive32 = new MemoriaUSB();
        pendrive32.capacidade = 32;
        pendrive32.nome = "Pen-drive";
        Acer.addMemoriaUSB(pendrive32);

        //Vaio
        Vaio.marca = "Vaio";
        Vaio.preco = 4800;
        Vaio.hardware[0] = new HardwareBasico();
        Vaio.hardware[0].nome = "Pentium Core i7";
        Vaio.hardware[0].capacidade = 4500;
        Vaio.hardware[1] = new HardwareBasico();
        Vaio.hardware[1].nome = "Memória Ram";
        Vaio.hardware[1].capacidade = 32;
        Vaio.hardware[2] = new HardwareBasico();
        Vaio.hardware[2].nome = "HD";
        Vaio.hardware[2].capacidade = 2000;
        Vaio.sistema.nome = "Windows 10";
        Vaio.sistema.tipo = 64;
        //Objeto Hd Externo
        MemoriaUSB HdExterno = new MemoriaUSB();
        HdExterno.capacidade = 1000;
        HdExterno.nome = "Hd Externo";
        Vaio.addMemoriaUSB(HdExterno);

        int resposta;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("Digite 1 para comprar a promoção 1!");
            System.out.println("Digite 2 para comprar a promoção 2!");
            System.out.println("Digite 3 para comprar a promoção 3!");
            resposta = scanner.nextInt();

            switch(resposta){
                case 1:
                    carrinho[0] = true;
                    break;
                case 2:
                    carrinho[1] = true;
                    break;
                case 3:
                    carrinho[2] = true;
                    break;
            }
        }while(resposta != 0);

        System.out.println("nome: " + cliente1.nome);
        System.out.println("CPF: " + cliente1.cpf);
        for (int i = 0; i < carrinho.length; i++) {
            if(carrinho[i]){
                if(i == 0){
                    System.out.println("Marca: " + Positivo.marca);
                    System.out.println("Preço: " + Positivo.preco);
                    System.out.println("Hardware: " + Positivo.hardware[0].nome);
                    System.out.println("Capacidade do Hardware: " + Positivo.hardware[0].capacidade);
                    System.out.println("Hardware: " + Positivo.hardware[1].nome);
                    System.out.println("Capacidade do Hardware: " + Positivo.hardware[1].capacidade);
                    System.out.println("Hardware: " + Positivo.hardware[2].nome);
                    System.out.println("Capacidade do Hardware: " + Positivo.hardware[2].capacidade);
                    System.out.println("Sistema Operacional: " + Positivo.sistema.nome);
                    System.out.println("Tipo Sistema Operacional: " + Positivo.sistema.tipo);
                }
                if(i == 1){
                    System.out.println("Marca: " + Acer.marca);
                    System.out.println("Preço: " + Acer.preco);
                    System.out.println("Hardware: " + Acer.hardware[0].nome);
                    System.out.println("Capacidade do Hardware: " + Acer.hardware[0].capacidade);
                    System.out.println("Hardware: " + Acer.hardware[1].nome);
                    System.out.println("Capacidade do Hardware: " + Acer.hardware[1].capacidade);
                    System.out.println("Hardware: " + Acer.hardware[2].nome);
                    System.out.println("Capacidade do Hardware: " + Acer.hardware[2].capacidade);
                    System.out.println("Sistema Operacional: " + Acer.sistema.nome);
                    System.out.println("Tipo Sistema Operacional: " + Acer.sistema.tipo);
                }
                if(i == 2){
                    System.out.println("Marca: " + Vaio.marca);
                    System.out.println("Preço: " + Vaio.preco);
                    System.out.println("Hardware: " + Vaio.hardware[0].nome);
                    System.out.println("Capacidade do Hardware: " + Vaio.hardware[0].capacidade);
                    System.out.println("Hardware: " + Vaio.hardware[1].nome);
                    System.out.println("Capacidade do Hardware: " + Vaio.hardware[1].capacidade);
                    System.out.println("Hardware: " + Vaio.hardware[2].nome);
                    System.out.println("Capacidade do Hardware: " + Vaio.hardware[2].capacidade);
                    System.out.println("Sistema Operacional: " + Vaio.sistema.nome);
                    System.out.println("Tipo Sistema Operacional: " + Vaio.sistema.tipo);

                }
            }
        }
        float retorno = cliente1.CalculaTotalCompra(carrinho);
        System.out.println("Valor total da compra: " + retorno);


    }
}