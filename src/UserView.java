
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UserView extends JFrame{

    private JLabel result;
    private JLabel result_result;
    private JButton sum;
    private JTextArea number1;
    private JTextArea number2;

    public void init(){
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel enterNumber = new JPanel();
        enterNumber.add(number2 = new JTextArea(1,5));
        enterNumber.add(number1 = new JTextArea(1,5));



        JPanel infoPanel = new JPanel();
        result = new JLabel("Result:");
        result_result = new JLabel("22222");
        infoPanel.add(result);
        infoPanel.add(result_result);


        JPanel inf_ent = new JPanel(new BorderLayout());
        inf_ent.add(infoPanel, BorderLayout.NORTH);
        inf_ent.add(enterNumber, BorderLayout.CENTER);

        JPanel entry = new JPanel();

        //entry.add(sum = new JButton("+"), BorderLayout.CENTER);



        JPanel buttons = new JPanel();
        //buttons.add(enterNumber, BorderLayout.NORTH);
        buttons.add(sum = new JButton("+"));

        JPanel mainPanel = new JPanel(new GridLayout(3,3));
        mainPanel.add(inf_ent);
        mainPanel.add(buttons);
       // mainPanel.add(entry);

        setContentPane(mainPanel);

        setVisible(true);
    }
}
