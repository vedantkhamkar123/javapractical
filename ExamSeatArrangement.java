import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class ExamSeatArrangement extends JFrame {
    private JPanel contentPane;
    private JTextField textField;
    private JButton btnGenerate;
    private JTextArea textArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ExamSeatArrangement frame = new ExamSeatArrangement();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ExamSeatArrangement() {
        setTitle("Exam Seat Arrangement");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);

        JLabel lblEnterNumberOf = new JLabel("Enter Number of Students:");
        panel.add(lblEnterNumberOf);

        textField = new JTextField();
        panel.add(textField);
        textField.setColumns(10);

        btnGenerate = new JButton("Generate");
        btnGenerate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateSeatArrangement();
            }
        });
        panel.add(btnGenerate);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
    }

    private void generateSeatArrangement() {
        String input = textField.getText();
        try {
            int numOfStudents = Integer.parseInt(input);
            if (numOfStudents <= 0) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number of students.");
                return;
            }

            ArrayList<Integer> seats = new ArrayList<>();
            for (int i = 1; i <= numOfStudents; i++) {
                seats.add(i);
            }
            Collections.shuffle(seats);

            StringBuilder sb = new StringBuilder();
            int row = 1;
            sb.append("Exam Seat Arrangement:\n\n");
            for (int i = 0; i < seats.size(); i++) {
                sb.append("Seat ").append(seats.get(i)).append("\t");
                if ((i + 1) % 5 == 0) {
                    sb.append("\n");
                    row++;
                }
            }
            sb.append("\nTotal Seats: ").append(seats.size());
            textArea.setText(sb.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }
}
