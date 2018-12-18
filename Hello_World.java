/**<h1> HELLO WORLD </h1>
*<b>LeARnInG</b><br>
*<p></p>
*<b>How to start the project instructions:</b><br>
*<p></p>
*<b>User Instructions:<b/><br>
*<p></P>
*<br>
*@author Melanie
*@version 1
*@since 2018-12-11
*/
import java.io.*;

public class Hello_World
{
  /**<b>Class Description: Necessary Class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  /**<b>Method Description: Main, Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

      public int Hello_World(int numA, int numB)
      {
        return numA + numB;
      }
      public static void main(String args[])
      throws IOException
     {
       AddNum obj = new Hello_World();
       int sum= obj.Hello_World(10,20);

       System.out.println("\nSum of 10 and 20 is " + sum);
     }

    }

}
