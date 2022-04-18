import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JToolTip;

public class Class_1 extends JFrame implements ActionListener{
	
	private JButton btnNew;
	private JButton btnopen;
	private JButton btnexit;
	private JButton btnsave;
	private ImageIcon newIcon;
	private ImageIcon newOpen;
	private ImageIcon newSave;
	private ImageIcon newExit;
	private Object obj;
	private JTextField tf;
	private Vector<String> vec;
	private JComboBox cb;
	public Class_1(String title) {
		setTitle(title);
		setSize(800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		
		menubar();
		setToolbar();
		
		setVisible(true);
	}
	private void menubar(){
		JMenuBar jm = new JMenuBar();
		JMenu mfile = new JMenu("파일");
		JMenuItem newfile = new JMenuItem("새파일");
		JMenuItem Open = new JMenuItem("열기");
		JMenuItem save = new JMenuItem("저장");
		JMenuItem exit = new JMenuItem("종료");

		mfile.add(newfile);
		mfile.add(Open);
		mfile.add(save);
		mfile.addSeparator();
		mfile.add(exit);

		JMenu mProject = new JMenu("Project");
		JMenuItem newOpenasd = new JMenuItem("뭔가 열기");

		mProject.add(newOpenasd);

		JMenu mhelp = new JMenu("도움말");
		JMenuItem info = new JMenuItem("프로그램 정보");

		mhelp.add(info);
		
		
		
		
		jm.add(mfile);
		jm.add(mProject);
		jm.add(mhelp);
		
		
		setJMenuBar(jm);
	}
	private void setToolbar(){
		JToolBar jt = new JToolBar();
		newIcon = new ImageIcon("images/new.png");
		newOpen = new ImageIcon("images/open.png");
		newSave = new ImageIcon("images/save.png");
		newExit = new ImageIcon("images/exit.png");
		
		
		btnNew = new JButton(newIcon);
		btnNew.addActionListener(this);
		btnopen = new JButton(newOpen);
		btnopen.addActionListener(this);
		btnsave = new JButton(newSave);
		btnsave.addActionListener(this);		
		btnexit = new JButton(newExit);
		btnexit.addActionListener(this);
		
		jt.add(btnNew);
		jt.add(btnopen);
		jt.add(btnsave);
		jt.addSeparator();
		jt.add(btnexit);
		
		jt.add(new JLabel("Search : "));
		
		tf = new JTextField(10);
		
		jt.add(tf);
		
		vec = new Vector<String>();
		vec.add("aaa");
		vec.add("bbb");
		vec.add("ccc");
		
		cb = new JComboBox<>(vec);
		
		jt.add(cb);
		
		add(jt,BorderLayout.NORTH);
	}
	public void contentPane() {
		
		

	}
	
	
	public void actionPerformed(ActionEvent e) {
		obj = e.getSource();
		if(obj == btnNew) {
			
		}
	}
	
}
