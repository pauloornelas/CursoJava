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
	
	private JLabel descricaoHora1 = new JLabel("Time thread 1!"); /*Instanciando componente do tipo comentário ou Label*/
	private JTextField mostraThread1 = new JTextField();		  /*Instancia componente do tipo caixa de texto*/
	
	private JLabel descricaoHora2 = new JLabel("Time thread 2!"); /*Instanciando componente do tipo comentário ou Label*/
	private JTextField mostraThread2 = new JTextField();		  /*Instancia componente do tipo caixa de texto*/
	
	private JButton jbuButton1 = new JButton("Start");			  /*Instacia componente do tipo Botão com a descrição "Start"*/
	private JButton jbuButton2 = new JButton("Stop");			  /*Instacia componente do tipo Botão com a descrição "Stop"*/
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			while(true) {
				mostraThread1.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	};
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			while(true) {
				
				mostraThread2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
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
		mostraThread1.setEditable(false);						 // Indica que a caixa de testo não pode ser editada
		jPanel.add(jbuButton1,gridBagConstraints);
		
		gridBagConstraints.gridx ++;
		jbuButton2.setPreferredSize(new Dimension(92,25));
		mostraThread2.setEditable(false);						 // Indica que a caixa de testo não pode ser editada
		jPanel.add(jbuButton2,gridBagConstraints);
		
		jbuButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jbuButton1.setEnabled(false);
				jbuButton2.setEnabled(true);
				
				
			}
		});
		
		jbuButton2.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time.stop();
				thread2Time.stop();
				
				mostraThread1.setText("");
				mostraThread2.setText("");
				
				jbuButton1.setEnabled(true);
				jbuButton2.setEnabled(false);
				
			}
		});
		
		jbuButton1.setEnabled(true);
		jbuButton2.setEnabled(false);
		
		add(jPanel, BorderLayout.WEST);
		/*Será sempre o último comando*/
		setVisible(true);
	}
	

}
