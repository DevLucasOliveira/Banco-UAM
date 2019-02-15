package classes;

public class Conta {
    
    /*   
============ALUNOS===========
Lucas Rodrigues – RA: 21069949
Danilo Ferrari – RA: 21086355
Lucas Oliveira – RA: 21094755
Manoel Merlin – RA: 21154353
=============================
*/
    
    //Atributos
    private int numero;
    private double saldo;
    private Cliente cliente;
    //Métodos
        public Conta(int numero) {
            this.numero = numero;
            this.cliente = new Cliente();
        }
    public Conta (){
        
    }

    public void depositar(double quantia){
          this.saldo += quantia;
            System.out.println(getSaldo());
        
    }
    
    public String imprimir(){
            
        System.out.println("Imprimir "+getNumero());
        return  cliente.imprimir()
                +"Número da conta: "+getNumero()+"\n"
                +"Saldo: "+getSaldo();
    }
    
    public boolean sacar(double quantia){

        if(quantia<=this.getSaldo()){
            this.setSaldo(this.getSaldo()-quantia);
            return true;
        }else{
            return false;
         }
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
        
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
