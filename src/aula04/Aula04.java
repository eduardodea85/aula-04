
package aula04;


public class Aula04 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Amarela", 0.4f);
        c1.status();
        Caneta c2 = new Caneta("Dea", "Roxa", 0.10f);
        c2.status();
        //c1.setModelo("Bic"); //aqui é o metodo acessor;
        //c1.modelo = "Bib"; //aceito porque é metodo publico. aqui é o método do acessando diretamente pelo atributo
        
        //c1.setPonta(0.5f);
        //c1.ponta = 0.5f;   ERRO porque é método privado
        //c1.status();
        
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
    
}
