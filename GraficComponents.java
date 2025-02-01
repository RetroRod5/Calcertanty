import java.awt.Label;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraficComponents {

   private static Label instructionComponentA() {
      Label label = new Label("Bem vindo ao Calcertanty!");
      label.setBounds(30, 30, 480, 30);
      return label;
   }

   private static Label instructionComponentB() {
      Label label = new Label("Indica o número de variáveis e as suas incertezas," + 
                              " a formula da variável");
      label.setBounds(30, 50, 480, 30);
      return label;
   }

   private static Label instructionComponentC() {
      Label label = new Label("a calcular e clique para obter o resultado com a incerteza associada.");
      label.setBounds(30, 70, 480, 30);
      return label;
   }


   private static TextField formulaeComponent() {
      TextField textField = new TextField();
      textField.setBounds(30, 100, 360, 30);
      return textField;
   }

   private static Choice variableChoice() {
      Choice choice = new Choice();
      choice.setBounds(30, 130, 60, 30);
      choice.add("1");
      choice.add("2");
      choice.add("3");

      return choice;
   }

   public static void addComponents(WindowManager manager) {
      manager.add( formulaeComponent() );
      manager.add( instructionComponentA() );
      manager.add( instructionComponentB() );
      manager.add( instructionComponentC() );
      manager.add( variableChoice() );
   }
}
