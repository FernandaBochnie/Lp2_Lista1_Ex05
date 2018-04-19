

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    private Container cp;
    
    private JPanel pnNorte = new JPanel();
    
    private JLabel lbNota1 = new JLabel("Nota 1");
    private JLabel lbNota2 = new JLabel("Nota 2");
    private JLabel lbNota3 = new JLabel("Nota 3");
    
    private JTextField tfNota1Informada = new JTextField();
    private JTextField tfNota2Informada = new JTextField();
    private JTextField tfNota3Informada = new JTextField();
    
    private JLabel lbVazio = new JLabel();
    private JLabel lbVazio1 = new JLabel();
    private JLabel lbVazio2 = new JLabel();
    private JLabel lbVazio3 = new JLabel();
    
    private JLabel lbResultado = new JLabel("Média");
    private JLabel lbResposta = new JLabel();
    private JLabel lbMensagem = new JLabel();
    private JButton btCalcular = new JButton("Calcular");
    
    private JLabel lbsituacao = new JLabel("Situação");
    private JLabel lbMostrarSituacao = new JLabel();
    
    public GUI() {
        setSize(800, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setTitle("GUI");
        
        cp.setLayout(new BorderLayout());
        
        cp.add(pnNorte, BorderLayout.NORTH);
        
        pnNorte.setLayout(new GridLayout(5,3));
        pnNorte.add(lbNota1);
        pnNorte.add(lbNota2);
        pnNorte.add(lbNota3);
        
        pnNorte.add(tfNota1Informada);
        pnNorte.add(tfNota2Informada);
        pnNorte.add(tfNota3Informada);
        
        pnNorte.add(lbVazio1);
        pnNorte.add(btCalcular);
        pnNorte.add(lbVazio);
        
        pnNorte.add(lbResultado);
        pnNorte.add(lbVazio2);
        pnNorte.add(lbResposta);
        
        pnNorte.add(lbsituacao);
        pnNorte.add(lbVazio3);
        pnNorte.add(lbMostrarSituacao);
        
        btCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Entidade entidade = new Entidade();
                
                entidade.setNota1(Integer.valueOf(tfNota1Informada.getText()));
                entidade.setNota2(Integer.valueOf(tfNota2Informada.getText()));
                entidade.setNota3(Integer.valueOf(tfNota3Informada.getText()));
                
                lbResposta.setText(String.valueOf(entidade.getMedia()));
                lbMostrarSituacao.setText(String.valueOf(entidade.getSituacao()));
            }
        });
        setLocationRelativeTo(null);//centraliza no monitor
        setVisible(true);
    }
}
