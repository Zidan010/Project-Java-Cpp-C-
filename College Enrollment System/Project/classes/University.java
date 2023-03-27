
package classes;
import java.lang.*;
import java.util.*;
import java.io.*;
import interfaces.*;

public class University implements FacultyOperation,StudentOperation
{
	private Student student[] = new Student [100] ;
    private Faculty faculties[] = new Faculty [100]  ;
	
	//FacultyOperation
	
	
	
	
	
	
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
	
	
	
	public void setFaculty(Faculty e)
	{
		
	}
	
	int count1 = 0 ;
	public void insertFaculty(Faculty e,String name,String id)
	{
		
		
		for (int i = 0 ; i < faculties.length ; i++)
		{
			if(faculties[i] == null)
			{
				faculties[i] = e ;
				count1++ ;
				break ;
			}			
		}
		
		if(count1 == 0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("\t\t\t\t\t\t\t\t\t\t           Failed To Insert Faculty Data") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			System.out.println("\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("\t\t\t\t\t\t\t\t\tFaculty Data Inserted Successfully") ;
			System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			
			University r = new University();
			r.writeInFile("\t\tADDED FACULTY\nFaculty name-->"+name+" and id -->"+id+"\n") ;
		    r.readFromFile();
		}
	}
	
	/*public void removeFaculty(Faculty e)
	{
		int i ;
        for (i = 0 ; i < count1 ; i++)
		{
			if (faculties[i].getFId() == e.getFId()){	 
		    break;

		}
		
		else {
			System.out.println("\t\t\t\t\t\t\t\t\t\t Please try again!") ;
			
			
		}}*/
		
		
		public void removeFaculty(Faculty e)
	{
		int i ;
        for (i = 0 ; i < count1 ; i++)
		{
			if (faculties[i].getFId() == e.getFId())	 
		    break;

		}
	   
	    if (i == count1)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("\t\t\t\t\t\t\t\t\t\t                             No match!!!") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	
		else 
		{
			for (int j = i; j < count1 ; j++) 
			{
				faculties[j] = faculties[j + 1] ;
			}
			count1-- ; 
		    System.out.println("\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("\t\t\t\t\t\t\t\t\tFaculty Data Has Been Deleted !") ;
		    System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
	        University r1 = new University();
			r1.writeInFile("\t\tREMOVED FACULTY\nFaculty id --> "+e.getFId()+"\n") ;
		    r1.readFromFile();
        }
	
	}
	/*public void removeFaculty2(Faculty e)
	{
		int i ;
        for (i = 0 ; i < count1 ; i++)
		{
			if (faculties[i].getFId() != e.getFId()){

System.out.println("\t\t\t\t\t\t\t\t\t\t              No Match!") ;


				
	}}}*/
	
	public Faculty getFaculty (String fId)
	{
		int i = 0 ;
		
		Faculty f = null;
		
		if(count1 == 0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t              No Faculty Data Available") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		
		else
		{
			for (i = 0 ; i < count1 ; i++)
			{
				if(faculties[i] != null)
				{
					if(faculties[i].getFId().equals(fId))
					{
						f = faculties[i] ;
					    break ;
					}
				}
			}
		}	
	    return f ;
	}
	
	
	public void showAllFaculty()
	{
		if(count1 == 0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t                        No Data!") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;

		}
		else
		{
			for(int i = 0 ; i < count1 ; i++)
			{
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			    System.out.println("\n\t\t\t\t\t\t\t\t\t\tDetails of Faculty "+(i+1)+":") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\tFaculty Name:"+faculties[i].getName()) ;
		        System.out.println("\t\t\t\t\t\t\t\t\t\tFaculty ID :"+faculties[i].getFId()) ;
		        System.out.println("\t\t\t\t\t\t\t\t\t\tSalary:"+faculties[i].getSalary()) ;
			    System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    }
			
		}
	}
	
	
	
	
	
	
	//StudentOperation
	
	public void setStudent (Student s)
	{
		
	}
	
	
	
	int count2 = 0 ;
	public void insertStudent(Student s,String id,String name)
	{
		for (int i = 0 ; i < student.length ; i++)
		{
			if(student[i] == null)
			{
				student[i] = s ;
				count2++ ;
				break ;
			}			
		}
		
		if(count2 == 0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println ("\t\t\t\t\t\t\t\t\t\t          Failed To Insert Student Data") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			/*System.out.println("\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("\t\t\t\t\t\t\t\t\t            Student Data Inserted Successfully") ;
			System.out.println("\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			*/
			University r2 = new University();
			r2.writeInFile("\t\tADDED STUDENT\nStudent id :"+id+"  Name --> "+name+"\n") ;
	        r2.readFromFile();
		}
	}
	
	public void removeStudent(Student s)
	{
		int i ;
        for (i = 0 ; i < count2 ; i++)
		{
			if (student[i].getSid() == s.getSid())	 
		    break;

		}
	   
	    if (i == count2)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("\t\t\t\t\t\t\t\t\t\t                     No match!!!") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
	
		else 
		{
			for (int j = i; j < count2 ; j++) 
			{
				student[j] = student[j + 1] ;
			}
			count2-- ; 
		    System.out.println("\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
            System.out.println("\t\t\t\t\t\t\t\t\t     Student Data has been Deleted !") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
	        University r2 = new University();
			r2.writeInFile("\t\tREMOVED STUDENT\nSTUDENT id --> "+s.getSid()+"\n") ;
		    r2.readFromFile();

		 
        }
	
	}
	
	
	
	public Student getStudent (String sid)
	{
		int i = 0 ;
		
		Student s = null ;
		
		if(count2 == 0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t                  No Student Data Available") ;
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		}
		else
		{
			for (i = 0 ; i < count2 ; i++)
			{
				if(student[i] != null)
				{
					if(student[i].getSid().equals(sid))
					{
						s = student[i] ;
						break ;
					}
				}
			}
		 
		}
		return s ;
	}
	
	public void showAllStudents()
	{
		if(count2 == 0)
		{
			System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t                        No Data!") ;
		    System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;

		}
		else
		{
			for(int i = 0 ; i < count2 ; i++)
			{
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			    System.out.println("\n\t\t\t\t\t\t\t\t\t\tDetails of Student "+(i+1)+":") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\tStudent Name:"+student[i].getName()) ;
		        System.out.println("\t\t\t\t\t\t\t\t\t\tStudent ID :"+student[i].getSid()) ;
				student[i].showAllCourse() ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		    }
			
		}
	}
}




