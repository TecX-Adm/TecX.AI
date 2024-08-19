package hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.twoD.oneD;
//import hidisys.eleventhD.tenthD.ninthD.eighthD.seventhD.sixthD.fifthD.forthD.threeD.twoD.oneD.zeroD.*;

public class OneD //extends ZeroD
{
  public double x,y,z,zd,od;
  public double [][][] xyz;
  public double [] oD;
  //public double od;
  public double po,dp;
  //double xyz[][];
  public int ot[];
  //public ZeroD zero_d[];
  public OneD()
  {
  //System.out.println("This is Dimention One.");  
  }
  public OneD(int d,int[] t,double p,double pd,double dD[])
  {
    
    System.out.println("This is Dimention One's 5 Parameter Constructor.");
    int dn;
    if(d!=0 && d>0)
    {
      dn=d;
    }
    else
    {
      dn=1;
    }
    //zero_d=new ZeroD[dn];
    ot=new int [t.length];
    ot=t;
    po=p;
    dp=pd;
    oD=new double [dn];
    oD=dD;
    for(int id=0;id<dn;id++)
    {
      //zero_d[id]=new ZeroD(0,ot,po,dp/dn,oD[id]) ;
      //oD[id]=zero_d[id].zD;
      //po=zero_d[id].pz;
      //ot=zero_d[id].zt;
    }
    po+=dp;   //// while zero_d not declare.
    ot[0]++;
    ot[1]++;
    //System.out.println("Percentage of Task Completion="+po);
    System.out.println("In Dimention One's Turn no ="+ot[1]);
    System.out.println("In Dimention One. Total Turn no ="+ot[0]);
    System.out.println("The Task has been completed to "+po+"%");
    System.out.println("The Dimention One has been exited.");
    }
}