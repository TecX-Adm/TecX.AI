package hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD;

import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.*;

public class SeventhD extends SixthD
{
    public double xyz[][][];
    public double x,y,z,zd,od,td,thd,fd,fid,sd,svd;
    public double [][][][][][][] svD;
    //public double svd;
    public double psv,dp;
    //double xyz[][];
    public int svt[];
    public SixthD sixth_d[];
    public SeventhD()
    {
    }
    public SeventhD(int d,int t[],double p,double pd,double dD[][][][][][][])
    {
        System.out.println("This is Dimention Seventh.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=7;
        }
        sixth_d=new SixthD[dn];
        svt=new int[t.length];
        svt=t;
        psv=p;
        dp=pd;
        svD=new double [dn][dn-1][dn-2][dn-3][dn-4][dn-5][dn-6];
        svD=dD;
        for(int id=0;id<dn;id++)
        {
            sixth_d[id]=new SixthD(6,svt,psv,dp/dn,svD[id]);
            //svD[id]=sixth_d[id].sD;
            svt=sixth_d[id].st;
            psv=sixth_d[id].ps;
        }
        svt[0]++;
        svt[7]++;
        System.out.println("In Dimention Seventh's Turn no ="+svt[7]);
        System.out.println("This is Dimention Seventh.Total Turn no ="+svt[0]);
        System.out.println("The Task has been completed to percentages="+psv);
        System.out.println("The Dimention Seventh has been exited.");
    }
}