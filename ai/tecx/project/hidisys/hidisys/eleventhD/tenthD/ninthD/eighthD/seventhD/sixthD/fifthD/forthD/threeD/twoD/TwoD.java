package hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.twoD;

import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.twoD.oneD.*;

public class TwoD extends OneD
{
    public double x,y,z,zd,od,td;
    public double [][][] xyz;
    public double [][] tD;
    //public double td;
    public double dp,pt;
    //double xyz[][];
    public int tt[];
    public OneD one_d[];
    public TwoD()
    {
    }
    public TwoD(int d,int[] t,double p,double pd,double dD[][])
    {
        System.out.println("This is Dimention Second.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=2;
        }
        one_d=new OneD[dn];
        tt=new int [t.length];
        tt=t;
        pt=p;
        dp=pd;
        tD=new double [dn][dn-1];
        tD=dD;
        for(int id=0;id<dn;id++)
        {
            one_d[id]= new OneD(1,tt,pt,dp/dn,tD[id]);
            tD[id]=one_d[id].oD;
            tt=one_d[id].ot;
            pt=one_d[id].po;
        }
        tt[0]++;
        tt[2]++;
        System.out.println("This is Dimention Second's Turn no ="+tt[2]);
        System.out.println("In Dimention Second's Turn no ="+tt[2]);
        System.out.println("In Dimention Second. Total Turn no ="+tt[0]);
        System.out.println("The Task has been completed to percentages="+pt);
        System.out.println("The Dimention Second has been exited.");
    }
}