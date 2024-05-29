package ex1;

import javax.swing.*;
import java.awt.*;

public class CalcularHoras extends JFrame {
    // Objetos 
    JLabel formularioTitulo, descricaoLabel, nomeLabel, idadeLabel, empregadoLabel, tempoEmpregadoLabel, linguagemPrincipalLabel;
    JTextField campoNome;
    
    JComboBox<String> idade;
    String idadeArray[] = {"15 - 18", "18 - 25", "25 - 30", "30 - 35", "35 - 40", "40+"};

    JComboBox<String> empregado;
    String empregadoArray[] = {"Sim", "Não"};

    JComboBox<String> tempoEmpregado;
    String tempoArray[] = {"0", "1-3", "3-6", "6-9", "10 - 15", "15 - 20", "20+"};
    
    JList<String> linguagens;
    String linguagemArray[] = {"JavaScript", "Python", "Java", "C#", "C", "C++", "Ruby", "PHP", "Swift", "Kotlin", "Go", "Rust", "TypeScript", "Scala", "Perl"};
    
    JButton cadastrar;

    public CalcularHoras() {
        // Configurações da Janela
        super("Formulário");
        Container tela = getContentPane();
        setLayout(null);
        setSize(600, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando texto do Jlabel 
        formularioTitulo = new JLabel("Formulário");
        descricaoLabel = new JLabel("Responda as perguntas:");
        nomeLabel = new JLabel("Nome:");
        idadeLabel = new JLabel("Idade:");
        empregadoLabel = new JLabel("Está trabalhando:");
        tempoEmpregadoLabel = new JLabel("Quanto tempo está trabalhando:");
        linguagemPrincipalLabel = new JLabel("Sua linguagem de programação principal:");

        // Criando os JComboBox
        idade = new JComboBox<>(idadeArray);
        empregado = new JComboBox<>(empregadoArray);
        tempoEmpregado = new JComboBox<>(tempoArray);
        linguagens = new JList<>(linguagemArray);

        // Criando o JTextField
        campoNome = new JTextField();

        // Criando o botão 
        cadastrar = new JButton("Cadastrar");

        // Adicionando JList ao JScrollPane
        JScrollPane painelRolagem = new JScrollPane(linguagens);
        painelRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painelRolagem.setBounds(20, 220, 250, 100);  // Ajustei o tamanho para incluir a JList inteira
        
        // Posicionando
        formularioTitulo.setBounds(250, 10, 100, 20);
        descricaoLabel.setBounds(20, 40, 200, 20);
        nomeLabel.setBounds(20, 70, 100, 20);
        campoNome.setBounds(80, 70, 200, 20);
        idadeLabel.setBounds(20, 100, 100, 20);
        idade.setBounds(80, 100, 100, 20);
        empregadoLabel.setBounds(20, 130, 150, 20);
        empregado.setBounds(160, 130, 100, 20);
        tempoEmpregadoLabel.setBounds(20, 160, 240, 20);
        tempoEmpregado.setBounds(260, 160, 100, 20);
        linguagemPrincipalLabel.setBounds(20, 190, 320, 20);
        cadastrar.setBounds(250, 330, 130, 30);        

        // Adicionando na tela
        tela.add(formularioTitulo);
        tela.add(descricaoLabel);
        tela.add(nomeLabel);
        tela.add(campoNome);
        tela.add(painelRolagem); // Adiciona o JScrollPane, que contém a JList
        tela.add(idadeLabel);
        tela.add(idade);
        tela.add(empregadoLabel);
        tela.add(empregado);
        tela.add(tempoEmpregadoLabel);
        tela.add(tempoEmpregado);
        tela.add(linguagemPrincipalLabel);
        tela.add(cadastrar);

        setVisible(true);
    }
    
    public static void main(String[] args) {
        CalcularHoras app = new CalcularHoras();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
