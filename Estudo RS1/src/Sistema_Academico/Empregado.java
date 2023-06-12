
package Sistema_Academico;

import javax.swing.JOptionPane;

public abstract class Empregado extends Pessoa
{
    protected  int hTrab;
    protected  float salM;

    public float getSalM() {
        return salM;
    }

    public void setSalM(float salM) {
        this.salM = salM;
    }

    public int gethTrab() {
        return hTrab;
    }

    public void sethTrab(int hTrab) {
        this.hTrab = hTrab;
    }
    
    public Empregado ()
    {
     hTrab = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de hóras trabalhadas:"));
    }
    public abstract double ExibirSalario();
}
