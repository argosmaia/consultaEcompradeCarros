package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AppCarro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppCarro frame = new AppCarro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppCarro() { 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar o programa
		setBounds(100, 100, 516, 408); // tamanho da janela
		contentPane = new JPanel(); // painel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // borda

		setContentPane(contentPane); // conteudo do painel
		contentPane.setLayout(null); // layout do painel
		
		JLabel lblSistemaDeVenda = new JLabel("SISTEMA DE VENDA DE CARROS"); // titulo
		lblSistemaDeVenda.setFont(new Font("Dialog", Font.BOLD, 21)); // fonte do titulo
		lblSistemaDeVenda.setBounds(54, 0, 410, 34); // tamanho do titulo
		contentPane.add(lblSistemaDeVenda); // adicionar titulo
		
		JLabel lblLogin = new JLabel("LOGIN"); // titulo
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER); // alinhamento do titulo
		lblLogin.setFont(new Font("Dialog", Font.BOLD, 21)); // fonte do titulo
		lblLogin.setBounds(145, 59, 182, 50); // tamanho do titulo
		contentPane.add(lblLogin); // adicionar titulo
		
		JLabel lblUsurio = new JLabel("Usuário:"); // titulo
		lblUsurio.setBounds(76, 123, 83, 15); // tamanho do titulo
		contentPane.add(lblUsurio); // adicionar titulo
		
		textField = new JTextField(); // campo de texto
		textField.setBounds(177, 121, 119, 19); // tamanho do campo de texto
		contentPane.add(textField); // adicionar campo de texto
		textField.setColumns(10); // tamanho do campo de texto
		
		JLabel lblSenha = new JLabel("Senha:"); // titulo
		lblSenha.setBounds(76, 163, 70, 15); // tamanho do titulo
		contentPane.add(lblSenha); // adicionar titulo
		
		passwordField = new JPasswordField(); // campo de senha
		passwordField.setBounds(177, 161, 119, 19); //	tamanho do campo de senha
		contentPane.add(passwordField); // adicionar campo de senha
		
		JButton btnEntrar = new JButton("Entrar"); // botão
		btnEntrar.addActionListener(new ActionListener() { // ação do botão
			@SuppressWarnings("deprecation") // desabilitar a mensagem de erro
			public void actionPerformed(ActionEvent e) { // ação do botão
				if (textField.getText().equals("admin") && passwordField.getText().equals("admin")) { // se o usuário e senha estiverem corretos 
					//System.out.println("Login efetuado com sucesso!")
					JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!"); // mensagem de sucesso
					new OpcoesAppCarro().setVisible(true); // abrir a tela de opções
					dispose(); // fechar a tela de login
				} else { // se o usuário e senha estiverem incorretos
					//System.out.println("Usuário ou senha inválidos!");
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
				}
			}
		});
		btnEntrar.setBounds(191, 277, 117, 25);
		contentPane.add(btnEntrar);
		
		JRadioButton rdbtnMantermeLogado = new JRadioButton("Manter-me logado"); // botão de opção
		rdbtnMantermeLogado.setBounds(76, 194, 182, 23); // tamanho do botão de opção
		rdbtnMantermeLogado.addActionListener(new ActionListener() { // ação do botão de opção
		    public void actionPerformed(ActionEvent e) { // ação do botão de opção
		        // salvar o estado do botão em algum lugar, como um arquivo ou banco de dados
		        // por exemplo, se você estiver salvando em um arquivo, pode fazer algo como:
		        try (BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo.txt"))) {
		            String username = "admin";
		            String password = "admin";
		            String userData = username + ":" + password; // concatenando o nome de usuário e senha com o caractere :
		            writer.write(userData);
		            // criar e exibir a janela da classe Swing OpcoesAppCarro()
		            OpcoesAppCarro opcoes = new OpcoesAppCarro();
		            opcoes.setVisible(true);
		            dispose();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		contentPane.add(rdbtnMantermeLogado);
	}
}
