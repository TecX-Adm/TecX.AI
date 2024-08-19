package hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD;

import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.*;

public class SixthD extends FifthD
{
    public double x,y,z,zd,od,td,thd,fd,fid,sd;
    public double [][][] xyz;
    public double [][][][][][] sD;
    //public double sd;
    public double ps,dp;
    //double xyz[][];
    public int st[];
    public FifthD fifth_d[];
    public SixthD()
    {
    }
    public SixthD(int d,int t[],double p,double pd,double dD[][][][][][])
    {
        System.out.println("This is Dimention Sixth.");
        int dn;
        if(d!=0 && d>0)
        {
            dn=d;
        } 
        else
        {
            dn=6;
        }
        fifth_d=new FifthD[dn];
        st=new int[t.length];
        st=t;
        ps=p;
        dp=pd;
        sD=new double [dn][dn-1][dn-2][dn-3][dn-4][dn-5];
        sD=dD;
        for(int id=0;id<dn;id++)
        {
            fifth_d[id]=new FifthD(5,st,ps,dp/dn,sD[id]);
            //sD[id]=fifth_d[id].fiD;
            st=fifth_d[id].fit;
            ps=fifth_d[id].pfi;
        }
        st[0]++;
        st[6]++;
        System.out.println("In Dimention Sixth's Turn no ="+st[6]);
        System.out.println("This is Dimention Sixth.Total Turn no ="+st[0]);
        System.out.println("The Task has been completed to percentages="+ps);
        System.out.println("The Dimention Sixth has been exited.");
    }
}