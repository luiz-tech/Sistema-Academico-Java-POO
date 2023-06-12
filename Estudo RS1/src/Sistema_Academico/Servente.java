package Sistema_Academico;
import javax.swing.JOptionPane;
public class Servente extends Empregado
{

    @Override
    public double ExibirSalario() 
    {
        if( hTrab >200 && hTrab <250)
        return (3000*0.2)+3000 ;
        
        else if (hTrab >250 && hTrab <300)
            return (4000*0.2) +4000 ;
         else
            return (5000*0.2) + 5000;
    }
    
}
