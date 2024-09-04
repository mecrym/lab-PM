import javax.swing.JFrame;
import javax.swing.WindowConstants;

public  class MainFrame extends JFrame {
    public void init() {
        setTitle("Welcomw");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //aq cria o metodo main ou va na app e cria um obj da classe MainFrame
    //criand o metodo main aqui:
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.init();
    }
}
