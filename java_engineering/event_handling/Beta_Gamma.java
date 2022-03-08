import java.awt.event.*;
import javax.swing.*;
public class Beta_Gamma
{
Beta_Gamma()
{
    JFrame f=new JFrame("Beta_Gamma Button Example");
    final JTextField tf=new JTextField();
    tf.setBounds(50,50, 150,20);
    JButton b1=new JButton("Beta");
    b1.setBounds(50,100,95,30);
    b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    tf.setText("Beta was pressed");
    }
    });
    JButton b2=new JButton("Gamma");
    b2.setBounds(50,150,95,30); 
    b2.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    tf.setText("Gamma was pressed");
    }
    });
    f.add(tf);
    f.add(b1);
    f.add(b2);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
    new Beta_Gamma();
}
}