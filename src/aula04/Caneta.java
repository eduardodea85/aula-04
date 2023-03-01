
package aula04;


public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    //Codigo fonte -> inserir codico... Tem todos os codigos prontos
    
    public Caneta(String m, String c, float p){ // Este é o método construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
        //this.cor = "Azul";
    }
    
    public String getModelo(){
        return modelo;        
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public Float getPonta(){
        return ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a Caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }    
}
