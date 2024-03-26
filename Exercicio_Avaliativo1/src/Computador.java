public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistema = new SistemaOperacional();
    HardwareBasico[] hardware = new HardwareBasico[3];
    MemoriaUSB memoria;


    void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println("Sistema Operacional: " + this.sistema);
        for (int i = 0; i < hardware.length; i++) {
            if(hardware[i] != null) {
                System.out.println("Nome da peça: " + hardware[i].nome);
                System.out.println("Capacidade da peça: " + hardware[i].capacidade);
            }}
        if(memoria != null)
            System.out.println("Memória: " + memoria);
    }
    void addMemoriaUSB(MemoriaUSB musb){
        this.memoria = musb;
    }
}
