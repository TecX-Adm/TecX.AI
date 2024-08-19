package hidisys.eleventhD;

import hidisys.eleventhD.tenthD.*;

public class EleventhD extends TenthD
{
    public double x,y,z,zd,od,td,thd,fd,fid,sd,svd,ed,nd,ted,evd;
    double [][][] xyz;
    public double [][][][][][][][][][][] evD;
    //public double evd;
    double dp,pev;
    //double xyz[][];
    public int evt[];
    public TenthD tenth_d[];
    public EleventhD()
    {
    }
    public EleventhD(int d,int t[],double p,double pd,double dD[][][][][][][][][][][])
    {
        System.out.println("This is Dimention Eleventh.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=11;
        }
        evt=new int[t.length];
        evt=t;
        pev=p;
        dp=pd;
        tenth_d=new TenthD[dn];
        evD=new double [dn][dn-1][dn-2][dn-3][dn-4][dn-5][dn-6][dn-7][dn-8][dn-9][dn-10];
        evD=dD;
        for(int id=0;id<dn;id++)
        {
            tenth_d[id]=new TenthD(10,evt,pev,dp/dn,evD[id]);
            //evD[id]=tenth_d[id].teD;
            evt=tenth_d[id].tet;
            pev=tenth_d[id].pte;
        }
        evt[0]++;
        evt[11]++;
        System.out.println("In Dimention Eleventh's Turn no ="+evt[11]);
        System.out.println("This is Dimention Eleventh.Total Turn no ="+evt[0]);
        System.out.println("The Task has been completed to percentages="+pev);
        System.out.println("The Dimention Eleventh has been exited.");
    }
}