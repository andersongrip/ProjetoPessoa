
package projetopessoas;


public class Funcionario extends Pessoa {
 
    private String setor;
    private boolean trabalhando; 

public void MudaTrabalho(){
    this.trabalhando = ! this.trabalhando;
}

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
//ESSE METODO FOI FEITO EM "INSERIR CODIGO/ TOSTRING"
    @Override
    public String toString() {
        return "Funcionario{" + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }

}
