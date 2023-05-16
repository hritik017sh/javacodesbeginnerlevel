
package OperatorAndExpression_4;
import java.util.*;
public class pattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
//                                            ---Pattern 1---
//        ****
//        ****
//        ****
//        ****


//        int no=4;
//    for(int row=1;row<=no;row++)
//    {
//        for(int col=1;col<=no;col++)
//        {
//
//            System.out.print("*");
//
//        }
//        System.out.println("");
//
//    }



//                                   ---Pattern 2---
//        *
//        **
//        ***
//        ****
//        *****


//        int n=sc.nextInt();
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=1;col<=row;col++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }



//                                           ---Pattern 3---
//       1
//       12
//       123
//       1234
//       12345


//    int n=sc.nextInt();
//    for(int row=1;row<=n;row++)
//    {
//        for(int col=1;col<=row;col++)
//        {
//            System.out.print(col);
//        }
//        System.out.println();
//    }



//                                           ---Pattern 4---
//       1
//       22
//       333
//       4444
//       55555


//        int n=sc.nextInt();
//    for(int row=1;row<=n;row++)
//    {
//        for(int col=1;col<=row;col++)
//        {
//            System.out.print(row);
//        }
//        System.out.println();



//                                           ---Pattern 5---
//       *****
//       ****
//       ***
//       **
//       *


//             int n=sc.nextInt();
//             for(int row=1;row<=n;row++)
//             {
//                 for(int col=1;col<=n-row+1;col++)
//                 {
//                     System.out.print("*");
//
//                 }
//                 System.out.println("");
//             }




//                                           ---Pattern 6---
//       12345
//       1234
//       123
//       12
//       1


//        int n=sc.nextInt();
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=1;col<=n-row+1;col++)
//            {
//                System.out.print(col);
//            }
//            System.out.println("");
//        }




//                                           ---Pattern 7---
//        *
//       ***
//      *****
//     *******
//    *********


//        int no=5;
//        for(int row=0;row<no;row++)
//        {
//            for(int col=1;col<=no-row-1;col++)
//            {
//                System.out.print(" ");
//            }
//            for(int col=1;col<=2*row+1;col++)
//            {
//                System.out.print("*");
//            }
//            for(int col=1;col<=no-row-1;col++)
//            {
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//
//        }



        //                                           ---Pattern 8---
////       *********
//          *******
//           *****
//            ***
//             *


//        int n=5;
//        for(int row=0;row<n;row++)
//        {
//            for (int col=0;col<row;col++)
//            {
//                System.out.print(" ");
//            }
//            for(int col=0;col<2*n-(2*row+1);col++)
//            {
//                System.out.print("*");
//            }
//            for(int col=0;col<row;col++)
//            {
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }


//                                                  ---Pattern 9---
//             *
//            ***
//           *****
//          *******
//         *********
////       *********
//          *******
//           *****
//            ***
//             *


//        int n=5;
//        int space=n;
//        for(int row=0; row<n;row++)
//        {
//            for(int col=0;col<n-row-1;col++)
//            {
//                System.out.print(" ");
//            }
//            for(int col=0;col<2*row+1;col++)
//            {
//                System.out.print("*");
//            }
//            for(int col=0;col<n-row-1;col++)
//            {
//                System.out.print(" ");
//            }
//            System.out.println("");
//
//
//
//
//        }
//        for(int row=0; row<=space;row++)
//        {
//            for(int col=0;col<row;col++)
//            {
//                System.out.print(" ");
//            }
//            for(int col=0;col<2*space-(2*row+1);col++)
//            {
//                System.out.print("*");
//            }
//            for(int col=0;col<row;col++)
//            {
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }


        //                                           ---Pattern 8---
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//
//        int n=5;
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=1;col<=n-row;col++)
//            {
//                System.out.print(" ");
//            }
//            for(int p=1;p<=row;p++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }

//                                         ---Pattern 9---
//
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//
//         int n=6;
//         for(int row=1;row<=n;row++)
//         {
//             for(int col=1;col<row;col++)
//             {
//                 System.out.print(" ");
//             }
//             for(int p=row;p<=n;p++)
//             {
//                 System.out.print(p+" ");
//             }
//             System.out.println("");
//         }


//        int n=6;
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=1;col<=n-row;col++)
//            {
//                System.out.print(" ");
//            }
//            for(int p=1;p<=row;p++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println("");
//
//        }


//                                ---Pattern 10---
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *

//        int n=6;
//        for (int row=1;row<=n;row++)
//        {
//            for(int col=1;col<row;col++)
//            {
//                System.out.print(" ");
//
//            }
//            for(int col=1;col<n-row+1;col++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }

//                                         ---Pattern 11---
//         *****
//          ****
//           ***
//            **
//             *


//        int n=6;
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=1;col<=row;col++)
//            {
//                System.out.print(" ");
//            }
//            for(int p=1;p<n-row+1;p++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }


//       int n=6;
//       int num=0;
//      for(int row=n;row>=1;row--)
//      {
//          for(int col=n;col>=row;col--)
//          {
//              System.out.print(col +" ");
//
//          }
//          System.out.println("");
//       }


//        int n=6;
//        for(int row=1;row<=n;row++)
//        {
//            for(int col=row;col>=1;col--)
//            {
//                System.out.print( col+" ");
//            }
//            System.out.println(" ");
//        }






    }
}