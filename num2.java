import java.io.*;
import java.util.*;
class num2
{
  public static void main(String args[])throws Exception
   {
    File file=new File("E:\\fileIo\\");
    boolean createNewFile=file.createNewFile(); 
    File[]listFiles=file.listfiles();
     for(File file3:listFiles)
     {
       if(file3.isFile())
        {
          System.out.println(file3.getName());
         }
     }
   }
}
       
 
