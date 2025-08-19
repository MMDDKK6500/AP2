package ado1;

public class CalculaIMC {
    
    String nome;
    float peso, altura, imc;
    
    public float calcularIMC() {
        float alturaElevada = altura * altura;
        
        imc = peso / alturaElevada;
        
        return imc;
    }
    
    public String categorizarIMC() {
        if (imc < 18.5f) {
            return "Classificado como baixo peso.";
        } else if (imc < 24.9f) {
            return "Classificado como peso adequado.";
        } else if (imc < 29.9f) {
            return "Classificado como sobrepeso.";
        } else  {
            return "Classificado como obesidade.";
        }
    }
}
