


import javax.swing.JFrame;
public class frame extends JFrame{
    frame(){
        this.setTitle("sanke");
        this.add(new panel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();

    }
}