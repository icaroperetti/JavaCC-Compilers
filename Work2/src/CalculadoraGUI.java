import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
 
public class CalculadoraGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField campo1;
	private JTextArea campo2;
	private Font font = new Font("Verdana", Font.BOLD, 26);
	private JButton calcular;
	private JLabel lblNewLabel;
 
	// configura a GUI
	public CalculadoraGUI() {
		super("Calculadora");
 
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 1));
 
		campo1 = new JTextField(15);
		campo1.setToolTipText("Digite aqui a expressão matemática.");
		campo1.setFont(font);
		campo1.setForeground(Color.BLACK);
		container.add(campo1);
 
		calcular = new JButton("Calcular");
		container.add(calcular);
 
		campo2 = new JTextArea(5, 15);
		campo2.setLineWrap(true);
		campo2.setToolTipText("Mensagens ao usuário.");
		campo2.setWrapStyleWord(true);
		campo2.setFont(font);
 
		JScrollPane scrollPane = new JScrollPane(campo2,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		container.add(scrollPane);
 
		lblNewLabel = new JLabel("Icaro Peretti e Vinicius Boneto");
		scrollPane.setColumnHeaderView(lblNewLabel);
 
		// registra tratador de eventos
		calcular.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				Calculadora parser = new Calculadora(new ByteArrayInputStream(
						campo1.getText().getBytes()));
				double ret;
				try {
					ret = parser.Start();
					campo2.setForeground(Color.BLUE);
					campo2.setText(String.valueOf(ret));
				} catch (Throwable t) {
					campo2.setForeground(Color.RED);
					campo2.setText("Erro!\n" + t.getMessage());
				}
			}
		});
		setSize(600, 600);
		setVisible(true);
	}
 
	// executa a aplicacao
	public static void main(String args[]) {
		CalculadoraGUI aplicacao = new CalculadoraGUI();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}