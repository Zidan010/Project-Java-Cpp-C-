 package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
import interfaces.*;

public class Student implements CourseOperation
{
	private String name ;
    private String sid ;
    private Course courses[] = new Course [100] ;
	
    public void setName(String name)
	{
		this.name = name ;
	}

    public void setSid(String sid)
	{
		this.sid = sid ;
	}
    public String getName( )
	{
		return name ;
	}
    public String getSid( )
	{
		return sid ;
	}
	
	//CourseOperation
	
	
	
	
	
	
	
	
	
	
	
	File file ; 
    
    private FileWriter writer ;
    private FileReader reader;
    private BufferedReader bfr;
    public void writeInFile(String s)
    {
        
        try
        {
            file = new File("Admin.txt"); 
            
            file.createNewFile();
            
            FileWriter writer = new FileWriter(file, true); 
                            
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
            FileReader reader = new FileReader(file);
            BufferedReader bfr = new BufferedReader(reader);//loop theke bahire ansi
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	int count = 0 ;
	public void insertCourse(Course c)
	{
		for (int i = 0 ; i < courses.length ; i++)
		{
			if(courses[i] == null)
			{
				courses[i] = c ;
				count++ ;
				break ;
			}			
		}
		
		if(count == 0)
		{
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("Failed To Insert Course Data") ;
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("\t\t\t\t\t\t\t\t       Student Data Inserted Successfully") ;
			System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			
						
			Student st = new Student();
			st.writeInFile("COURSE-->"+c.getCourseNumber()+" AND CREDIT -->"+c.getCredit()+"  ADDED\n") ;
		    st.readFromFile();
		}
	}
	
	public void removeCourse(Course c) 
	{
		int i ;
        for (i = 0 ; i < count ; i++)
		{
			if (courses[i].getCourseNumber() == c.getCourseNumber())	 
		    break;

		}
	   
	    if (i == count)
		{
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-") ;
            System.out.println("\t\t\t\t\t\t\t\t\t\tNo match!!!") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-") ;
		}
	
		else 
		{
			for (int j = i; j < count ; j++) 
			{
				courses[j] = courses[j + 1] ;
			}
			count-- ; 
		    System.out.println("\n\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("\t\t\t\t\t\t\t\t\t\tCourse Has Been Deleted !") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			Student st = new Student();
			st.writeInFile("COURSE-->"+c.getCourseNumber()+" AND CREDIT -->"+c.getCredit()+"  ADDED\n") ;
		    st.readFromFile();
	
		 
        }
	
    }
	
	public Course getCourse(int CourseNumber)
	{
		int i = 0 ;
		
		Course c = null ;
		
		if(count == 0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\tNo Course Data Available") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*") ;
		}
		else
		{
			for (i = 0 ; i < count ; i++)
			{
				if(courses[i] != null)
				{
					if(courses[i].getCourseNumber() == CourseNumber)
					{
						c = courses[i] ;
						break ;
					}
				}
			}
		 
		}
		return c ;
	}
	
	
	public void showAllCourse()
	{
		
		if(count == 0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\tNo Data!") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*") ;

		}
		else
		{
			for(int i = 0 ; i < count ; i++)
			{
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
			    System.out.println("\t\t\t\t\t\t\t\t\t\tDetails of Course: ") ;
				courses[i].showInfo() ;
			   // System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
		    }
			
		}
	}

}