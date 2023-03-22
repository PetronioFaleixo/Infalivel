package br.newtonpaiva.acai;

public class Acai {
    public String _tamanho;
    public Double _valor;
    public Boolean _sorvete;


    public Double MontaAcai(double tamanho, boolean Sorvete){
        Double ValorTotal = 0.0;
        if(Sorvete)
        {
            ValorTotal += 2.0;
        }
        if(tamanho == 300){
            ValorTotal += 8.0;
        }
        else if (tamanho == 500)
        {
            ValorTotal += 10.0;
        }
        else {
            ValorTotal += 12.0;
        }
        return ValorTotal;
    }
}
