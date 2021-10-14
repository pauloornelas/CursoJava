package cursojava.TelasEscola;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class telaEscola extends JDialog{

	private JPanel jPanel = new JPanel(new GridBagLayout()); // Painel de componentes
	
	/*Label's e caixas de texto para a classe Pessoa*/
	private JLabel solicitaNome = new JLabel("Qual o nome do aluno?");
	private JTextField nome = new JTextField();
	private JLabel solicitaIdade = new JLabel("Qual a idade do aluno?");
	private JTextField idade = new JTextField();
	private JLabel solicitaDataNasc = new JLabel("Qual a data de nascimento do aluno?");
	private JTextField dataNasc = new JTextField();
	private JLabel solicitaRG = new JLabel("Qual o RG do aluno?");
	private JTextField rg = new JTextField();
	private JLabel solicitaCPF = new JLabel("Qual o CPF do aluno?");
	private JTextField cpf = new JTextField();
	private JLabel solicitaNomeMae = new JLabel("Qual o nome da mãe do aluno?");
	private JTextField nomeMae = new JTextField();
	private JLabel solicitaNomePai = new JLabel("Qual o nome do pai do aluno?");
	private JTextField nomePai = new JTextField();
	
	
			
	public telaEscola() {

		// Setando as configurações do painel
		setTitle("Cadastro de alunos");  //Seta o titulo do painel que será exibido
		setSize( new Dimension(600 , 600));		  //Seta o tamanho do painel que será exibido
		setLocationRelativeTo(null);			  //Seta a posição do painel no monitor
		setResizable(false);					  //Seta que o tamanho do painel exibido não pode ser alterado
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		solicitaNome.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(solicitaNome , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		nome.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(nome , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		solicitaIdade.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(solicitaIdade , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		idade.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(idade , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		solicitaDataNasc.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(solicitaDataNasc , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		dataNasc.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(dataNasc , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		solicitaRG.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(solicitaRG , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		rg.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(rg , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		solicitaCPF.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(solicitaCPF , gridBagConstraints);
				
		gridBagConstraints.gridy ++;
		cpf.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(cpf , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		solicitaNomeMae.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(solicitaNomeMae , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		nomeMae.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(nomeMae , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		solicitaNomePai.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(solicitaNomePai , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		nomePai.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(nomePai , gridBagConstraints);
		
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
		
	}

}
