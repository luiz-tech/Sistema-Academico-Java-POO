package Sistema_Academico;
import javax.swing.JOptionPane;
public class Teste_Pessoa 
{
    public static void main(String[] args)
    {
        String resp = JOptionPane.showInputDialog("Insira A para aluno ou E para Empreegado :");
        if (resp.equalsIgnoreCase("E"))
        {
          String empg = JOptionPane.showInputDialog("Insira P para Professor ou S para Servente :");
          if (empg.equalsIgnoreCase("P"))
          {
              Professor objP = new Professor();
              JOptionPane.showMessageDialog(null,"O salário do professor é :"+objP.ExibirSalario());
          }
          else if (empg.equalsIgnoreCase("S"))
          {
              Servente objS = new Servente();
              JOptionPane.showMessageDialog(null,"O salário do professor é :"+objS.ExibirSalario());
          }     
        }   
          else if (resp.equalsIgnoreCase("A"))
          {
              Aluno objA = new Aluno();
              JOptionPane.showMessageDialog(null,"A nova matrícula do aluno é :"+objA.AlterarMatricula());
          }
    } 
}
