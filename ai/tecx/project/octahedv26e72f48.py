import medcoupling as mc
import math

class OctaHead:
    xy=mc.DataArrayDouble(8,3)
    yz=mc.DataArrayDouble(8,3)
    zx=mc.DataArrayDouble(8,3)
    z_xy=mc.DataArrayDouble(8,3)
    xy_z=mc.DataArrayDouble(8,3)
    x_yz=mc.DataArrayDouble(8,3)
    yz_x=mc.DataArrayDouble(8,3)
    y_zx=mc.DataArrayDouble(8,3)
    zx_y=mc.DataArrayDouble(8,3)
    xyCart=mc.DataArrayDouble(8,3)
    yzCart=mc.DataArrayDouble(8,3)
    zxCart=mc.DataArrayDouble(8,3)
    z_xyCart=mc.DataArrayDouble(8,3)
    xy_zCart=mc.DataArrayDouble(8,3)
    xyz=mc.DataArrayDouble(72,3)
    xyzPolar=mc.DataArrayDouble(72,3)
    xyzSper=mc.DataArrayDouble(26,3)
    xyzSper[:,0]=10
    xyzCart=mc.DataArrayDouble(26,3)
    xyzSpherInAngle=mc.DataArrayDouble(26,3)
    translationToPerform=mc.DataArrayDouble(73,3)
    translationToPerformInSpherPolar=mc.DataArrayDouble(73,3)
    xyzEdges=mc.DataArrayDouble(72,2)
    #xyzTriangularFaces=mc.DataArrayDouble(48,3)
    xyzSpherInAngle[:,0]=10
    xy[:,0]=10
    z_xy[:,0]=10
    xy_z[:,0]=10
    yz[:,0]=10
    x_yz[:,0]=10
    yz_x[:,0]=10
    zx[:,0]=10
    y_zx[:,0]=10
    zx_y[:,0]=10
    xy[:,1]=math.pi/2
    xy[:,2]=list(range(8))
    xy[:,2]*=math.pi/4
    yz[:,1]=list(range(8))
    yz[:,1]*=math.pi/4
    yz[:,2]=math.pi/2
    m=-1
    ma=1
    zx[0,1]=math.pi/2
    for i in range(8):
        if(i>0):
            zx[i,1]=zx[i-1,1]+m*math.pi/4
        if(i==2 or i==6):
            m=-m
            ma+=m*4
        y_zx[i,1]=-m*zx[i,1]
        zx_y[i,1]=-m*zx[i,1]
        y_zx[i,2]=ma*math.pi/4
        zx_y[i,2]=(ma+2)*math.pi/4
    zx[:,2]=0
    for i in range(3):
        zx[i+3,2]=math.pi
    for i in range(8):
        if(i==0 or i==4):
            z_xy[i,1]=math.pi/2
            xy_z[i,1]=math.pi/2
            x_yz[i,2]=math.pi/2
            yz_x[i,2]=math.pi/2
        elif(i<5):
            z_xy[i,1]=math.pi/4
            xy_z[i,1]=3*math.pi/4
            x_yz[i,2]=math.pi/4
            yz_x[i,2]=3*math.pi/4
        else:
            z_xy[i,1]=5*math.pi/4
            xy_z[i,1]=7*math.pi/4
            x_yz[i,2]=5*math.pi/4
            yz_x[i,2]=7*math.pi/4
    z_xy[:,2]=xy[:,2]
    xy_z[:,2]=xy[:,2]
    x_yz[:,1]=yz[:,1]
    yz_x[:,1]=yz[:,1]
    #kya  y_zx[:,1]=zx[:,1]
    #kya  zx_y[:,1]=zx[:,1]
    print("z_xy=",z_xy)
    print("xy_z=",xy_z)
    print("x_yz=",x_yz)
    print("yz_x=",yz_x)
    print("y_zx=",y_zx)
    print("zx_y=",zx_y)
    xy.setName("Octaheadrone XY Plane Spherical Cooordinates")
    xy.setInfoOnComponents(["R [m]","Theta [Pi]","Phi [Pi]"])
    #print("\n",xy.getValues())
    #print("\n",xy)
    #print("\n",xy.magnitude().isUniform(10.,1e-12))
    yz.setName("Octaheadrone YZ Plane Spherical Cooordinates")
    yz.setInfoOnComponents(["R [m]","Theta [Pi]","Phi [Pi]"])
    #print("\n",yz.getValues())
    #print("\n",yz)
    #print("\n",yz.magnitude().isUniform(10.,1e-12))
    zx.setName("Octaheadrone ZX Plane Spherical Cooordinates")
    zx.setInfoOnComponents(["R [m]","Theta [Pi]","Phi [Pi]"])
    #print("\n",zx.getValues())
    print("\n",zx)
    #print("\n",zx.magnitude().isUniform(10.,1e-12))
    z_xy.setName("Octaheadrone Z_XY Plane Spherical Cooordinates")
    z_xy.setInfoOnComponents(["R [m]","Theta [Pi]","Phi [Pi]"])
    print("\n",z_xy.getValues())
    print("\n",z_xy)
    print("\n",z_xy.magnitude().isUniform(10.,1e-12))
    xy_z.setName("Octaheadrone XY_Z Plane Spherical Cooordinates")
    xy_z.setInfoOnComponents(["R [m]","Theta [Pi]","Phi [Pi]"])
    print("\n",xy_z.getValues())
    print("\n",xy_z)
    print("\n",xy_z.magnitude().isUniform(10.,1e-12))
    xyCart=xy.fromSpherToCart()
    xyCart.setName("Octaheadrone XY Plane Cartesian Cooordinates")
    xyCart.setInfoOnComponents(["X [m]","Y [m]","Z [m]"])
    #print("\n",xyCart.getValues())
    #print("\n",xyCart)
    #print("\n",xyCart.magnitude().isUniform(10.,1e-12))
    yzCart=yz.fromSpherToCart()
    yzCart.setName("Octaheadrone YZ Plane Cartetian Cooordinates")
    yzCart.setInfoOnComponents(["X [m]","Y [m]","Z [m]"])
    #print("\n",yzCart.getValues())
    #print("\n",yzCart)
    #print("\n",yzCart.magnitude().isUniform(10.,1e-12))
    zxCart=zx.fromSpherToCart()
    zxCart.setName("Octaheadrone ZX Plane Cartetian Cooordinates")
    zxCart.setInfoOnComponents(["X [m]","Y [m]","Z [m]"])
    #print("\n",zxCart.getValues())
    #print("\n",zxCart)
    #print("\n",zxCart.magnitude().isUniform(10.,1e-12))
    z_xyCart=z_xy.fromSpherToCart()
    z_xyCart.setName("Octaheadrone Z_XY Plane Cartesian Cooordinates")
    z_xyCart.setInfoOnComponents(["X [m]","Y [m]","Z [m]"])
    print("\n",z_xyCart.getValues())
    print("\n",z_xyCart)
    print("\n",z_xyCart.magnitude().isUniform(10.,1e-12))
    xy_zCart=xy_z.fromSpherToCart()
    xy_zCart.setName("Octaheadrone XY_Z Plane Cartesian Cooordinates")
    xy_zCart.setInfoOnComponents(["X [m]","Y [m]","Z [m]"])
    print("\n",xy_zCart.getValues())
    print("\n",xy_zCart)
    print("\n",xy_zCart.magnitude().isUniform(10.,1e-12))
    aa=8
    for i in range(26):
        if(i<8):
            xyzSper[:,1]=math.pi/2
            xyzSper[i,2]=i*math.pi/4
        elif(i<14):
            if(i==10 or i==13):
                aa-=1
            xyzSper[i,1]=(i-aa)*math.pi/4
            xyzSper[i,2]=math.pi/2
        elif(i<18):
            if(i>15):
                xyzSper[i,1]=3*math.pi/4
            else:
                xyzSper[i,1]=math.pi/4
            if(i==15 or i==16):
                xyzSper[i,2]=math.pi
            else:
                xyzSper[i,2]=0
        elif(i<22):
            if(i>19):
                xyzSper[i,1]=5*math.pi/4
            else:
                xyzSper[i,1]=math.pi/4
            xyzSper[i,2]=math.pi/4+(i-18)*math.pi/2
        elif(i<26):
            if(i>23):
                xyzSper[i,1]=7*math.pi/4
            else:
                xyzSper[i,1]=3*math.pi/4
            xyzSper[i,2]=math.pi/4+(i-22)*math.pi/2
    xyzSper.setName("Octaheadrone Spherical Polar Coordinates")
    xyzSper.setInfoOnComponents(["R [m]","Theta [Pi]","Phi [Pi]"])
    #print("\n",xyzSper.getValues())
    #print("\n",xyzSper)
    #print("\n",xyzSper.magnitude().isUniform(10.,1e-12))
    xyzCart=xyzSper.fromSpherToCart()
    xyzCart.setName("Octaheadrone XYZ Plane Cartetian Cooordinates")
    xyzCart.setInfoOnComponents(["X [m]","Y [m]","Z [m]"])
    #print("\n",xyzCart.getValues())
    print("\n",xyzCart)
    #print("\n",xyzCart.magnitude().isUniform(10.,1e-12))
    xyzSpherInAngle.setName("Octaheadrone Spherical Polar Coordinates Angle In Degree")
    xyzSpherInAngle.setInfoOnComponents(["R [m]","Theta [Degree]","Phi [Degree]"])
    xyzSpherInAngle[:,1]=xyzSper[:,1]*180/math.pi
    xyzSpherInAngle[:,2]=xyzSper[:,2]*180/math.pi
    #print("\n",xyzSpherInAngle.getValues())
    print("\n",xyzSpherInAngle)
    #print("\n",xyzSpherInAngle.magnitude().isUniform(10.,1e-12))
    radius=10
    length=2*radius*math.cos(math.pi/8)
    ###print("length of octahearone diagonal=",length)
    m=-1
    for i in range(73):
        if(i==0):
            translationToPerform[i,:]=[0.,0.,0.]
            translationToPerformInSpherPolar[i,:]=[0.,0.,0.]
        elif(i<9):
            translationToPerform[i,:]=[length*math.cos(xy[(i-1),2]+math.pi/8),length*math.sin(xy[(i-1),2]+math.pi/8),0.]
            translationToPerformInSpherPolar[i,:]=[length,xy[(i-1),1],xy[(i-1),2]+math.pi/8]
        elif(i<17):
            translationToPerform[i,:]=[0.,length*math.cos(yz[(i-9),2]+math.pi/8),length*math.sin(yz[(i-9),2]+math.pi/8)]
            translationToPerformInSpherPolar[i,:]=[length,yz[(i-9),1]+math.pi/8,yz[(i-9),2]]
        elif(i<25):
            if(i==19 or i==23):
                m=-m
            translationToPerform[i,:]=[length*math.sin(zx[(i-17),1]+m*math.pi/8),0.,length*math.cos(zx[(i-17),1]+m*math.pi/8)]
            translationToPerformInSpherPolar[i,:]=[length,zx[(i-17),1]+m*math.pi/8,zx[(i-17),2]]            
        elif(i<33):
            if(i==27 or i==31):
                m=-m
            translationToPerform[i,:]=[length*math.cos(z_xy[(i-25),2]+math.pi/8)*math.sin(z_xy[(i-25),1]),length*math.sin(z_xy[(i-25),2]+math.pi/8)*math.sin(z_xy[(i-25),1]),length*math.cos(z_xy[(i-25),1])]
            translationToPerformInSpherPolar[i,:]=[length,z_xy[(i-25),1],z_xy[(i-25),2]+math.pi/8]
            #translationToPerform[i,:]=[length*math.cos(z_xy[(i-25),2]+math.pi/8)*math.sin(z_xy[(i-25),1]+m*math.pi/8),length*math.sin(z_xy[(i-25),2]+math.pi/8)*math.sin(z_xy[(i-25),1]+m*math.pi/8),length*math.cos(z_xy[(i-25),1]+m*math.pi/8)]
            #translationToPerformInSpherPolar[i,:]=[length,z_xy[(i-25),1]+m*math.pi/8,z_xy[(i-25),2]+math.pi/8]
        elif(i<41):
            if(i==35 or i==39):
                m=-m
            translationToPerform[i,:]=[length*math.cos(xy_z[(i-33),2]+math.pi/8)*math.sin(xy_z[(i-33),1]),length*math.sin(xy_z[(i-33),2]+math.pi/8)*math.sin(xy_z[(i-33),1]),length*math.cos(xy_z[(i-33),1])]
            translationToPerformInSpherPolar[i,:]=[length,xy_z[(i-33),1],xy_z[(i-33),2]+math.pi/8]
            #translationToPerform[i,:]=[length*math.cos(xy_z[(i-33),2]+math.pi/8)*math.sin(xy_z[(i-33),1]+m*math.pi/8),length*math.sin(xy_z[(i-33),2]+math.pi/8)*math.sin(xy_z[(i-33),1]+m*math.pi/8),length*math.cos(xy_z[(i-33),1]+m*math.pi/8)]
            #translationToPerformInSpherPolar[i,:]=[length,xy_z[(i-33),1]+m*math.pi/8,xy_z[(i-33),2]+math.pi/8]
        elif(i<49):
            translationToPerform[i,:]=[length*math.cos(x_yz[(i-41),2])*math.sin(x_yz[(i-41),1]+math.pi/8),length*math.sin(x_yz[(i-41),2])*math.sin(x_yz[(i-41),1]+math.pi/8),length*math.cos(x_yz[(i-41),1]+math.pi/8)]
            translationToPerformInSpherPolar[i,:]=[length,x_yz[(i-41),1]+math.pi/8,x_yz[(i-41),2]]
        elif(i<57):
            translationToPerform[i,:]=[length*math.cos(yz_x[(i-49),2])*math.sin(yz_x[(i-49),1]+math.pi/8),length*math.sin(yz_x[(i-49),2])*math.sin(yz_x[(i-49),1]+math.pi/8),length*math.cos(yz_x[(i-49),1]+math.pi/8)]
            translationToPerformInSpherPolar[i,:]=[length,yz_x[(i-49),1]+math.pi/8,yz_x[(i-49),2]]
        elif(i<65):
            translationToPerform[i,:]=[length*math.cos(y_zx[(i-57),2])*math.sin(y_zx[(i-57),1]+m*math.pi/8),length*math.sin(y_zx[(i-57),2])*math.sin(y_zx[(i-57),1]+m*math.pi/8),length*math.cos(y_zx[(i-57),1]+m*math.pi/8)]
            translationToPerformInSpherPolar[i,:]=[length,y_zx[(i-57),1]+m*math.pi/8,y_zx[(i-57),2]]
        elif(i<73):
            translationToPerform[i,:]=[length*math.cos(zx_y[(i-65),2])*math.sin(zx_y[(i-65),1]+m*math.pi/8),length*math.sin(zx_y[(i-65),2])*math.sin(zx_y[(i-65),1]+m*math.pi/8),length*math.cos(zx_y[(i-65),1]+m*math.pi/8)]
            translationToPerformInSpherPolar[i,:]=[length,zx_y[(i-65),1]+m*math.pi/8,zx_y[(i-65),2]]
        print("Distance of center of Octahedrone %d from origin="% i,math.sqrt(math.pow(translationToPerform[i,0],2)+math.pow(translationToPerform[i,1],2)+math.pow(translationToPerform[i,2],2)))
        print("translationToPerform[% d,:]=" % i,translationToPerform[i,:])
        print("translationToPerformInSpherPolar[% d,:]=" % i,translationToPerformInSpherPolar[i,:])
        print("translationToPerformInSpherPolar[% d,:] in Degree= " % i,translationToPerformInSpherPolar[i,1:3]*180/math.pi)
    translationToPerformInSpherPolarFC=translationToPerform.fromCartToSpher()
    translationToPerformFS=translationToPerformInSpherPolar.fromSpherToCart()
    #print("\ntranslationToPerform=\n",translationToPerform)
    #print("\ntranslationToPerformInSpherPolarFC=\n",translationToPerformInSpherPolarFC)
    #print("\ntranslationToPerformFS=\n",translationToPerformFS)
    #print("\ntranslationToPerformInSpherPolar=\n",translationToPerformInSpherPolar)
    ds=len(translationToPerformFS)*[None]
    ##ds=len(translationToPerform)*[None]
    #print("Outside, ds=",ds)
    for pos,t in enumerate(translationToPerformFS):
    ##for pos,t in enumerate(translationToPerform):
        print("pos=",pos)
        print("t=",t)
        ds[pos]=xyzCart[:]
        #print("Inside,at pos=%d, when ds[pos]=xyzSper, ds="% pos,ds)
        ds[pos]+=t
        #print("Inside,at t=%s, after ds[pos]+=t, ds="% t,ds)
        d=mc.DataArrayDouble(26,3)
        d=ds[pos]
        #print("d=",d)
        for i in range(26):
            print("Distance of edge %d of Octaheadron from origin="% (pos*26+i),math.sqrt(math.pow(d[i,0],2)+math.pow(d[i,1],2)+math.pow(d[i,2],2)))
            #print("Distance of edge %d of Octaheadron from origin="% i,math.sqrt(math.pow(d[i,0],2)+math.pow(d[i,1],2)+math.pow(d[i,2],2)))
        pass
    d2=mc.DataArrayDouble.Aggregate(ds)
    print(d2)
    oldNbOfTuples=d2.getNumberOfTuples()
    c,cI=d2.findCommonTuples(1e-12)
    print("c=",c)
    print("cI=",cI)
    tmp=c[cI[0]:cI[0+1]]
    print("cI[0]=%s and cI[0+1]="% cI[0],cI[0+1])
    print("tmp=",tmp)
    print("d2=",d2[tmp])
    a=cI.deltaShiftIndex()
    print("a=",a)
    b=a-1
    #print("b=",b)
    myNewNbOfTuples=oldNbOfTuples-sum(b.getValues())
    #print("myNewNbOfTuples=",myNewNbOfTuples)
    o2n,newNbOfTuples=mc.DataArrayInt.ConvertIndexArrayToO2N(oldNbOfTuples,c,cI)
    #print("o2n=",o2n)
    #print("newNbOfTuples=",newNbOfTuples)
    print("Have I got the right result? %s"%(str(myNewNbOfTuples==newNbOfTuples)))
    d3=d2.renumberAndReduce(o2n,newNbOfTuples)
    #print("d3=",d3)
    n2o=o2n.invertArrayO2N2N2O(newNbOfTuples)
    #print("n2o=",n2o)
    d3_bis=d2[n2o]
    print("Have I got the right result (2)? %s"%(str(d3.isEqual(d3_bis,1e-12))))
    #print("d3_bis=",d3_bis)
    #NOT USED BEFORE FOR OCTAHEADRONE#d3+=[3.3,4.4]
    m=mc.MEDCouplingUMesh("My41octaheadrones",3)
    m.setCoords(d3)
    m.allocateCells(41)
    for i in list(range(41)):
        m.insertNextCell(mc.NORM_POLYHED,o2n[8*i:8*(i+1)].getValues())
        print("o2n[8*%d:8*(i+1)]="% i,o2n[8*i:8*(i+1)])
        pass
    m.checkConsistencyLight()
    m.writeVTK("My41octahedrones.vtu")
    print("m=",m)
    xyzTriangularFaces=48*[None]
    a=0
    for i in range(8):
        if(i==0 or i==3 or i==4 or i==7):
            if(i==7):
                ii=0
            else:
                ii=i+1
            xyzTriangularFaces[a]=[xy[i,:],xy[ii,:],x_yz[ii,:]]
            xyzTriangularFaces[a+1]=[yz[i,:],yz[ii,:],x_yz[ii,:]]
            xyzTriangularFaces[a+2]=[xy[i,:],x_yz[i,:],x_yz[ii,:]]
            xyzTriangularFaces[a+3]=[yz[i,:],x_yz[i,:],x_yz[ii,:]]
            xyzTriangularFaces[a+24]=[xy[i,:],xy[ii,:],yz_x[ii,:]]
            xyzTriangularFaces[a+25]=[yz[i,:],yz[ii,:],yz_x[i,:]]
            xyzTriangularFaces[a+26]=[xy[i,:],yz_x[i,:],yz_x[ii,:]]
            xyzTriangularFaces[a+27]=[yz[i,:],yz_x[i,:],yz_x[ii,:]]
            print("in if a=",a)
            print(" in if i=",i)
            if(i!=7):
                a+=4
            print("a+4=",a)
        elif(i==1 or i==2 or i==5 or i==6):
            xyzTriangularFaces[a]=[xy[i,:],xy[i+1,:],x_yz[i+1,:]]
            xyzTriangularFaces[a+1]=[yz[i,:],yz[i+1,:],x_yz[i,:]]
            xyzTriangularFaces[a+24]=[xy[i,:],xy[i+1,:],yz_x[i+1,:]]
            xyzTriangularFaces[a+25]=[yz[i,:],yz[i+1,:],yz_x[i,:]]
            a+=2
            print("in elif i=",i)
            print("a=",a)
    print("xyzTriangularFaces=",xyzTriangularFaces)