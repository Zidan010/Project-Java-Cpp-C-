package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
import interfaces.*;

public class Course implements CourseTransaction
{
	private int courseNumber ;
	private int credit ;
	
	public void setCourseNumber(int courseNumber)
	{
		this.courseNumber = courseNumber ;
	}
	
    public void setCredit(int credit)
	{
		this.credit = credit ; 
	}
    public int getCourseNumber( )
	{
		return courseNumber ;
	}
	
    public int getCredit( )
	{
		return credit ;
	}
    public void showInfo( )
	{
		System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Number Of Courses : " + getCourseNumber() ) ;
	    System.out.println("\t\t\t\t\t\t\t\t\t\tTotat Number Of Credits : " + getCredit() ) ;
	}
	
	
	File file ; 
    
    private FileWriter writer ;
    private FileReader reader;
    private BufferedReader bfr;
    public void writeInFile(String s)
    {
        
        try
        {
            file = new File("Course log.txt"); 
            
            file.createNewFile();
            
            writer = new FileWriter(file, true); 
                            
            writer.write(s+"\r\n"); 
            writer.flush();
            writer.close();        
        
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace() ;

 

        }
    }

 

    public void readFromFile()
    {    
        try
        {
            reader = new FileReader(file);
            bfr = new BufferedReader(reader);//loop theke bahire ansi
            if(file.exists())
            {
                //bfr = new BufferedReader(reader);        
                String text =" ", temp=" ";//temp e faka string nisi                    
            
                while((temp=bfr.readLine()) != null)        
                {
                    text = text + temp+"\n"+"\r";            
                }
            
                System.out.println(text);                
                reader.close();
            }
            else
            {
                System.out.println("No entry yet!!");
            }                
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

	
	public void adding(int quantity,String id) 
	{
		if(quantity > 0)
		{
			System.out.println("\n\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
			credit = credit + quantity ;
			System.out.println("\t\t\t\t\t\t\t\t\tNumber Of Credits Added: " +credit) ;
			System.out.println("  \t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
			Course c = new Course();
			c.writeInFile("\n\t\t\t\t\t\t\t\t\t\tStudent of ID:"+id+" Added " +quantity+" credits.") ;
			c.readFromFile();
			
			
		}
		else
		{
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\tInvalid Amount Of Credit") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*") ;
		}
	}
	
	public void dropping(int quantity, String id) 
	{
		if(quantity > 0)
		{
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			credit = quantity ;
			System.out.println("\t\t\t\t\t\t\t\t\t\tNumber Of Credits Dropped: " +credit) ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			Course c = new Course();
			c.writeInFile("\n\t\t\t\t\t\t\t\t\t\tStudent of ID:"+id+" Dropped " +quantity+" credits.") ;
			c.readFromFile();
		}
		else
		{
				System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\tInvalid Amount Of Credits") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
		}
	}
}