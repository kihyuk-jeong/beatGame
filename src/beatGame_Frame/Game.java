package beatGame_Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Game extends Thread{ //Ű���� �̺�Ʈ �����ʰ� ���� �۵��ϱ� ���� �����带 ��ӹ���
	private Image noteLineS = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();// ���м�
	private Image noteLineD = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();// ���м�
	private Image noteLineF = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();// ���м�
	private Image noteLineJ = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();// ���м�
	private Image noteLineK = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();// ���м�
	private Image noteLineL = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();// ���м�
	private Image noteLine02 = new ImageIcon(Main.class.getResource("../images/NoteLine(sample).png")).getImage();// ���м� Enterd
	private Image gameTitle = new ImageIcon(Main.class.getResource("../images/gameTitle.png")).getImage();
	private Image line = new ImageIcon(Main.class.getResource("../images/Line.png")).getImage();// ��������	
	private Image divisionLine = new ImageIcon(Main.class.getResource("../images/divisionLine.png")).getImage();
	public void screenDraw(Graphics g) {
		g.drawImage(gameTitle, 0, 660, null);
	

		// ��Ʈ�� �������� ���ΰ� �� ��Ʈ�� ������ ���м�
		g.drawImage(noteLineS, 295, 30, null);
		g.drawImage(divisionLine, 294, 30, null);
		g.drawImage(divisionLine, 394, 30, null);
		g.drawImage(noteLineD, 397, 30, null);
		g.drawImage(divisionLine, 495, 30, null);
		g.drawImage(noteLineF, 498, 30, null);
		g.drawImage(divisionLine, 598, 30, null);
		g.drawImage(noteLineJ, 602, 30, null);
		g.drawImage(divisionLine, 698, 30, null);
		g.drawImage(noteLineK, 702, 30, null);
		g.drawImage(divisionLine, 800, 30, null);
		g.drawImage(noteLineL, 804, 30, null);
		g.drawImage(divisionLine, 900, 30, null);

		g.setColor(Color.WHITE);
		g.setFont(new Font("����", Font.BOLD, 30));
		g.drawString("S", 338, 640);
		g.drawString("D", 440, 640);
		g.drawString("F", 540, 640);
		g.drawString("J", 640, 640);
		g.drawString("K", 740, 640);
		g.drawString("L", 840, 640);

		g.drawImage(line, 0, 605, null);
	}
	
	public void EnterdS() {
		noteLineS = new ImageIcon(Main.class.getResource("../images/NoteLine(sample).png")).getImage();
	}
	public void ExitedS() {
		noteLineS = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();
	}
	public void EnterdD() {
		noteLineD = new ImageIcon(Main.class.getResource("../images/NoteLine(sample).png")).getImage();
	}
	public void ExitedD() {
		noteLineD = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();
	}
	public void EnterdF() {
		noteLineF = new ImageIcon(Main.class.getResource("../images/NoteLine(sample).png")).getImage();
	}
	public void ExitedF() {
		noteLineF = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();
	}
	public void EnterdJ() {
		noteLineJ = new ImageIcon(Main.class.getResource("../images/NoteLine(sample).png")).getImage();
	}
	public void ExitedJ() {
		noteLineJ = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();
	}
	public void EnterdK() {
		noteLineK = new ImageIcon(Main.class.getResource("../images/NoteLine(sample).png")).getImage();
	}
	public void ExitedK() {
		noteLineK = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();
	}
	public void EnterdL() {
		noteLineL = new ImageIcon(Main.class.getResource("../images/NoteLine(sample).png")).getImage();
	}
	public void ExitedL() {
		noteLineL = new ImageIcon(Main.class.getResource("../images/NoteLine.png")).getImage();
	}
	@Override
	public void run() {
	
	}
	
}