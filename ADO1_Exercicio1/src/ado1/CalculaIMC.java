package ado1;

public class CalculaIMC {
    public float calcularIMC(float altura, float peso) {
        float alturaElevada = altura * altura;
        
        float imc = peso / alturaElevada;
        
        return imc;
    }
}
