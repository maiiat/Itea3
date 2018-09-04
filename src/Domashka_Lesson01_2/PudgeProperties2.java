package Domashka_Lesson01_2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class PudgeProperties2 extends JFrame {


    //JPanel panel = null;
    JLabel pudge;
    JLabel space;
    JLabel firstSentense;
    JLabel secondSentense;
    JLabel thirdSentense;

    JRadioButton optionDe;
    JRadioButton optionUa;
    JRadioButton optionEn;
    GridBagConstraints gbc = new GridBagConstraints();

    String language;

    PudgeProperties2() {

        super("Swing is the BEST UI tool");

        setLayout(new GridBagLayout());

        pudge = new JLabel("Pudge");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(pudge, gbc);

        space = new JLabel("  ");
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(space, gbc);

        optionEn = new JRadioButton("EN");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(optionEn, gbc);

        optionUa = new JRadioButton("UA");
        gbc.gridx = 4;
        gbc.gridy = 2;
        add(optionUa, gbc);

        optionDe = new JRadioButton("DE");
        gbc.gridx = 6;
        gbc.gridy = 2;
        add(optionDe, gbc);

        firstSentense = new JLabel("It's a Ukrainian night, but you have to hide fat!");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 5;
        add(firstSentense, gbc);

        secondSentense = new JLabel("Hi everybody!");
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(secondSentense, gbc);

        thirdSentense = new JLabel("Happiness, health, that gave birth to the plague, that the geese rode!");
        gbc.gridx = 0;
        gbc.gridy = 7;
        add(thirdSentense, gbc);

        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initListeners();
        optionEn.setSelected(true);
    }
	
   
	private void initListeners() {
		optionDe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				optionUa.setSelected(false);
				optionEn.setSelected(false);
				language = "de";
				Locale currentLocale = new Locale(language);
				ResourceBundle message = ResourceBundle.getBundle("MessageBundle", currentLocale);
				firstSentense.setText(message.getString("firstSentense"));
				secondSentense.setText(message.getString("secondSentense"));
				thirdSentense.setText(message.getString("thirdSentense"));

			}
		});
		optionUa.addActionListener(new ActionListener() {
		       @Override
	            public void actionPerformed(ActionEvent e) {
	                optionDe.setSelected(false);
	                optionEn.setSelected(false);
	                language = "ua";
	                Locale currentLocale = new Locale(language);
	                ResourceBundle message = ResourceBundle.getBundle("MessageBundle", currentLocale);

	                byte[] f;
	                byte[] s;
	                byte[] t;

	                try {
	                    f = message.getString("firstSentense").getBytes("ISO-8859-1");
	                    firstSentense.setText(new String(f,"UTF-8"));
	                    s = message.getString("secondSentense").getBytes("ISO-8859-1");
	                    secondSentense.setText(new String(s,"UTF-8"));
	                    t= message.getString("thirdSentense").getBytes("ISO-8859-1");
	                    thirdSentense.setText(new String(t,"UTF-8"));
	                } catch (UnsupportedEncodingException e1) {
	                    e1.printStackTrace();
	                }
	            }
	        });

		optionEn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				optionDe.setSelected(false);
				optionUa.setSelected(false);
				language = "en";
				Locale currentLocale = new Locale(language);
				ResourceBundle message = ResourceBundle.getBundle("MessageBundle", currentLocale);
				firstSentense.setText(message.getString("firstSentense"));
				secondSentense.setText(message.getString("secondSentense"));
				thirdSentense.setText(message.getString("thirdSentense"));

			}
		});
	}
}
