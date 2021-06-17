package NameWithPatt;

import java.util.*;


/**
 *
 * @author Souragopal
 */
public class NameWithPattern {

    
    public static void a(int n)
    {
      
       
       for(int i=0;i<=n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(j==0||i==0||j==n-1||i==n/2)
               {
                   System.out.print("A");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }  
    
    
    }
    public static void b(int n)
    {
        
        for(int i=0;i<=n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(j==0||i==0&&j<=n/2||i==n/2&&j<=n/2||i==n-1&&j<=n/2||j==n/2)
               {
                   System.out.print("B");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
    
    
    }
    
  public static void c(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i==0||j==0||i==n-1)
               {
                   System.out.print("c");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
 
  }
    
   public static void d(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i==0||j==n-1||i==n/2||j==n/2)
               {
                   System.out.print("d");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
   
    public static void e(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==0||j==0||i==n-1||i==n/2)
               {
                   System.out.print("e");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
 
  }
    
     public static void f (int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==0||i==n/2)
               {
                   System.out.print("f");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
 
  }
      public static void g (int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==0||j==0||i==n-1||j==n-1&&i>=n/2||i==n/2&&j>=n/2)
               {
                   System.out.print("g");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
      public static void h (int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==n/2||j==n-1)
               {
                   System.out.print("h");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
        public static void i (int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==n/2||i==0||i==n-1)
               {
                   System.out.print("I");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
        public static void j (int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==0||j==n/2||i==n-1&&j<=n/2||j==0&&i>=n/2)
               {
                   System.out.print("J");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
         public static void k (int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==n/2||i+j==n-1&&i<=n/2||i==j&&i>=n/2)
               {
                   System.out.print("K");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
         public static void l (int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==n-1)
               {
                   System.out.print("L");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
      public static void m (int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==j&&i<=n/2||i+j==n-1&&i<=n/2||j==n-1)
               {
                   System.out.print("M");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
    
 public static void n(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==j||j==n-1)
               {
                   System.out.print("N");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }
 
 public static void o(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==0||j==n-1||i==n-1)
               {
                   System.out.print("O");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }   
    
  public static void p(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==0||j==n-1&&i<=n/2||i==n/2)
               {
                   System.out.print("P");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }     
    
  public static void q(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==0||j==n-1||i==n-1||i==j&&i>=n/2)
               {
                   System.out.print("q");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }       
    
  public static void r(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==n/2||i==0&&j>=n/2||j==n-1&&i<=n/2||i==n/2&&j>=n/2||i==j&&j>=n/2)
               {
                   System.out.print("R");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }         
    
  public static void s(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==0||j==0&&i<=n/2||i==n/2||j==n-1&&i>=n/2||i==n-1)
               {
                   System.out.print("S");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }            
    
  public static void t(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==0||j==n/2)
               {
                   System.out.print("T");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }               
    
  public static void u(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i==n-1||j==n-1)
               {
                   System.out.print("U");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }                 
    
   public static void v(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==j&&i<=n/2||i+j==n-1&&i<=n/2)
               {
                   System.out.print("V");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }                   
    
    public static void w(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(j==0||i+j==n-1&&i>=n/2||i==j&&i>=n/2||j==n-1)
               {
                   System.out.print("W");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }                   
    
   public static void x(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==j||i+j==n-1)
               {
                   System.out.print("X");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }                   
     
    
  public static void y(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==j&&i<=n/2||i+j==n-1&&i<=n/2||j==n/2&&i>=n/2)
               {
                   System.out.print("Y");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }                     
    public static void z(int n)
  {
      for(int i=0;i<=n;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==0||i+j==n-1||i==n-1)
               {
                   System.out.print("Z");
               }
           else
                   System.out.print(" ");
           }
       System.out.println();
       }
  
  }                     
    
   
    public static void main(String[] args) {
        System.out.println(" enter your name ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("\\s", "");
        String sl = s.toLowerCase();
     
        System.out.println("enter the size of pattern :");
        int n =sc.nextInt();
        int x=sl.length();
        
        
        for(int k=0;k<x;k++)
        {
            
            switch(sl.charAt(k))
            {
                case 'a':
               
                     NameWithPattern.a(n);
                     System.out.println();
                     System.out.print("");
                     
                    break;
                case 'b':
               
                     NameWithPattern.b(n);
                     System.out.println();
                     System.out.println();
                    break;
                case 'c':
               
                     NameWithPattern.c(n);
                     System.out.println();
                     System.out.println();
                    break;
                case 'd':
               
                     NameWithPattern.d(n);
                     System.out.println();
                     System.out.println();
                    break;
                case 'e':
               
                     NameWithPattern.e(n);
                     System.out.println();
                     System.out.println();
                    break;
                case 'f':
               
                     NameWithPattern.f(n);
                     System.out.println();
                     System.out.println();
                    break;
                case 'g':
               
                     NameWithPattern.g(n);
                     System.out.println();
                     System.out.println();
                    break;    
                case 'h':
               
                     NameWithPattern.h(n);
                     System.out.println();
                     System.out.println();
                 
                  break;  
                
                 case 'i':
               
                     NameWithPattern.i(n);
                     System.out.println();
                     System.out.println();
                    break;    
                         
                 case 'j':
               
                     NameWithPattern.j(n);
                     System.out.println();
                     System.out.println();
                    break;
                    
                case 'k':
               
                     NameWithPattern.k(n);
                     System.out.println();
                     System.out.println();
                    break;    
                    
                case 'l':
               
                     NameWithPattern.l(n);
                     System.out.println();
                     System.out.println();
                    break;  
                
                case 'm':
               
                     NameWithPattern.m(n);
                     System.out.println();
                     System.out.println();
                    break;  
               case 'n':
               
                     NameWithPattern.n(n);
                     System.out.println();
                     System.out.println();
                    break;      
                case 'o':
               
                     NameWithPattern.o(n);
                     System.out.println();
                     System.out.println();
                    break;      
                case 'p':
               
                     NameWithPattern.p(n);
                     System.out.println();
                     System.out.println();
                    break;   
                case 'q':
               
                     NameWithPattern.q(n);
                     System.out.println();
                     System.out.println();
                    break;   
                case 'r':
               
                     NameWithPattern.r(n);
                     System.out.println();
                     System.out.println();
                    break; 
                case 's':
               
                     NameWithPattern.s(n);
                     System.out.println();
                     System.out.println();
                    break; 
                case 't':
               
                     NameWithPattern.t(n);
                     System.out.println();
                     System.out.println();
                    break; 
            
                case 'u':
               
                     NameWithPattern.u(n);
                     System.out.println();
                     System.out.println();
                    break;   
                    
                case 'v':
               
                     NameWithPattern.v(n);
                     System.out.println();
                     System.out.println();
                    break; 
                case 'w':
               
                     NameWithPattern.w(n);
                     System.out.println();
                     System.out.println();
                    break; 
                case 'x':
               
                     NameWithPattern.x(n);
                     System.out.println();
                     System.out.println();
                    break;        
                case 'y':
               
                     NameWithPattern.y(n);
                     System.out.println();
                     System.out.println();
                    break; 
                case 'z':
               
                     NameWithPattern.z(n);
                     System.out.println();
                     System.out.println();
                    break;        
                default :
                    
                        
            
            
            
            
            
            
            
            }
        
       }

    
    
    }
}
    

