package firstTier;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

// TODO: Auto-generated Javadoc
/**
 * The Class TestDialog.
 */
public class TestDialog extends JDialog {

	/** The content panel. */
	private final JPanel contentPanel = new JPanel();
	
	/** The text field. */
	private JTextField textField;
	
	/** The text field_1. */
	private JTextField textField_1;
	
	/** The text field_2. */
	private JTextField textField_2;
	
	/** The text field_3. */
	private JTextField textField_3;
	
	/** The text field_4. */
	private JTextField textField_4;
	
	/** The text field_5. */
	private JTextField textField_5;
	
	/** The text field_6. */
	private JTextField textField_6;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			TestDialog dialog = new TestDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TestDialog() {
		setTitle("Add new smartphone");
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 36, 86, 20);
		contentPanel.add(textField);
		
		JLabel label = new JLabel("Brand");
		label.setBounds(10, 11, 46, 14);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Model Number");
		label_1.setBounds(10, 92, 86, 14);
		contentPanel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 117, 86, 20);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 199, 86, 20);
		contentPanel.add(textField_2);
		
		JLabel label_2 = new JLabel("Price");
		label_2.setBounds(10, 174, 46, 14);
		contentPanel.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(121, 199, 86, 20);
		contentPanel.add(textField_3);
		
		JLabel label_3 = new JLabel("Year Of Release");
		label_3.setBounds(121, 174, 86, 14);
		contentPanel.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(121, 117, 86, 20);
		contentPanel.add(textField_4);
		
		JLabel label_4 = new JLabel("Operating System");
		label_4.setBounds(121, 92, 86, 14);
		contentPanel.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(121, 36, 86, 20);
		contentPanel.add(textField_5);
		
		JLabel label_5 = new JLabel("Model");
		label_5.setBounds(121, 11, 46, 14);
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("Stock Remaining");
		label_6.setBounds(240, 11, 86, 14);
		contentPanel.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(240, 36, 86, 20);
		contentPanel.add(textField_6);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
