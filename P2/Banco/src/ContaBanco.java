public class ContaBanco {
    public int numConta;
    public float saldo;

    public ContaBanco( int numConta){   
        this.numConta = numConta;
        this.saldo = 0;

    }
    public void sacar(float valSaque){
        if (this.saldo>=valSaque){
            this.saldo-=valSaque;
        }
        else{
            System.out.println("Não há dinheiro");
        }
    }

    public void depositar(float saldo) {
        
        this.saldo += saldo;
        System.out.println("Está depositado!");
        
    }

    public void verSaldo(){
        System.out.println(saldo);



    }





}