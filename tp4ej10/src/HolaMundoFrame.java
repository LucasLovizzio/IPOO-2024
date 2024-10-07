import javax.swing.*;
import java.awt.*;

public class HolaMundoFrame extends JFrame {

    public HolaMundoFrame() throws HeadlessException {
        add(new HolaMundoPanel());
    }
}
