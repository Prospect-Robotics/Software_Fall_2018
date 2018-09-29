import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class DNT_Window extends JFrame{
	 /*   _____   ____    _   _  ____ _______   _______ ____  _    _  _____ _    _ 
		|  __ \ / __ \  | \ | |/ __ \__   __| |__   __/ __ \| |  | |/ ____| |  | |
		| |  | | |  | | |  \| | |  | | | |       | | | |  | | |  | | |    | |__| |
		| |  | | |  | | | . ` | |  | | | |       | | | |  | | |  | | |    |  __  |
		| |__| | |__| | | |\  | |__| | | |       | | | |__| | |__| | |____| |  | |
		|_____/ \____/  |_| \_|\____/  |_|       |_|  \____/ \____/ \_____|_|  |_|
	                                                                   
	 */

	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int width = (int) screenSize.getWidth();
	public static int height = (int) screenSize.getHeight();
	public static Dimension windowsize = new Dimension(width,height);
	public static int fps = 60;
	
	public static String label = "";
	
	public static JPanel l = new DNT_Graphics();
	static StockSalesProject s = new StockSalesProject();
	
	public DNT_Window(){
		setSize(windowsize);
		isOpaque();
		setVisible(true);
		setResizable(false);
		setTitle(label);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(l);
	}
	public static void main(String[] args) {
		s.begin();
		DNT_Window w = new DNT_Window();
	}
}
