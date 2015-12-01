
import javax.swing.JOptionPane;


public class UsandoString {

    public static void main(String[] args) {
        //ENTRADA
        
        String Nome = JOptionPane.showInputDialog(null,"Digite seu nome: ");
        int Idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade: "));
        
        String sobreno = "Braga";
        String endereco = new String ("Rua coronel");
        
        //PROCESSAMENTO
        
        
        //SAIDA
        
        System.out.println(Nome.toUpperCase().concat(sobreno));
    }
    
}
