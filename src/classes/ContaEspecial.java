package classes;

public class ContaEspecial extends Conta{
    
    /*   
============ALUNOS===========
Lucas Rodrigues – RA: 21069949
Danilo Ferrari – RA: 21086355
Lucas Oliveira – RA: 21094755
Manoel Merlin – RA: 21154353
=============================
*/
    
    //Atributos
    
    private double limite = 500;

    
    /**
     * Imprime os dados da conta.
     * @return 
     */
    @Override
    public String imprimir(){
        if(this.getSaldo()>=0){
            this.setLimite(500);
        }
        return  super.imprimir() + "\nLimite: "+this.getLimite();
                
    }
    
    @Override
        public boolean sacar(double quantia){
        if(quantia<=this.getSaldo()){
            setSaldo(this.getSaldo()-quantia);
            return true;
        }
        else{
          if(getSaldo()>=0){  
            if(quantia<=(getSaldo()+this.limite)){
                setLimite((this.limite-quantia)+getSaldo());
                setSaldo(getSaldo()-quantia);
                return true;
            } 
          }else{
             if(quantia<=this.limite){
                setLimite((this.limite-quantia));
                setSaldo(getSaldo()-quantia);
                return true;
            }
          }
          return false;
        }
          }
        

      
    
    //Construtor -------------------------------
        public ContaEspecial(int numero) {
            super.setNumero(numero);
            super.setCliente(new Cliente());
        }
        
        public ContaEspecial (){
        }
    //------------------------------------------

    //Getters e Setters
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
