import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class UIManager extends JFrame implements WindowListener {

   private static final int WINDOW_WIDTH = 640;
   private static final int WINDOW_HEIGHT = 480;
   private static final Color BACK_COLOR = new Color(255, 254, 235);
   private static final Color PRIMARY_COLOR = new Color(157, 90, 10);
   private static final Color SECONDARY_COLOR = new Color(122, 95, 21);
   private static final Color ACCENT_COLOR = new Color(195, 5, 5);
   private static final int MAX_VARIABLES = 5;
   
   private final JTextArea welcomeText;
   private final JLabel[] labels;
   private final JComboBox<Integer> comboBox;
   private final JTextField formulaeField;
   private final JTextField[] varNames;
   private final JTextField[] varValues;
   private final JTextField[] varUncerts;

   public UIManager() {
      // Frame specifications
      this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      this.setTitle("Calcertanty");
      this.setResizable(false);
      this.setLayout(null);
      this.getContentPane().setBackground(BACK_COLOR);
      addWindowListener(this);


      // components initialization
      labels = new JLabel[5];

      Integer[] varNums = new Integer[MAX_VARIABLES];
      for (int i = 0; i < MAX_VARIABLES; i++) {
         varNums[i] = i+1;
      }
      comboBox = new JComboBox<>(varNums);

      formulaeField = new JTextField();

      varNames = new JTextField[MAX_VARIABLES];
      varUncerts = new JTextField[MAX_VARIABLES];
      varValues = new JTextField[MAX_VARIABLES];

      // component specifications
      welcomeText = new JTextArea("Bem vindo ao Calcertanty\n"
                                + "- Por favor, insira nos campos correspondentes os dados necessários:\n"
                                + "- Fórmula da variável a calcular incerteza;\n"
                                + "- Número de variáveis medidas;\n"
                                + "- Os símbolos das variáveis medidas, os seus valores e incertezas;\n"
                                + "E depois clique em \"calcular\" ou pressione \"ENTER\".");
      welcomeText.setBackground(BACK_COLOR);
      welcomeText.setEnabled(false);
      welcomeText.setDisabledTextColor(Color.BLACK);
      welcomeText.setBounds(30, 30, 480, 110);

      labels[0] = new JLabel("Fórmula da variável a calcular:");
      labels[0].setBounds(30, 170, 360, 30); 

      labels[3] = new JLabel("R = ");
      labels[3].setBounds(30, 190, 60, 30); 
      formulaeField.setBounds(60, 190, 360, 30);

      labels[1] = new JLabel("Número de variáveis medidas:");
      labels[1].setBounds(30, 230, 360, 30);

      comboBox.setBounds(30, 250, 90, 30);

      labels[2] = new JLabel("Simbolo:   Valor:                   Incerteza: ");
      labels[2].setBounds(30, 280, 360, 30);

      for (int i = 0; i < MAX_VARIABLES; i++) {
         varNames[i] = new JTextField();
         varNames[i].setBounds(30, (310 + i * 25), 60, 30);
               
         varValues[i] = new JTextField();
         varValues[i].setBounds(90, (310 + i * 25), 120, 30);

         varUncerts[i] = new JTextField();
         varUncerts[i].setBounds(210, (310 + i * 25), 120, 30);
      }

      // action listeners
      comboBox.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Integer max =  (Integer) comboBox.getSelectedItem();
            for (int i = 0; i < MAX_VARIABLES; i++) {
               if(i < max) {
                  add(varNames[i]);
                  add(varValues[i]);
                  add(varUncerts[i]);
               } else {
                  remove(varNames[i]);
                  remove(varValues[i]);
                  remove(varUncerts[i]);
               }
            }
            revalidate();
            repaint();
         }
      });
      add(varNames[0]);
      add(varValues[0]);
      add(varUncerts[0]);
      add(labels[0]);
      add(labels[1]);
      add(labels[2]);
      add(labels[3]);
      add(welcomeText);
      add(formulaeField);
      add(comboBox);

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
