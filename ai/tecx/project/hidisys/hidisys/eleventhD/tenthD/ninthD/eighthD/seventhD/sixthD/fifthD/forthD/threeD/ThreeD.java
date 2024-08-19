package hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD;

import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.twoD.*;

public class ThreeD extends TwoD
{
    public double x,y,z,zd,od,td,thd;
    public double [][][] xyz;
    public double [][][] thD;
    //public double thd;
    public double dp,pth;
    //double xyz[][];
    public int tht[];
    public TwoD two_d[];
    public ThreeD()
    {
    }
    public ThreeD(int d,int t[],double p,double pd,double dD[][][])
    {
        System.out.println("This is Dimention Three.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=3;
        }
        two_d=new TwoD[dn];
        tht=new int [t.length];
        tht=t;
        pth=p;
        dp=pd;
        thD=new double [dn][dn-1][dn-2];
        thD=dD;
        for(int id=0;id<dn;id++)
        {
            two_d[id]=new TwoD(2,tht,pth,dp/dn,thD[id]);
            //thD[id]=two_d[id].tD;
            tht=two_d[id].tt;
            pth=two_d[id].pt;
        }
        tht[0]++;
        tht[3]++;
        System.out.println("In Dimention Second's Turn no ="+tht[3]);
        System.out.println("This is Dimention Three.Total Turn no ="+tht[0]);
        System.out.println("The Task has been completed to percentages="+pth);
        System.out.println("The Dimention Three has been exited.");
    }
}