package view; /**
 * Created by Ahmed Elsayed on 14/11/2014.
*/

import com.alee.laf.WebLookAndFeel;

import javax.swing.*;
import java.awt.*;


public class View extends JFrame{

    JLabel fnamelabel,snamelabel,agelabel,salarylabel,genderlabel,marriage,children;
    JTextField fnametext,snametext,agetext, salarytext,gendertext,marriagefield,childrenfield;
    JRadioButton male,female;

    public View()
    {
        super("Validation Form");
        add(labelandfieldpanel(),BorderLayout.CENTER);
        add(Submit(),BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        try {UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");}catch(Exception e) {}
    }


    public JPanel LabelPanel()
    {
    JPanel labelPanel=new JPanel();
    labelPanel.setLayout(new GridLayout(7,1));
    fnamelabel=new JLabel("FirstName");
    snamelabel=new JLabel("SurName");
    agelabel=new JLabel("Age");
    salarylabel=new JLabel("Salary (Per Annum)");
    genderlabel=new JLabel("Gender");
    marriage=new JLabel("Marriage");
    children=new JLabel("No. of Children");
    labelPanel.add(fnamelabel);
    labelPanel.add(snamelabel);
    labelPanel.add(agelabel);
    labelPanel.add(salarylabel);
    labelPanel.add(genderlabel);
    labelPanel.add(marriage);
    labelPanel.add(children);
    return labelPanel;
    }

    public JPanel fieldPanel()
    {
     JPanel fieldpanel=new JPanel();
     JPanel genderPanel=new JPanel();
     fieldpanel.setLayout(new GridLayout(7,1));
     fnametext=new JTextField();
     snametext=new JTextField();
     agetext=new JTextField();
     salarytext=new JTextField();
     gendertext=new JTextField();
     fieldpanel.add(fnametext);
     fieldpanel.add(snametext);
     fieldpanel.add(agetext);
     fieldpanel.add(salarytext);
     genderPanel.setLayout(new FlowLayout());
     ButtonGroup bg=new ButtonGroup();
     male=new JRadioButton("Male",false);
     female=new JRadioButton("Female",false);
     bg.add(male);
     bg.add(female);
     genderPanel.add(male);
     genderPanel.add(female);
     fieldpanel.add(genderPanel);
     marriagefield=new JTextField();
     childrenfield=new JTextField();
     fieldpanel.add(marriagefield);
     fieldpanel.add(childrenfield);
     return fieldpanel;
    }

    public JPanel labelandfieldpanel()
    {
        JPanel labelandfieldpanel=new JPanel();
        labelandfieldpanel.setLayout(new GridLayout(0, 2));
        labelandfieldpanel.add(LabelPanel());
        labelandfieldpanel.add(fieldPanel());
        return labelandfieldpanel;
    }


    public JButton Submit()
    {
       return new JButton("Sumbit Loan Application");
    }



    public static void main(String[] args)
    {
       new View().setVisible(true);
    }
}
