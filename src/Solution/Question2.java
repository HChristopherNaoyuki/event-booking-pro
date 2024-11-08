// File: Solution/Question2.java
package Solution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question2 extends JFrame
{
    private JLabel lblEventType;
    private JLabel lblTicketCount;
    private JTextField txtTicketCount;
    private JRadioButton rbtnMusical;
    private JRadioButton rbtnSportGame;
    private JTextArea txtOutput;
    private JButton btnShowBooking;
    private ButtonGroup eventGroup;

    public Question2()
    {
        // Set up a more compatible system look and feel
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            System.out.println("System look and feel not supported. Using default.");
        }

        // Set up frame
        super("Event Booking");
        setSize(555, 555);
        setResizable(false); // Makes the window size unadjustable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        // Initialize components
        lblEventType = new JLabel("Select Event Type:");
        lblTicketCount = new JLabel("Enter Number of Tickets:");
        txtTicketCount = new JTextField(10);
        rbtnMusical = new JRadioButton("Musical");
        rbtnSportGame = new JRadioButton("Sport Game");
        txtOutput = new JTextArea(8, 30);
        txtOutput.setEditable(false);
        txtOutput.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        btnShowBooking = new JButton("Show Booking");

        // Style components with a minimal aesthetic
        Font appleFont = new Font("SansSerif", Font.PLAIN, 14);
        lblEventType.setFont(appleFont);
        lblTicketCount.setFont(appleFont);
        txtTicketCount.setFont(appleFont);
        rbtnMusical.setFont(appleFont);
        rbtnSportGame.setFont(appleFont);
        txtOutput.setFont(appleFont);
        btnShowBooking.setFont(new Font("SansSerif", Font.BOLD, 14));

        // Group radio buttons
        eventGroup = new ButtonGroup();
        eventGroup.add(rbtnMusical);
        eventGroup.add(rbtnSportGame);

        // Set up layout and add components
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblEventType, gbc);

        gbc.gridx = 1;
        add(rbtnMusical, gbc);

        gbc.gridx = 2;
        add(rbtnSportGame, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblTicketCount, gbc);

        gbc.gridx = 1;
        add(txtTicketCount, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        add(btnShowBooking, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        add(new JScrollPane(txtOutput), gbc);

        // Button action listener
        btnShowBooking.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                showBooking();
            }
        });
    }

    private void showBooking()
    {
        try
        {
            // Parse ticket count input
            int ticketCount = Integer.parseInt(txtTicketCount.getText());
            String output = "";

            // Check selected event and instantiate corresponding class
            if (rbtnMusical.isSelected())
            {
                Musicals musicalEvent = new Musicals(201, "Battle of the Bands", "Thunderdome Club", "20/08/2013");
                double totalCost = musicalEvent.calculateBooking(ticketCount);
                output = "Musical Concert Booking:\n"
                       + "Ticket Number: " + musicalEvent.getTicketNumber() + "\n"
                       + "Event Date: " + musicalEvent.getEventDate() + "\n"
                       + "Event Name: " + musicalEvent.getEventName() + "\n"
                       + "Event Location: " + musicalEvent.getEventLocation() + "\n"
                       + "The Price for " + ticketCount + " tickets is R" + totalCost;
            }
            else if (rbtnSportGame.isSelected())
            {
                SportGame sportEvent = new SportGame(101, "Easter Soccer", "Crusaders Sport Club", "30/10/2013");
                double totalCost = sportEvent.calculateBooking(ticketCount);
                output = "Sports Event Booking:\n"
                       + "Ticket Number: " + sportEvent.getTicketNumber() + "\n"
                       + "Event Date: " + sportEvent.getEventDate() + "\n"
                       + "Event Name: " + sportEvent.getEventName() + "\n"
                       + "Event Location: " + sportEvent.getEventLocation() + "\n"
                       + "The Price for " + ticketCount + " tickets is R" + totalCost;
            }
            else
            {
                output = "Please select an event type.";
            }

            // Display output
            txtOutput.setText(output);
        }
        catch (NumberFormatException ex)
        {
            txtOutput.setText("Invalid input! Please enter a valid number of tickets.");
        }
    }

    public static void main(String[] args)
    {
        // Run the GUI
        Question2 frame = new Question2();
        frame.setVisible(true);
    }
}
