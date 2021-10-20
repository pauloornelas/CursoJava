package cursojava.TelasEscola;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;


public class TelaInicialEscola extends JDialog{
	
	JPanel jPanel = new JPanel(new GridBagLayout());
	
	JButton vaiCadastro = new JButton("Cadastro de Alunos");
	JButton consultaCadastro = new JButton("Consolta Cadastro de Alunos");
	JButton cadastraMateria = new JButton("Cadastro de matérias");
	JButton fechar = new JButton("Fechar Programa");
	
	public TelaInicialEscola() {
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		
		setTitle("Tela Inicial da Escola");
		setSize(new Dimension(600 , 600));
		setLocationRelativeTo(null);
		setResizable(false);
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = new GridBagConstraints().WEST;
		gridBagConstraints.insets = new Insets(5, 25, 5, 5);
		
		vaiCadastro.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(vaiCadastro , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		consultaCadastro.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(consultaCadastro , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		cadastraMateria.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(cadastraMateria , gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		fechar.setPreferredSize(new Dimension(200 , 25));
		jPanel.add(fechar , gridBagConstraints);
		
		vaiCadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				CadastroNewAluno cadastroNewAluno = new CadastroNewAluno();
				setVisible(false);
		        dispose();
		        hide();
				
				
			}
		});
		
		fechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}

}
