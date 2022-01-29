import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtmark1;
    private JButton calButton;
    private JTextField txtstname;
    private JTextField txtmark2;
    private JTextField txtmark3;
    private JTextField txttotal;
    private JTextField txtavg;
    private JTextField txtgrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,total;
                double avg;


                m1=Integer.parseInt(txtmark1.getText());
                m2=Integer.parseInt(txtmark2.getText());
                m3=Integer.parseInt(txtmark3.getText());

                total=m1+m2+m3;

                txttotal.setText(String.valueOf(total));
                avg=total/3;

                txtavg.setText(String.valueOf(avg));

                if(avg>40)
                {
                    txtgrade.setText("Pass");
                }
                else
                {
                    txtgrade.setText("Fail");
                }

            }
        });
    }
}
