import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TradeTicketListener implements ActionListener {
    private JButton resolveButton;
    private JButton closeButton;

    public TradeTicketListener(JButton resolveButton, JButton closeButton) {
        this.resolveButton = resolveButton;
        this.closeButton = closeButton;
        addListeners();
    }

    private void addListeners() {
        resolveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleResolve();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClose();
            }
        });
    }

    private void handleResolve() {
        // Logic to resolve the trade ticket
        JOptionPane.showMessageDialog(null, "Trade ticket resolved.");
    }

    private void handleClose() {
        // Logic to close the trade ticket
        JOptionPane.showMessageDialog(null, "Trade ticket closed.");
    }
}