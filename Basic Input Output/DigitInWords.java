// find four digit number in words
// Ex. 1230 -> One Thousand Two Hundread Thirty

class Cwords
{ public static void main(String args[])
   { int no=(int)(Math.random()*10000);
      System.out.println(no);
      int a=no/1000;
      switch(a)
      {   case 1:
               	System.out.print("One ");
                break;
         
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break; 
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
          }
         if(no>1000)
               System.out.print("Thousand ");
         no=no%1000;
         a=no/100;
         switch(a)
         {  case 1:
               	System.out.print("One ");
                break;
             case 2:
                System.out.print("Two ");
                break;
             case 3:
                System.out.print("Three" );
                break;
             case 4:
                System.out.print("Four ");
                break;
             case 5:
                System.out.print("Five ");
                break;
             case 6:
                System.out.print("Six ");
                break; 
             case 7:
                System.out.print("Seven ");
                break;
             case 8:
                System.out.print("Eight ");
                break;
             case 9:
                System.out.print("Nine ");
                break;
         }
         if(no>=100)
            { System.out.print("Hundread "); }
         no=no%100;
         if(no<=10)
         { switch(no)
           { case 1:
               	System.out.print("One ");
                break;
             case 2:
                System.out.print("Two ");
                break;
             case 3:
                System.out.print("Three ");
                break;
             case 4:
                System.out.print("Four ");
                break;
             case 5:
                System.out.print("Five ");
                break;
             case 6:
                System.out.print("Six ");
                break; 
             case 7:
                System.out.print("Seven ");
                break;
             case 8:
                System.out.print("Eight ");
                break;
             case 9:
                System.out.print("Nine ");
                break;
             case 10:
                System.out.print("Ten ");
                break;
          }
        }
        else if(no>10 && no<20)  
        {  switch(no)
           { case 11:
               	  System.out.print("Eleven ");
                  break;
              case 12:
                  System.out.print("Twelve ");
                  break;
              case 13:
                  System.out.print("Thirteen" );
                  break;
              case 14:
                  System.out.print("Fourteen ");
                  break;
              case 15:
                  System.out.print("Fifteen ");
                  break;
              case 16:
                  System.out.print("Sixteen ");
                  break; 
              case 17:
                   System.out.print("Seventeen ");
                   break;
              case 18:
                   System.out.print("Eighteen ");
                   break;
              case 19:
                   System.out.print("Nineteen ");
                   break;
             }
          }
          else
          { a=no/10;
             no=no%10;
             switch(a)
            { case 2:
                  System.out.print("Twenty ");
                  break;
              case 3:
                  System.out.print("Thirty " );
                  break;
              case 4:
                  System.out.print("Forty ");
                  break;
              case 5:
                  System.out.print("Fifty ");
                  break;
              case 6:
                  System.out.print("Sixty ");
                  break; 
              case 7:
                  System.out.print("Seventy ");
                  break;
              case 8:
                  System.out.print("Eighty ");
                  break;
              case 9:
                  System.out.print("Ninety ");
                  break;
            }
         switch(no)
         { case 1:
               	System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three" );
                break;
           case 4:
                System.out.print("Four ");
                break;
           case 5:
                System.out.print("Five ");
                break;
           case 6:
                System.out.print("Six ");
                break; 
           case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            }
        }
     }
}
