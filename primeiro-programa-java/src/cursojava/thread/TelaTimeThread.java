package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

public class TelaTimeThread  extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout());  // Painel de componentes 
	
	private JLabel descricaoHora1 = new JLabel("Nome?"); /*Instanciando componente do tipo comentário ou Label*/
	private JTextField mostraThread1 = new JTextField();		  /*Instancia componente do tipo caixa de texto*/
	
	private JLabel descricaoHora2 = new JLabel("E-mail?"); /*Instanciando componente do tipo comentário ou Label*/
	private JTextField mostraThread2 = new JTextField();		  /*Instancia componente do tipo caixa de texto*/
	
	private JButton jbuButton1 = new JButton("Add Lista");			  /*Instacia componente do tipo Botão com a descrição "Start"*/
	private JButton jbuButton2 = new JButton("Stop");			  /*Instacia componente do tipo Botão com a descrição "Stop"*/
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	public TelaTimeThread() {
		
		/*Setando as configurações da tela*/
		setTitle("Minha tela Timer com Thread");  //Seta o titulo do painel que será exibido
		setSize( new Dimension(240 , 240));		  //Seta o tamanho do painel que será exibido
		setLocationRelativeTo(null);			  //Seta a posição do painel no monitor
		setResizable(false);					  //Seta que o tamanho do painel exibido não pode ser alterado
		/*Primeira parte para a criação da tela*/
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Gerenciador de posicionamento de componentes dentro do painel
		
		gridBagConstraints.gridx = 0;	  						 // Indica em qual posição na direção x o componente vai ficar dentro do painel
		gridBagConstraints.gridy = 0;	  						 // Indica em qual posição na direção y o componente vai ficar dentro do painel
		gridBagConstraints.gridwidth = 2; 						 // Indica a quantidade de espaços que um componente vai ocupar no grid
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);	 // Indica o quanto cada componente ficará afastado um do outro
		gridBagConstraints.anchor = gridBagConstraints.WEST;	 // Indica a direção do alinhamento do componentes
		
		descricaoHora1.setPreferredSize(new Dimension(200,25));  //Seta a dimensão do Label
		jPanel.add( descricaoHora1, gridBagConstraints);		 //Adiciona o Label ao painel
		
		gridBagConstraints.gridy ++;							 //Incrementa a posição para não sobreescrever o anterior
		mostraThread1.setPreferredSize(new Dimension(200,25));	 //Seta a dimensão do Label
		jPanel.add(mostraThread1, gridBagConstraints);			 //Adiciona o Label ao painel
		
		gridBagConstraints.gridy ++;
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		gridBagConstraints.gridy ++;
		mostraThread2.setPreferredSize(new Dimension(200,25));
		jPanel.add(mostraThread2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;						 // Indica a quantidade de espaços que um componente vai ocupar no grid
		
		gridBagConstraints.gridy ++;
		jbuButton1.setPreferredSize(new Dimension(92,25));
		jPanel.add(jbuButton1,gridBagConstraints);
		
		gridBagConstraints.gridx ++;
		jbuButton2.setPreferredSize(new Dimension(92,25));			
		jPanel.add(jbuButton2,gridBagConstraints);
		
		jbuButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				ObjetoFilaThread objeto = new ObjetoFilaThread();
				
				objeto.setNome(mostraThread1.getText());
				objeto.setEmail(mostraThread2.getText());
				
				fila.add(objeto);
				
			}
		});
		
		jbuButton2.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila != null) {
					
					fila.stop();
					fila = null;
					
				}
				
			}
		});
		
		fila.start();
		
		add(jPanel, BorderLayout.WEST);
		/*Será sempre o último comando*/
		setVisible(true);
	}
	

}
