package hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD;

import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.*;

public class ForthD extends ThreeD
{
    public double x,y,z,zd,od,td,thd,fd;
    double [][][] xyz;
    public double [][][][] fD;
    //public double fd;
    public double pf,dp;
    //double xyz[][];
    public int ft[];
    public ThreeD three_d[];
    public ForthD()
    {
    }
    public ForthD(int d,int t[],double p,double pd,double dD[][][][])
    {
        System.out.println("This is Dimention Forth .");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=4;
        }
        three_d=new ThreeD[dn];
        ft=new int[t.length];
        ft=t;
        ft[0]=t[0];
        pf=p;
        dp=pd;
        fD=new double [dn][dn-1][dn-2][dn-3];
        fD=dD;
        for(int id=0;id<dn;id++)
        {
            three_d[id]=new ThreeD(3,ft,pf,dp/dn,fD[id]);
            //fD[id]=three_d[id].thD;
            ft=three_d[id].tht;
            pf=three_d[id].pth;
        }
        ft[0]++;
        ft[4]++;
        System.out.println("In Dimention Forth's Turn no ="+ft[4]);
        System.out.println("This is Dimention Forth.Total Turn no ="+ft[0]);
        System.out.println("The Task has been completed to percentages="+pf);
        System.out.println("The Dimention Forth has been exited.");
    }
}