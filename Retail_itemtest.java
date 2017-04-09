class Retail_itemtest
{
    int i1,i2,i3,i4,i5,i6,i7;
    int ti1,ti2,ti3,ti4,ti5,ti6,ti7;
    String SelectedItem ;
    int quantity;
    String mastercode ;
    int totalamt;
    public Retail_itemtest(){
         Retail_itemtest obj1 = new Retail_itemtest(1);
         obj1.display();
      }  
    public Retail_itemtest(int a){
    }   
   public Retail_itemtest(String Itemnum,int qty)   
    { 
      i1 = 2;
      i2 = 4; 
      i3 = 8; 
      i4 = 6;
      i5 = 3;
      i6 = 8;
      i7 = 1;
      SelectedItem = Itemnum;
      quantity = qty;
      select();
    }     
     public Retail_itemtest(String master,int ite1,int ite2,int ite3,int ite4,int ite5,int ite6,
     int ite7,String Itemnum1,int qty1)
   {
      mastercode = master;
      ti1 = ite1;
      ti2 = ite2;
      ti3 = ite3;
      ti4 = ite4;
      ti5 = ite5;
      ti6 = ite6;
      ti7 = ite7;
      SelectedItem = Itemnum1;
      quantity = qty1;
      if (mastercode == "password")
      {
          i1 = ti1;
          i2 = ti2; 
          i3 = ti3; 
          i4 = ti4;
          i5 = ti5;
          i6 = ti6;
          i7 = ti7;
        
      }
    }
    public void display()
   {
        System.out.println("The following table contains the product available and the product ID of the particular product");
        System.out.println("(1)Book                  : i1 ; price : 2");
        System.out.println("(2)Pen                   : i2 ; price : 4");
        System.out.println("(3)Pencil                : i3 ; price : 8");
        System.out.println("(4)Spinach               : i4 ; price : 6");
        System.out.println("(5)Coriander             : i5 ; price : 3");
        System.out.println("(6)Colgate Toothpaste    : i6 ; price : 8");
        System.out.println("(7)Dishwashing soap      : i7 ; price : 1");
        System.out.println("master Reset is available if you can type the password in another constructor");
    }
   public void select(){
      if ( SelectedItem == "i1")
       {
            it1();
       }
        else if(SelectedItem == "i2")
       {
            it2();
       }
        else if(SelectedItem == "i3")
       {
            it3();
       }
        else if(SelectedItem == "i4")
       {
            it4();
       }
        else if(SelectedItem == "i5")
       {
            it5();
       }
        else if(SelectedItem == "i6")
       {
            it6();
       }
        else if(SelectedItem == "i7")
       {
            it7();
       }
        else 
       {
            System.out.println("invalid product ID . " + "Please verify");
       }
       TotalAmount();
     }
   public void it1(){
        System.out.println("you have chosen : book");
        int tot1 = quantity * i1;
        totalamt = tot1;
        System.out.println("it costs " + i1 + " * " + quantity + " = " + tot1);
    }
   public void it2(){
        System.out.println("you have chosen :  pen");
        int tot2 = quantity * i2;
        totalamt = tot2;
        System.out.println("it costs " + i2 + " * " + quantity + " = " + tot2);
    }
   public void it3(){
        System.out.println("you have chosen : pencil");
        int tot3 = quantity * i3;
        totalamt = tot3;
        System.out.println("it costs " + i3 + " * " + quantity + " = " + tot3);
    }
   public void it4(){ 
        System.out.println("you have chosen: spinach");
        int tot4 = quantity * i4;
        totalamt = tot4;
        System.out.println("it costs " + i4 + " * " + quantity + " = " + tot4);
    }
   public void it5(){
        System.out.println("you have chosen : coriander");
        int tot5 = quantity * i5;
        totalamt = tot5;
        System.out.println("it costs " + i5 + " * " + quantity + " = " + tot5);
    }
   public void it6(){
        System.out.println("you have chosen : colgate sensitive toothpaste ");
        int tot6 = quantity * i6;
        totalamt = tot6;
        System.out.println("it costs " + i6 + " * " + quantity + " = " + tot6);
    }
   public void it7(){
        System.out.println("you have chosen : dishwashing soap");
        int tot7 = quantity * i7;
        totalamt = tot7;
        System.out.println("it costs " + i7 + " * " + quantity + " = " + tot7);
    } 
   public void TotalAmount( )
    {
       System.out.println("the total amount to be paid is Rs." + totalamt); 
       System.out.println("Thank you for shopping at Cps automated retail outlet");
    
     }
}