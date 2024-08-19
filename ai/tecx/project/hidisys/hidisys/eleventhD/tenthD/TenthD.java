package hidisys.eleventhD.tenthD;

import hidisys.eleventhD.tenthD.ninthD.*;

public class TenthD extends NinthD
{
    public double x,y,z,zd,od,td,thd,fd,fid,sd,svd,ed,nd,ted;
    double [][][] xyz;
    public double [][][][][][][][][][] teD;
    // double ted;
    public double pte,dp;
    //double xyz[][];
    public int tet[];
    public NinthD ninth_d[];
    public TenthD()
    {
    }
    public TenthD(int d,int t[],double p,double pd,double dD[][][][][][][][][][])
    {
        System.out.println("This is Dimention Tenth.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=10;
        }
        ninth_d=new NinthD[dn];
        tet=new int[t.length];
        tet=t;
        pte=p;
        dp=pd;
        teD=new double [dn][dn-1][dn-2][dn-3][dn-4][dn-5][dn-6][dn-7][dn-8][dn-9];
        teD=dD;
        for(int id=0;id<dn;id++)
        {
            ninth_d[id]=new NinthD(9,tet,pte,dp/dn,teD[id]);
            //teD[id]=ninth_d[id].nD;
            tet=ninth_d[id].nt;
            pte+=ninth_d[id].pn;
        }
        tet[0]++;
        tet[10]++;
        System.out.println("In Dimention Tenth's Turn no ="+tet[10]);
        System.out.println("This is Dimention Tenth.Total Turn no ="+tet[0]);
        System.out.println("The Task has been completed to percentages="+pte);
        System.out.println("The Dimention Tenth has been exited.");
    }
}