import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICtoF extends JFrame implements ActionListener {
    private Container pane;
    private JButton FtoC, CtoF;
    private JLabel result;
    private JTextField t;
    private JCheckBox c;

    public GUICtoF() {
        this.setTitle("Fahrenheit and Celsius Converter");
        this.setSize(600,400);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
   	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	FtoC = new JButton("Convert Fahrenheit to Celsius");
	CtoF = new JButton("Convert Celsius to Fahrenheit");
	t = new JTextField(10);
	result = new JLabel("",null,JLabel.CENTER);

	FtoC.setActionCommand("FtoC");
	FtoC.addActionListener(this);
	CtoF.setActionCommand("CtoF");
	CtoF.addActionListener(this);

	pane.add(t);
	pane.add(FtoC);
	pane.add(CtoF);
	pane.add(result);
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("FtoC")){
		String s = t.getText();
		int n = Integer.parseInt(s);
		double r = n;
		r = (r-32)*5/9;
		result.setText(""+r);
	}
	    
	if (action.equals("CtoF")){
	    String s = t.getText();
	    int n = Integer.parseInt(s);
	    double r = n;
	    r = r * 9/5 + 32;
	    result.setText(""+r);		  
	}
    }
	    
		

    public static void main(String[] args) {
        GUICtoF g = new GUICtoF();
        g.setVisible(true);
    }
}

