import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class UIManager extends JFrame implements WindowListener {

   private static final int WINDOW_WIDTH = 640;
   private static final int WINDOW_HEIGHT = 480;

   
   private final JTextArea welcomeText;
   private final JLabel[] labels;
   private final JComboBox<String> comboBox;
   private final JTextField formulaeField;
   private final JTextField[] varNames;
   private final JTextField[] varUncerts;

   public UIManager() {
      // Frame specifications
      this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      this.setTitle("Calcertanty");
      this.setResizable(false);
      this.setLayout(null);
      this.getContentPane().setBackground(Color.YELLOW);
      addWindowListener(this);

      // components initialization
      labels = new JLabel[5];

      String[] varNums = {"1", "2", "3", "4", "5"};
      comboBox = new JComboBox<>(varNums);

      formulaeField = new JTextField();

      varNames = new JTextField[5];
      varUncerts = new JTextField[5];

      // component specifications
      welcomeText = new JTextArea("Welcome to Calcertanty\nSet the options below to calculate uncertanty");
      welcomeText.setBackground(Color.YELLOW);
      welcomeText.setEditable(false);
      welcomeText.setEnabled(false);
      welcomeText.setBounds(30, 30, 360, 60);
      add(welcomeText);

      // render Frame
      this.setVisible(true);
   }

   public void windowActivated (WindowEvent e) {}
   public void windowDeactivated (WindowEvent e) {}
   public void windowIconified (WindowEvent e) {}
   public void windowDeiconified (WindowEvent e) {}
   public void windowClosed (WindowEvent e) {}
   public void windowClosing (WindowEvent e) {dispose();}
   public void windowOpened (WindowEvent arg0) {}

}
