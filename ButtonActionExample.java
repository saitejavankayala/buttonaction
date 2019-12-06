import java.awt.*;  
import java.awt.event.*;  
public class ButtonActionExample implements ActionListener{
TextField tf;
ButtonActionExample()
{
    Frame f=new Frame("ActionListener Example");  
    tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);
    b.addActionListener(this);
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
}
public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");
	    //ButtonActionExample ob1=new ButtonActionExample();
	    //LoginDemo ld=new LoginDemo();
	    MyLoginWindow ml=new MyLoginWindow();
    }
public static void main(String[] args) {  
ButtonActionExample ob=new ButtonActionExample();
   
}  }
