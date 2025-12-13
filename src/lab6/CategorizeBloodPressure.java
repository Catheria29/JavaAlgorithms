package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CategorizeBloodPressure extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton calculateButton;
    private JLabel label1;
    private JLabel label2;
    private String result;
    private int systolic;
    private int diastolic;

    private ArrayList<BloodPressureReading> values = new ArrayList<>();

    public CategorizeBloodPressure() {
        super("Blood pressure Category Calculator");
        setLayout(new FlowLayout(FlowLayout.CENTER, 3,15));

        label1 = new JLabel("Systolic pressure (mmHg):");
        textField1 = new JTextField(12);
        add(label1);
        add(textField1);

        label2 = new JLabel("Diastolic pressure (mmHg):");
        textField2 = new JTextField(12);
        add(label2);
        add(textField2);

        calculateButton = new JButton("Calculate");
        add(calculateButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    systolic = Integer.parseInt(textField1.getText());
                    diastolic = Integer.parseInt(textField2.getText());

                    if (systolic < 0 || diastolic < 0) {
                        throw new NumberFormatException();
                    }

                    if ((systolic < 90) && (diastolic < 60)) {
                        result = "Hypotension";
                    } else if ((systolic <= 119) && (diastolic <= 79)) {
                        result = "Normal";
                    } else if ((systolic <= 139) && (diastolic <= 89)) {
                        result = "Prehypertension";
                    } else if ((systolic <= 159) && (diastolic <= 99)) {
                        result = "Hypertension stage 1";
                    } else if ((systolic >= 160) && (diastolic >= 100)) {
                        result = "Hypertension stage 2";
                    } else {
                        result = "unKnown";
                    }

                    BloodPressureReading reading = new BloodPressureReading(systolic, diastolic);

                    String firstMessage;
                    if (values.isEmpty()) {
                        firstMessage = "No previous prvious calculation found";
                    } else {
                        firstMessage = values.get(values.size() - 1).toString();
                    }
                    reading.setCategory(result);
                    values.add(reading);

                    JOptionPane.showMessageDialog(
                            null,
                            "Current result: " + result +
                                    String.format("\nPrevious result was: %s", firstMessage),
                            "Blood Pressure Result",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Invalid Input! Please enter valid numbers.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }

    public void setSystolic(int s) {
        this.systolic = s;
    }

    public void setDiastolic(int d) {

        this.diastolic = d;
    }

    public int getSystolic() {
        return this.systolic;
    }

    public int getDiastolic() {
        return this.diastolic;
    }


}

