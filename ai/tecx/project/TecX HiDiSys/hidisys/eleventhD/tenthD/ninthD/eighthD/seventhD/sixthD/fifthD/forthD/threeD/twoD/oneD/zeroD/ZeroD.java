package hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.twoD.oneD.zeroD;

public class ZeroD
{
  public double x,y,z,zd;
  public double [][][] xyz;
  public double zD[];
  //public double zd;
  public double pz,dp;
  //double xyz[][];
  public int zt[];
  //public ZeroD zero_d[];
  public ZeroD()
  {
    
  }
  public ZeroD(int d,int[] t,double p,double pd,double dD[])
  {
    System.out.println("This is Dimention Zero.");
    int dn;
    if(d>0)
    {
      dn=d;
    }
    else
    {
      dn=0;
    }
    //zero_d=new ZeroD[dn];
    zt=new int [t.length];
    zt=t;
    pz=p;
    dp=pd;
    zD=new double zD[dn];
    zD=dD;
    for(int id=0;id<dn;id++)
    {
      //zero_d[id]=new ZeroD(0,ot,po,dp/dn,zD[id]) ;
      //zD[id]=zD;
      pz=pz;
      //zt=zt;
      /////zD=0.0;
    }
    pz+=dp;   //// while zero_d not declare.
    zt[0]++;
    //zt[1]++;
    System.out.println("Percentage of Task Completion="+pz);
    //System.out.println("In Dimention Zero's Turn no ="+zt);
    System.out.println("In Dimention Zero. Total Turn no ="+zt[0]);
    System.out.println("The Task has been completed to percentages="+pz);
    System.out.println("The Dimention Zero has been exited.");
    }
}