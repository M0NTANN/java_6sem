package View;

import javax.swing.*;
import java.awt.*;

import SmallInteger.*;

public class UserView extends JFrame{

    private JFrame frame;
    private JLabel result;
    private JLabel x;
    private JLabel y;
    private JLabel result_result;
    private JButton sum;
    private JButton sub;
    private JButton div;
    private JButton mod;
    private JTextArea number1;
    private JTextArea number2;

    public void init(){
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel enterNumber = new JPanel();
        enterNumber.add(x = new JLabel("x"));
        enterNumber.add(number2 = new JTextArea(1,5));
        enterNumber.add(x = new JLabel("y"));
        enterNumber.add(number1 = new JTextArea(1,5));



        JPanel infoPanel = new JPanel();
        result = new JLabel("Result:");
        result_result = new JLabel();
        infoPanel.add(result);
        infoPanel.add(result_result);


        JPanel inf_ent = new JPanel(new BorderLayout());
        inf_ent.add(infoPanel, BorderLayout.NORTH);
        inf_ent.add(enterNumber, BorderLayout.CENTER);

        JPanel entry = new JPanel();

        //entry.add(sum = new JButton("+"), BorderLayout.CENTER);



        JPanel buttons = new JPanel(new FlowLayout());
        //buttons.add(enterNumber, BorderLayout.NORTH);
        buttons.add(sum = new JButton("+"));
        buttons.add(sub = new JButton("-"));
        buttons.add(div = new JButton("/"));
        buttons.add(mod = new JButton("mod"));

        JPanel mainPanel = new JPanel(new GridLayout(3,3));
        mainPanel.add(inf_ent);
        mainPanel.add(buttons);
       // mainPanel.add(entry);

        setContentPane(mainPanel);

        sum.addActionListener(e -> {

                int num1 = 0, num2 = 0;
                SmallInteger xSmall, ySmall;
                String textnum2 = this.number2.getText();
                String textnum1 = this.number1.getText();
            try {
                num2 = Integer.parseInt(textnum2);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input \"x\" is not a number");
            }
            try {
                num1 = Integer.parseInt(textnum1);
            }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(frame,"Invalid input \"y\" is not a number");
        }
                ySmall = new SmallInteger(num1);
                xSmall = new SmallInteger(num2);
                result_result.setText(String.valueOf(SmallInteger.Sum(xSmall,ySmall).getVal()));


            //System.out.println(SmallInteger.SmallInteger.Sum(ySmall,ySmall).getVal());
        });

        sub.addActionListener(e -> {

            int num1 = 0, num2 = 0;
            SmallInteger xSmall, ySmall;
            String textnum2 = this.number2.getText();
            String textnum1 = this.number1.getText();
            try {
                num2 = Integer.parseInt(textnum2);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input \"x\" is not a number");
            }
            try {
                num1 = Integer.parseInt(textnum1);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input \"y\" is not a number");
            }
            ySmall = new SmallInteger(num1);
            xSmall = new SmallInteger(num2);
            result_result.setText(String.valueOf(SmallInteger.sub(xSmall,ySmall).getVal()));


            //System.out.println(SmallInteger.SmallInteger.Sum(ySmall,ySmall).getVal());
        });

        div.addActionListener(e -> {

            int num1 = 0, num2 = 0;
            SmallInteger xSmall, ySmall;
            String textnum2 = this.number2.getText();
            String textnum1 = this.number1.getText();
            try {
                num2 = Integer.parseInt(textnum2);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input \"x\" is not a number");
            }
            try {
                num1 = Integer.parseInt(textnum1);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input \"y\" is not a number");
            }
            ySmall = new SmallInteger(num1);
            xSmall = new SmallInteger(num2);
            result_result.setText(String.valueOf(SmallInteger.div(xSmall,ySmall).getVal()));


            //System.out.println(SmallInteger.SmallInteger.Sum(ySmall,ySmall).getVal());
        });

        mod.addActionListener(e -> {

            int num1 = 0, num2 = 0;
            SmallInteger xSmall, ySmall;
            String textnum2 = this.number2.getText();
            String textnum1 = this.number1.getText();
            try {
                num2 = Integer.parseInt(textnum2);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input \"x\" is not a number");
            }
            try {
                num1 = Integer.parseInt(textnum1);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input \"y\" is not a number");
            }
            ySmall = new SmallInteger(num1);
            xSmall = new SmallInteger(num2);
            result_result.setText(String.valueOf(SmallInteger.mod(xSmall,ySmall).getVal()));


            //System.out.println(SmallInteger.SmallInteger.Sum(ySmall,ySmall).getVal());
        });

        setVisible(true);
    }
}
