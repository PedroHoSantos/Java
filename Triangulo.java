import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String[] args) {
        float valorA, valorB, valorC;
        valorA = Float.parseFloat(JOptionPane.showInputDialog("Lado 1: "));
        valorB = Float.parseFloat(JOptionPane.showInputDialog("Lado 2: "));
        valorC = Float.parseFloat(JOptionPane.showInputDialog("Lado 3: "));
        if ((valorA + valorB == valorC) || (valorA + valorC > valorB) || (valorB + valorC > valorA)) {
            if ((valorA == valorB) && (valorA == valorC) && (valorB == valorC)) {
                JOptionPane.showMessageDialog(null, "Equilátero", JOptionPane.INFORMATION_MESSAGE);
            }
            if ((valorA != valorB) && (valorA != valorC) && (valorB != valorC)) {
                JOptionPane.showMessageDialog(null, "Escaleno", JOptionPane.INFORMATION_MESSAGE);
            }
            if ((valorA == valorB) && (valorA != valorB) || (valorB == valorC) && (valorA != valorB)){
                JOptionPane.showMessageDialog(null, "Escaleno", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
