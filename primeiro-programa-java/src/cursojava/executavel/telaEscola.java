package cursojava.executavel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JDialog;
import javax.swing.JPanel;

public class telaEscola extends JDialog{

	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes

	public telaEscola() {

		// Setando as configura��es do painel
		setTitle("Adi��o de alunos");  //Seta o titulo do painel que ser� exibido
		setSize( new Dimension(600 , 600));		  //Seta o tamanho do painel que ser� exibido
		setLocationRelativeTo(null);			  //Seta a posi��o do painel no monitor
		setResizable(false);					  //Seta que o tamanho do painel exibido n�o pode ser alterado
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		
		
		
		
		setVisible(true);
		
	}

}
