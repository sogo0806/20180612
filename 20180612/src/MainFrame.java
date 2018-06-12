import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JButton jbt = new JButton("轉換");
    private JButton jbt2 = new JButton("EXIT");
    private JLabel jlb = new JLabel();
    private TextField text = new TextField();
    public MainFrame () {
        init();
    }
    private void init() {
        this.setBounds(50,50,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        jbt.setBounds(100,50,80,50);
        jbt2.setBounds(100,200,80,50);
        jlb.setBounds(200,50,80,50);
        text.setBounds(30,50,80,50);

        this.add(jbt);
        this.add(jbt2);
        this.add(jlb);
        this.add(text);

        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int data [] = new int[5];
                try {
                    for (int i = 0 ; i < 5 ; i++){
                    }
                    float v1 = Float.parseFloat(text.getText());
                    float v2 =  v1 / 0.62137f ;
                    jlb.setText(Float.toString(v2));
                }catch (ArrayIndexOutOfBoundsException e1){
                    JOptionPane.showMessageDialog(MainFrame.this,"erroe");
                }catch (Exception e2){
                    JOptionPane.showMessageDialog(MainFrame.this,"error");
                }

            }
        });

        jbt2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

