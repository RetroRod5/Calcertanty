import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowManager extends Frame implements WindowListener {
   public WindowManager() {
      Frame frame = new Frame();
      this.setTitle("Calcertanty");
      this.setSize(640, 480);
      this.setResizable(false);
      this.setLayout(null);

      addWindowListener(this);
   }

   public void reveal() {
   this.setVisible(true);
   }

   public void windowActivated(WindowEvent e) {}  

   public void windowClosed(WindowEvent e) {} 

   public void windowClosing(WindowEvent e) {    
    dispose();
   }

   public void windowDeactivated(WindowEvent e) {}   

   public void windowDeiconified(WindowEvent e) {}    

   public void windowIconified(WindowEvent e) {}  

   public void windowOpened(WindowEvent arg0) {}

}