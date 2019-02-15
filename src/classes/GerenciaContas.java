package classes;

import java.util.ArrayList;

public class GerenciaContas{
    
    /*   
============ALUNOS===========
Lucas Rodrigues – RA: 21069949
Danilo Ferrari – RA: 21086355
Lucas Oliveira – RA: 21094755
Manoel Merlin – RA: 21154353
=============================
*/
    
    private static ArrayList<Conta> listContas = new ArrayList();

    public void cadastrarConta(Conta conta){
        listContas.add(conta);
    }

    
    /**
     * Retorna uma String contendo todas as contas cadastradas.
     * @return 
     */
    public String listar(){
        String result="";
        if(listContas.isEmpty()){
            result += "Nenhuma conta cadastrada!\n";
        }else{
            for(Conta lista : listContas){
                System.out.println("Gerencia Contas "+lista.getNumero());
                if(lista.getClass().getSimpleName().equals("Conta")){
                    result += "===== Conta Normal =====\n";
                }else{
                    result += "===== Conta Especial =====\n";
                }
                result += lista.imprimir()+"\n \n";
            }
        }
        return result;
    }
    
    //Buscar a conta
    
    public Conta buscarConta(int numero){
        for(Conta conta : listContas){
            if(conta.getNumero()==numero){
                return conta;
            }
        }
        
        return null;
    }
    
    
    public ArrayList<Conta> getListContas() {
        return listContas;
    }

    private static void setListContas(ArrayList<Conta> listContas) {
        GerenciaContas.listContas = listContas;
    }

    
    
}