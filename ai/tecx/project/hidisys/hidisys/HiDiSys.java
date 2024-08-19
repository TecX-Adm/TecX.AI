package hidisys;
import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.twoD.oneD.*;
import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.twoD.*;
import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.*;
import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.*;
import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.*;
import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.*;
import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.*;
import hidisys.eleventhD.tenthD.ninthD.eighthD.*;
import hidisys.eleventhD.tenthD.ninthD.*;
import hidisys.eleventhD.tenthD.*;
import hidisys.eleventhD.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class HiDiSys extends EleventhD implements Runnable
{
    HiDiSysFrame hidisysframe = new HiDiSysFrame();
    public static void main(String[] args) //throws Exception
    {
        HiDiSys hidisys=new HiDiSys(1);
        //HiDiSys hidisys=new HiDiSys(ct);
    }

    Thread t[];
    public HiDiSys()
    {
        System.out.println("HiDiSys Default Constructor.");
        //HiDiSys hidisys=new HiDiSys(1);
    }
    public HiDiSys(int dct)
    {
        t=new Thread[dct];
        
        for(int i=0;i<dct;i++)
        {
            t[i]=new Thread(this);

            t[i].start();            
        }
    }
    public void run()
    {
        System.out.println("This is Main class in HiDiSys Class.");
        int d;
        Scanner scr = new Scanner(System.in);
        do
        {
            System.out.println("Enter the value of Dimestions.");
            d =scr.nextInt();
            int dt[]=new int[d+1];
            for(int i=0;i<=d;i++)
            {
                dt[i]=0;
            }
            switch(d)
            {
                case 1:
                    double dD1[]=new double[d];
                    OneD oned = new OneD(d,dt,0,100,dD1);
                    break;
                case 2:
                    double dD2[][]=new double[d][d-1];
                    TwoD twod = new TwoD(d,dt,0,100,dD2);
                    break;
                case 3:
                    double dD3[][][]=new double[d][d-1][d-2];
                    ThreeD threed = new ThreeD(d,dt,0,100,dD3);
                    break;
                case 4:
                    double dD4[][][][]=new double[d][d-1][d-2][d-3];
                    ForthD forthd = new ForthD(d,dt,0,100,dD4);
                    break;
                case 5:
                    double dD5[][][][][]=new double[d][d-1][d-2][d-3][d-4];
                    FifthD fifthd = new FifthD(d,dt,0,100,dD5);
                    break;
                case 6:
                    double dD6[][][][][][]=new double[d][d-1][d-2][d-3][d-4][d-5];
                    SixthD sixthd = new SixthD(d,dt,0,100,dD6);
                    break;
                case 7:
                    double dD7[][][][][][][]=new double[d][d-1][d-2][d-3][d-4][d-5][d-6];
                    SeventhD seventhd = new SeventhD(d,dt,0,100,dD7);
                    break;
                case 8:
                    double dD8[][][][][][][][]=new double[d][d-1][d-2][d-3][d-4][d-5][d-6][d-7];
                    EighthD eighthd = new EighthD(d,dt,0,100,dD8);
                    break;
                case 9:
                    double dD9[][][][][][][][][]=new double[d][d-1][d-2][d-3][d-4][d-5][d-6][d-7][d-8];
                    NinthD ninthd = new NinthD(d,dt,0,100,dD9);
                    break;
                case 10:
                    double dD10[][][][][][][][][][]=new double[d][d-1][d-2][d-3][d-4][d-5][d-6][d-7][d-8][d-9];
                    TenthD tenthd = new TenthD(d,dt,0,100,dD10);
                    break;
                case 11:
                    double dD11[][][][][][][][][][][]=new double[d][d-1][d-2][d-3][d-4][d-5][d-6][d-7][d-8][d-9][d-10];
                    EleventhD eleventhd = new EleventhD(11,dt,0,100,dD11);
                    break;
                default:
                    System.out.println("Please, Enter the value between range from 1 to 11.");
                    break;
            }
        }while(true);
    }
}
public class HiDiSysFrame
{
    public HiDiSysFrame()
    {
        JFrame jframe = new JFrame("TecX's Hi-Dimentional System Console. (HiDiSys)");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setIconImage(Toolkit.getDefaultToolkit().getImage("./TecX.jpg"));
        final JPanel jpanel=new JPanel();
        //Scanner scr = new Scanner(System.in);
        // System.out.println("Enter the value of Dimestions calculation's batch.");
        //int ct=scr.nextInt();
        int ct=1;
        JButton jbutton[]=new JButton[ct];
        //JFrame jframe[] = new JFrame[ct];
        JLabel jlabel[]=new JLabel[ct];
        JMenu jmenu[] = new JMenu[ct];
        JMenuItem jmenuitem[] = new JMenuItem[ct];
        //final JPanel jpane[]=new JPanel[ct];
        JPanel jpane[]=new JPanel[ct];
        //final JPanel jpane=new JPanel(new BorderLayout(4,4));
        JPopupMenu jpopupmenu[]=new JPopupMenu[ct];
        //JScrollPane jscrollpane = new JScrollPane();
        //JScrollPane jscrollpane[] = new JScrollPane[ct];
        //jscrollpane.setBorder(new TitledBorder("JScrollPane"));
        JTextArea jtextarea[] = new JTextArea[ct];
        JTextField jtextfield[]=new JTextField[ct];
        JTextPane jtextpane[] = new JTextPane[ct];
        Popup popup[]=new Popup[ct];
        int framecount=1;
        for(int i=0;i<ct;i++)
        {
            jpanel.setBorder(new TitledBorder("HiDi Sys Console"));
            jpane[i]=new JPanel();
            //jpane[i]=new JPanel(new BorderLayout(7,4));
            jpane[i].setBorder(new TitledBorder("Menu Bar"));
            jlabel[i]=new JLabel("This HiDiSys is Venture of TecX's.");
            //jpanel.add(new JScrollBar(),BorderLayout.EAST);
            //jscrollpane.add(jlabel[i]);
            //jscrollpane.add(jpane[i]);
            jpanel.add(jlabel[i],BorderLayout.NORTH);
            jpanel.add(jpane[i],BorderLayout.SOUTH);
            jbutton[i] = new JButton("HiDiSys Launcher");
            //jbutton[i] = new JButton("Launcher");
            //jframe[i] = new JFrame("Hi-Dimentional System's Window no: "+ framecount++);
            //jframe[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //jframe[i].setIconImage(Toolkit.getDefaultToolkit().getImage("./HiDiSys.PNG"));
            jmenu[i] = new JMenu("File");
            //jscrollpane.add(jmenu[i]);
            jpane[i].add(jmenu[i],BorderLayout.WEST);
            jmenuitem[i] = new JMenuItem("New",1);
            //jmenuitem[i] = new JMenuItem("Save",2);
            jpopupmenu[i]=new JPopupMenu("Display");
            jpane[i].add(jpopupmenu[i],BorderLayout.SOUTH);
            //jpane[i].add(jpopupmenu[i]);
            jpane[i].add(jmenuitem[i],BorderLayout.WEST);
            //jpane[i].add(jmenuitem[i]);
            //jpane[i+1]=new JPanel(new BorderLayout(7,4));
            //jpane[i].add(jmenu[i]);
            //jpane[i].add(jmenuitem[i]);
            ///////////////////////jscrollpane.add(new JMenu("live"));////////////////
            //jpane[i].add(jpopupmenu[i]);
            //jpopupmenu[i]=new JPopUpMenu("New");
            ////////jscrollpane[i] = new JScrollPane();//////
            //////////////////////jpanel.add(jscrollpane);//////
            //jpane[i].add(jscrollpane[i]);
            jtextarea[i] = new JTextArea("This is JTextArea.",4,7);
            jpane[i].add(jtextarea[i],BorderLayout.WEST);
            //jpane[i].add(jtextarea[i]);
            //jtextfield[i]=new JTextField("This HiDiSys is Venture of TecX's.");
            //jpane[i].add(jtextfield[i]);
            jtextpane[i] = new JTextPane();
            //jpane[i].add(jtextpane[i]);
            //jpane[i].addActionListener(new ActionListener() {
                //jpane[i].add(jbutton[i]);
            //jpane[i].add(jlabel[i]);
            //jpanel.setBorder(new TitledBorder("HiDi Sys control panel"));
            //jpanel.add(jbutton[i],BorderLayout.SOUTH);
            //jscrollpane.add(jbutton[i]);
            jpanel.add(jbutton[i],BorderLayout.CENTER);
            jbutton[i].addActionListener(new ActionListener()
            {
                int launchcount=0;
                public void actionPerformed(ActionEvent ae)
                {
                    //jscrollpane.add(new JLabel("\nHiDi Sys has been Launched. Launch No:="+ ++launchcount),BorderLayout.WEST);
                    jpanel.add(new JLabel("\nHiDi Sys has been Launched. Launch No:="+ ++launchcount),BorderLayout.WEST);
                    //jpane[i].add(new JLabel("\nHiDi Sys has been Launched. Launch No:="+ ++launchcount));
                    jframe.validate();
                }
            });
        }
        jframe.add(new JScrollBar());
        //jframe.getContentPane().add(jscrollpane);
        jframe.getContentPane().add(jpanel);
        jframe.setSize(1800,700);
        jframe.setVisible(true);
    }
}