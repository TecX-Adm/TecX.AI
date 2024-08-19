package hidisys.eleventhD.tenthD.ninthD;

import hidisys.eleventhD.tenthD.ninthD.eighthD.*;

public class NinthD extends EighthD
{
    public double x,y,z,zd,od,td,thd,fd,fid,sd,svd,ed,nd;
    public double [][] xyz;
    public double [][][][][][][][][] nD;
    //public double nd;
    public double pn,dp;
    //double xyz[][];
    public int nt[];
    public EighthD eighth_d[];
    public NinthD()
    {
    }
    public NinthD(int d,int t[],double p,double pd,double dD[][][][][][][][][])
    {
        System.out.println("This is Dimention Ninth.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=9;
        }
        eighth_d=new EighthD[dn];
        nt=new int[t.length];
        nt=t;
        pn=p;
        dp=pd;
        nD=new double [dn][dn-1][dn-2][dn-3][dn-4][dn-5][dn-6][dn-7][dn-8];
        nD=dD;
        for(int id=0;id<dn;id++)
        {
            eighth_d[id]=new EighthD(8,nt,pn,dp/dn,nD[id]);
            //nD[id]=eighth_d[id].eD;
            nt=eighth_d[id].et;
            pn=eighth_d[id].pe;
        }
        nt[0]++;
        nt[9]++;
        System.out.println("In Dimention Ninth's Turn no ="+nt[9]);
        System.out.println("This is Dimention Ninth.Total Turn no ="+nt[0]);
        System.out.println("The Task has been completed to percentages="+pn);
        System.out.println("The Dimention Ninth has been exited.");
    }
}