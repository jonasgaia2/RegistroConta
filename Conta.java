package aula02.registroconta;

import java.time.LocalDate;

public class Conta {
    
    private Integer numero;
    private double saldo;
    private LocalDate dataAbertura;
    private Cliente correntista;
    
    public Conta() {
       saldo = 250.0; 
       dataAbertura = LocalDate.now();
    }
    
    public String getDetalhes(){
        return "Numero: " + numero + " | Data de abertura: " + dataAbertura;
    }
    
    public boolean fazerDeposito(double valorDeposito){
        if (valorDeposito > 0) {
            saldo = saldo + valorDeposito;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean fazerSaque(double valorSaque){
        boolean retorno = false;
        if (saldo >= valorSaque ) {
            saldo = saldo - valorSaque;
            retorno = true;
        }
        return retorno;
    }  
    
    public Integer getNumero(){
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public LocalDate getDataAbertura(){
        return dataAbertura;
    }
    
    public void setDataAbertura(LocalDate dataAbertura){
        this.dataAbertura = dataAbertura;                
    }
    
    public Cliente getCorrentista() {
        return correntista;
    }
    
    public void setCorrentista(Cliente correntista){
        this.correntista = correntista;
    }
}
