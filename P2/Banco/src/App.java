
import java.util.Scanner;

public class App {
    
   
   
    public static void main(String[] args) throws Exception {
    ContaBanco jose = new ContaBanco(123456);
    Scanner s = new Scanner(System.in);
    int loop = 1;
    while(loop>0){
        System.out.println("Insira a Operação:");
        int op  = s.nextInt();
        
        if(op==1){
            System.out.println("Insira o valor");
            float val = s.nextFloat();
            jose.depositar(val);
            
        }
        if(op==2){
            System.out.println("Insira o valor");
            float val = s.nextFloat();
            jose.sacar(val);

        }
        if(op==3){
            System.out.println("Seu saldo é: "+jose.saldo);

        }
        loop = op;
        }


    }


    



    }

