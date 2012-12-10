import java.awt.EventQueue;

import javax.swing.JFrame;


public class MainView {

	private JFrame frmHuffmanAssignmentGui;

	/**
	 * Launch the view.
	 */
	public void initView() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
					window.frmHuffmanAssignmentGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainView() {
		frmHuffmanAssignmentGui = new JFrame();
		frmHuffmanAssignmentGui.setTitle("Huffman Assignment GUI");
		frmHuffmanAssignmentGui.setBounds(100, 100, 450, 300);
		frmHuffmanAssignmentGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHuffmanAssignmentGui.getContentPane().setLayout(null);
	}
}
