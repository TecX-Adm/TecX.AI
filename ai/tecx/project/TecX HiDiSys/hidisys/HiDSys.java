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

public class HiDiSys extends EleventhD
{
    public static void main(String[] args) //throws Exception
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