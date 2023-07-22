package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/216242_home_icon.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Buscar CEP");
			lblNewLabel.setBounds(45, 28, 347, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("@ Author Lucas R. Farias");
			lblNewLabel_1.setBounds(45, 64, 237, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("WEB Service:");
			lblNewLabel_2.setBounds(45, 89, 98, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblWebServices = new JLabel("republicavirtual.com.br");
			lblWebServices.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					link("https://www.republicavirtual.com.br");
				}
			});
			lblWebServices.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblWebServices.setForeground(SystemColor.textHighlight);
			lblWebServices.setBounds(153, 89, 150, 14);
			getContentPane().add(lblWebServices);
		}
		{
			JButton btnYoutube = new JButton("");
			btnYoutube.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					link("https://www.youtube.com/playlist?list=PLbEOwbQR9lqxVuDWNIrG57_JGcbIL3FWP");
				}
			});
			btnYoutube.setBackground(SystemColor.control);
			btnYoutube.setForeground(SystemColor.control);
			btnYoutube.setIcon(new ImageIcon(Sobre.class.getResource("/img/4375133_logo_youtube_icon.png")));
			btnYoutube.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnYoutube.setBorder(null);
			btnYoutube.setBounds(81, 180, 62, 37);
			getContentPane().add(btnYoutube);
		}
		{
			JButton btnGitHub = new JButton("");
			btnGitHub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					link("https://github.com/Fariaslr");
				}
			});
			btnGitHub.setBackground(SystemColor.control);
			btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/211904_social_github_icon (1).png")));
			btnGitHub.setBorder(null);
			btnGitHub.setBounds(21, 168, 62, 49);
			getContentPane().add(btnGitHub);
		}

	}

	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
