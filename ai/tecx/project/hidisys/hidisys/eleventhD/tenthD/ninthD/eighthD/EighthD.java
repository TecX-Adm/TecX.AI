package hidisys.eleventhD.tenthD.ninthD.eighthD;

import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.*;

public class EighthD extends SeventhD
{
    public double x,y,z,zd,od,td,thd,fd,fid,sd,scd,ed;
    public double [][] xyz;
    public double [][][][][][][][] eD;
    //public double ed;
    public double pe,dp;
    //double xyz[][];
    public int et[];
    public SeventhD seventh_d[];
    public EighthD()
    {
    }
    public EighthD(int d,int t[],double p,double pd,double dD[][][][][][][][])
    {
        System.out.println("This is Dimention Eighth.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=8;
        }
        seventh_d=new SeventhD[dn];
        et=new int[t.length];
        et=t;
        pe=p;
        dp=pd;
        eD=new double [dn][dn-1][dn-2][dn-3][dn-4][dn-5][dn-6][dn-7];
        eD=dD;
        for(int id=0;id<dn;id++)
        {
            seventh_d[id]=new SeventhD(7,et,pe,dp/dn,eD[id]);
            //eD[id]=seventh_d[id].svD;
            et=seventh_d[id].svt;
            pe=seventh_d[id].psv;
        }
        et[0]++;
        et[8]++;
        System.out.println("In Dimention Eighth's Turn no ="+et[8]);
        System.out.println("This is Dimention Eighth.Total Turn no ="+et[0]);
        System.out.println("The Task has been completed to percentages="+pe);
        System.out.println("The Dimention Eighth has been exited.");
    }
}