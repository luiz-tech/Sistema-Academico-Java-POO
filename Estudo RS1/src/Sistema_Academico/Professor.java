
package Sistema_Academico;

import javax.swing.JOptionPane;

public class Professor extends Empregado
{
    private String matr;
    private float salM;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public float getSalM() {
        return salM;
    }

    public void setSalM(float salM) {
        this.salM = salM;
    }
    
    public Professor ()
    {
        matr = JOptionPane.showInputDialog("Insira a maticula:");
    }

    @Override
    public double ExibirSalario() 
    
    {
        if( hTrab >200 && hTrab <250)
        return (3000*0.05)-3000 ;
        
        else if (hTrab >250 && hTrab <300)
            return (4000*0.05)-4000 ;
         else
            return (5000*0.05)-5000;
    }
}
