
package com.mycompany.aghiad4;

public class school extends buliding{
    protected int numofC;
    protected String name;

    public school(int numofC, String name,int numofBu, int numofF, int Area ) {
        super(numofBu, numofF, Area);
        this.numofC = numofC;
        this.name = name;
    }
    @Override
    public String getname()
    {
        return "School";
    }
    
    @Override
    public void print ()
    {     
//        super.print();
        System.out.print("building's number: ");
        System.out.println(super.numofBu);
        System.out.print("numbers of floors: ");
        System.out.println(super.numofF);
        System.out.print("Area: ");
        System.out.println(super.Area);
        System.out.print("numbers of classes: ");
        System.out.println(this.numofC);
        System.out.print("School's name: ");
        System.out.println(this.name);
        
    }
    
    
}
