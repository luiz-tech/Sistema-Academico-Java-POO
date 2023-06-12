package Sistema_Academico;
import javax.swing.JOptionPane;

public class Aluno extends Pessoa 
{
    private String mat;
    private int cargH;
    private String curso;

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public int getCargH() {
        return cargH;
    }

    public void setCargH(int cargH) {
        this.cargH = cargH;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public Aluno ()
    {
        mat = JOptionPane.showInputDialog("Insira a Matricula:");
        cargH = Integer.parseInt(JOptionPane.showInputDialog("Insira a carga horária:"));
        curso = JOptionPane.showInputDialog("Insira o curso:");
    }
    
    public String AlterarMatricula()
    {
        String nmat = JOptionPane.showInputDialog("Insira a nova matrícula do aluno :");
        mat = nmat;
        return nmat;
    }
}

