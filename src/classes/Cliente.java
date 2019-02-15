package classes;

public class Cliente {
    
/*   
============ALUNOS===========
Lucas Rodrigues – RA: 21069949
Danilo Ferrari – RA: 21086355
Lucas Oliveira – RA: 21094755
Manoel Merlin – RA: 21154353
=============================
*/
    
    //Atributos
    
    private String cpf,nome,endereco,telefone;

    
    //Construtor ---------------------------------------------------------------
        public Cliente(String cpf, String nome, String endereco, String telefone) {
            this.cpf = cpf;
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            
        }
    //--------------------------------------------------------------------------
        public Cliente () {
            
        }
    /**
     * Imprime os dados do cliente.
     * @return 
     */
        
    public String imprimir(){
        
         return   "• Nome: "+this.getNome()+"\n"
                +"CPF: "+this.getCpf()+"\n"
                +"Endereco: "+this.getEndereco()+"\n"
                +"Telefone: "+this.getTelefone()+"\n";
    }

    //Getters e Setters
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}