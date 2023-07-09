import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Umschalten {
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View(m);
        Controller c = new Controller(m, v);

        JFrame frame = new JFrame("Umschalten");
        frame.setContentPane(v);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
class Model extends Observable {
    private boolean active;

    public Model() {
        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }

    public void toggleActive() {
        active = !active;
        setChanged();
        notifyObservers();
    }
}
class View extends JPanel implements Observer {
    private Model model;
    private JButton leftButton;
    private JButton rightButton;

    public View(Model model) {
        this.model = model;
        model.addObserver(this);

        setLayout(new FlowLayout());

        leftButton = new JButton("Links");
        rightButton = new JButton("Rechts");
        rightButton.setEnabled(false);

        add(leftButton);
        add(rightButton);

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.toggleActive();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.toggleActive();
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
        boolean isActive = model.isActive();
        leftButton.setEnabled(!isActive);
        rightButton.setEnabled(isActive);
    }
};
class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}