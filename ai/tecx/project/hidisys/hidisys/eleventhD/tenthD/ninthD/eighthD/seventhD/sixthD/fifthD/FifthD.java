package hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD;

import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.*;

public class FifthD extends ForthD
{
    public double x,y,z,zd,od,td,thd,fd,fid;
    public double [][][] xyz;
    public double [][][][][] fiD;
   //public double fid;
    public double pfi,dp;
    //double xyz[][];
    public int fit[];
    public ForthD forth_d[];
    public FifthD()
    {
    }
    public FifthD(int d,int[] t,double p,double pd,double dD[][][][][])
    {
        System.out.println("This is Dimention Fifth.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=5;
        }
        forth_d=new ForthD[dn];
        fit=new int[t.length];
        fit=t;
        pfi=p;
        dp=pd;
        fiD=new double [dn][dn-1][dn-2][dn-3][dn-4];
        fiD=dD;
        for(int id=0;id<dn;id++)
        {
            forth_d[id]=new ForthD(4,fit,pfi,dp/dn,fiD[id]);
            //fiD[id]=forth_d[id].fD;
            fit=forth_d[id].ft;
            pfi=forth_d[id].pf;

        }
        fit[0]++;
        fit[5]++;
        System.out.println("In Dimention Fifth's Turn no ="+fit[5]);
        System.out.println("This is Dimention Fifth.Total Turn no ="+fit[0]);
        System.out.println("The Task has been completed to percentages="+pfi);
        System.out.println("The Dimention Fifth has been exited.");
    }
}