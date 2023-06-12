package Sistema_Academico;
import javax.swing.JOptionPane;
public abstract class Pessoa         
{ 
    protected String RG;
    protected String CPF;
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String dtNacimento;

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDtNacimento() {
        return dtNacimento;
    }

    public void setDtNacimento(String dtNacimento) {
        this.dtNacimento = dtNacimento;
    }
    
    public Pessoa()
    { 
        RG = JOptionPane.showInputDialog("Insira o RG : ");   
        CPF = JOptionPane.showInputDialog("Insira o CPF:");
        nome = JOptionPane.showInputDialog("Insira o Nome:");
        endereco = JOptionPane.showInputDialog("Insira o endereço :");
        telefone = JOptionPane.showInputDialog("Insira o Telefone:");
        dtNacimento = JOptionPane.showInputDialog("Insira a Data de Nascimento:");
    }
    

    
}
