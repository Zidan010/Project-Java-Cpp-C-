import java.lang.* ;
import java.util.* ;
import java.io.* ;
import classes.* ;
import interfaces.* ;
import java.io.IOException;

public class Start
{
	private University uni ;
	
	public Start()
	{
		uni = new University () ;
	}
public static void main(String args[])
	{
		
		Start s = new Start() ;
		
		System.out.println("") ;
		System.out.println("") ;

		Scanner input = new Scanner(System.in) ;
		int option = 0 ;
						
		System.out.println("\n\t\t\t\t\t\t\t\t///////////////////////////////////////////////////////////") ;
		System.out.println("\n\t\t\t\t\t\t\t\t              COLLEGE  ENROLLMENT  SYSTEM                  ") ;
		System.out.println("\n\t\t\t\t\t\t\t\t                           BY                              ") ;
		System.out.println("\n\t\t\t\t\t\t\t\t                   PSEUDO  PROGRAMMERS                     ") ;
		System.out.println("\n\t\t\t\t\t\t\t\t//////////////////////////////////////////////////////////") ;
		System.out.print("\n\n\n\t\t\t\t\t\t\t\tPRESS 1 TO PROCEED:   ") ;
	
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		if(option == 1)
		{
			System.out.println("\n\t\t\t\t/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////") ;
		    System.out.println("\n\t\t\t\t_____________________________ WELCOME  TO  AMERICAN  INTERNATIONAL  UNIVERSITY  BANGLADESH _____________________________") ;
	        System.out.println("\n\t\t\t\t////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////") ;
		
			s.main() ;
		}
		else 
		{  
	
	       for(option=0;option!=1;option++){
	       System.out.println("\n\t\t\t\t\t\t\t\t///////////////////////////////////////////////////////////") ;
		   System.out.println("\n\t\t\t\t\t\t\t\t              COLLEGE  ENROLLMENT  SYSTEM                  ") ;
		   System.out.println("\n\t\t\t\t\t\t\t\t                           BY                              ") ;
		   System.out.println("\n\t\t\t\t\t\t\t\t                   PSEUDO  PROGRAMMERS                     ") ;
		   System.out.println("\n\t\t\t\t\t\t\t\t//////////////////////////////////////////////////////////") ;
		   System.out.println("\n\n\t\t\t\t\t\t\t\t                     INVALID INPUT! ") ;
		   System.out.print("\n\n\n\t\t\t\t\t\t\t\t             PLEASE ENTER CORRECT PASSWORD   ") ;
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		   if(option == 1)
		   {
			   System.out.println("\n\t\t\t\t/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////") ;
		       System.out.println("\n\t\t\t\t_______________________________ WELCOME  TO  AMERICAN  INTERNATIONAL  UNIVERSITY  BANGLADESH _______________________________") ;
	           System.out.println("\n\t\t\t\t////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////") ;
		
			   s.main();
		   }
		   } 
		}
		clear();
		
			System.out.println("\n\n\n\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("\t\t\t\t\t\t             Thank You For Using the Program               ") ;
			System.out.println("\t\t\t\t\t\t                   Program Terminated                      ") ;
			System.out.println("\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
	
		
		
	}
		
		
		
		
		
		

        public static void clear()
        {
         try
         {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
         } catch (IOException | InterruptedException ex) {}
        }

		
		
	public void main()
	{
		
		Scanner input = new Scanner(System.in) ;
		int option = 0 ;
		
		System.out.println("") ;
		System.out.println("") ;
		
		System.out.println("\n\t\t\t\t\t\t\t\t___________________________________________________________") ;
		System.out.println("\n\t\t\t\t\t\t\t\t************************ MAIN MENU ************************") ;
		System.out.println("\t\t\t\t\t\t\t\t___________________________________________________________") ;
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
		System.out.println("\t\t\t\t\t\t\t\t\t             CHOOSE AN OPTION        ") ;
		System.out.println("\t\t\t\t\t\t\t\t\t    ______________________________________") ;
		System.out.println("                                                         ") ;
		System.out.println("\t\t\t\t\t\t\t\t\t   |   1 . ADMIN                          |") ;
		System.out.println("\n\t\t\t\t\t\t\t\t\t   |   2 . STUDENT  COURSE  TRANSACTION   |") ;
		System.out.println("\n\t\t\t\t\t\t\t\t\t   |   3 . EXIT                           |") ;
		System.out.println("\t\t\t\t\t\t\t\t\t    ______________________________________") ;
		System.out.println("\n\t\t\t\t\t\t\t\t\t    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
		System.out.println("") ;
	    System.out.println("") ;

        System.out.print("\t\t\t\t\t\t\t\t\t    OPTION: ") ;
	
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		
		
	
		
		if(option == 1)
		{
			
			System.out.print("\n\n\n\t\t\t\t\t\t\t            ENTER ADMIN PASSWORD :  ") ;
		
			
			try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		
		
			  if(option == 1010)
		   {
			   
		   
			
			
			
		System.out.println("\n\n\t\t\t\t\t\t\t\t_____________________________________________________") ;
		System.out.println("                                                         ") ;
		System.out.println("\t\t\t\t\t\t\t\t\t\t***** A D M I N ***** ") ;	
		System.out.println("\t\t\t\t\t\t\t\t_____________________________________________________") ;
	    System.out.println("\n\n\t\t\t\t\t\t\t\t-----------------------------------------------------") ;
        System.out.println("\t\t\t\t\t\t\t\t\t\t  CHOOSE AN OPTION         ") ;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t1. FACULTY                      ") ;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t2. STUDENT                      ") ;
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t3. BACK                         ") ;
		System.out.println("\t\t\t\t\t\t\t\t-----------------------------------------------------") ;
		
		System.out.println("") ;
	    System.out.println("") ;

		System.out.print("\t\t\t\t\t\t\t\tOPTION: ") ;
		
		

		try
		{
		 option = input.nextInt() ;
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
	}
	else{System.out.print("\n\t\t\t\t\t\t\tENTER CORRECT PASSWORED") ;  main();clear();}
		clear();
		if(option == 1)
		{
			
                int option1 = 0 ;		
				
				
				System.out.println("") ;
				System.out.println("") ;
				System.out.println("\n\t\t\t\t\t\t\t\t________________________________________________________") ;
		        System.out.println("                                                         ") ;
		        System.out.println("\t\t\t\t\t\t\t\t\t\t***** A D M I N ***** ") ;	
		        System.out.println("\t\t\t\t\t\t\t\t________________________________________________________") ;
				System.out.println("\n\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t    FACULTY  INFO                        ") ;
				System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\n\t\t\t\t\t\t\t\t--------------------------------------------------------") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t   CHOOSE AN OPTION") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t1. ADD NEW FACULTY") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t2. REMOVE EXISTING FACULTY") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t3. SHOW ALL FACULTY") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t4. BACK TO MAIN MENU") ;
				System.out.println("\t\t\t\t\t\t\t\t--------------------------------------------------------") ;
				
				System.out.print("\n\t\t\t\t\t\t\t\t\tOption:  ") ;

				try
				{
					option1 = input.nextInt() ;
				}
				catch(InputMismatchException i)
				{
					System.out.print(" ") ;
			        System.out.print("\n\t\t\t\t\t\t\t\t\t\tInvalid Input!") ;
				}
				clear();
				if(option1 == 1)
				{
					Faculty f1 = new Faculty() ;
					
					input.nextLine();
					System.out.println("\n\n\n\t\t\t\t\t\t\t\t  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				    System.out.println("\t\t\t\t\t\t\t\t\t\t      FACULTY  INFO                        ") ;
				    System.out.println("\t\t\t\t\t\t\t\t  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
					System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Faculty Name:  ") ;
					String name = input.nextLine() ;
					f1.setName(name) ;
					
					System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Faculty ID:  ") ;
					String fid = input.next() ;
					f1.setFId(fid) ;
					
					System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Faculty Salary:  ") ;
					double salary = input.nextDouble() ;
					f1.setSalary(salary) ;
					
					uni.insertFaculty(f1,name,fid) ;
					System.out.print("") ;
					
					System.out.print("") ;
				
				
		System.out.print("\n\n\n\t\t\t\t\t\t\t\t***____PRESS 1 TO GO BACK:___*** :   ") ;
		
		
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
				
		if(option == 1)
		   {
			   main();
		   }	
					
				}
				
				else if(option1 == 2)
				{
					
					System.out.println("") ;
		            System.out.println("") ;
					System.out.println("\n\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				    System.out.println("\t\t\t\t\t\t\t\t\t\t    FACULTY  INFO                        ") ;
				    System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
					System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Faculty ID You Want To Remove:  ") ;
					String fid2 = input.next() ;
					
					
					uni.removeFaculty(uni.getFaculty(fid2));
					//uni.removeFaculty2(uni.getFaculty(fid2));
					
					
					
							
		System.out.print("\n\n\n\t\t\t\t\t\t\t\t***____PRESS 1 TO GO BACK:___***:    ") ;
		
		
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
				
		if(option == 1)
		   {
			   main();
		   }	
			
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
				
				else if(option1 == 3)
				{
					System.out.println("") ;
		            System.out.println("") ;
					
					uni.showAllFaculty() ;
							
		System.out.print("\n\n\n\t\t\t\t\t\t\t\t***____PRESS 1 TO GO BACK:___***:    ") ;
		
		
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
				
		if(option == 1)
		   {
			   main();
		   }	
			
				}
				
				else if (option1 == 4)
				{
					main() ;clear();
				}
				
				else
				{
					 for(option=0;option!=4;option++){
			   System.out.print("\n\t\t\t\t\t\t\t\t\t\t     INVALID INPUT !!!") ;
		       System.out.print("\n\t\t\t\t\t\t\t\t\t\t   PLEASE ENTER 1 ,2 ,3 OR 4 ") ;
		       System.out.print("\n\t\t\t\t\t\t\t\t\t\t______________________________ ") ;
	           System.out.println("\n\t\t\t\t\t\t\t\t________________________________________________________") ;
		        System.out.println("                                                         ") ;
		        System.out.println("\t\t\t\t\t\t\t\t\t\t***** A D M I N ***** ") ;	
		        System.out.println("\t\t\t\t\t\t\t\t________________________________________________________") ;
				System.out.println("\n\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t    FACULTY  INFO                        ") ;
				System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\n\t\t\t\t\t\t\t\t--------------------------------------------------------") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t   CHOOSE AN OPTION") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t1. ADD NEW FACULTY") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t2. REMOVE EXISTING FACULTY") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t3. SHOW ALL FACULTY") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t4. BACK TO MAIN MENU") ;
				System.out.println("\t\t\t\t\t\t\t\t--------------------------------------------------------") ;
		       System.out.println("") ;
	           System.out.println("") ;

		       System.out.print("\t\t\t\t\t\t\t\tOPTION: ") ;
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		   if(option == 4)
		   {
			   main();
		   }
		   } 
					
				}
					
		}
		
		else if(option == 2)
		{
			
			    System.out.println("") ;
				System.out.println("") ;
                System.out.println("\n\t\t\t\t\t\t\t\t________________________________________________________") ;
		        System.out.println("                                                         ") ;
		        System.out.println("\t\t\t\t\t\t\t\t\t\t***** A D M I N ***** ") ;	
		        System.out.println("\t\t\t\t\t\t\t\t________________________________________________________") ;
			    System.out.println("\n\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t    STUDENT  INFO                        ") ;
				System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\n\t\t\t\t\t\t\t\t--------------------------------------------------------") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t   CHOOSE AN OPTION") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t1. ADD NEW STUDENT") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t2. REMOVE EXISTING STUDENT") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t3. SHOW ALL STUDENT") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t4. BACK TO MAIN MENU") ;
				System.out.println("\t\t\t\t\t\t\t\t--------------------------------------------------------") ;
				
				System.out.print("\n\t\t\t\t\t\t\t\t\tOption:  ") ;

				int option2 = 0 ;
				
				try
				{
					option2 = input.nextInt() ;
				}
				catch(InputMismatchException i)
				{
					System.out.print(" ") ;
			        System.out.print("Invalid Input!") ;
				}
								clear();

				if(option2 == 1)
                {
                    Student s1 = new Student() ;
                    input.nextLine();
                    System.out.println("") ;
                     System.out.println("") ;
                    System.out.println("\n\n\n\t\t\t\t\t\t\t\t  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
                    System.out.println("\t\t\t\t\t\t\t\t\t\t STUDENT   INFO                        ") ;
                    System.out.println("\t\t\t\t\t\t\t\t  -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
                    System.out.print("\n\t\t\t\t\t\t\t\t\tENTER STUDENT NAME :  ") ;
                    String name = input.nextLine() ;
                    s1.setName(name) ;
                   
                    System.out.print("\n\n\t\t\t\t\t\t\t\t\tENTER STUDENT ID:  ") ;
                    String sid = input.nextLine() ;
                    s1.setSid(sid) ;
                   
                    uni.insertStudent(s1,sid,name) ;
                   
                    Course c1 = new Course() ;
                   
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\tCOURSE DETAILS  ") ;
                   
                    System.out.print("\n\t\t\t\t\t\t\t\t\tENTER COURSE NUMBER:  ") ;
                    int cn = input.nextInt() ;
                    c1.setCourseNumber(cn) ;
                   
                    System.out.print("\n\t\t\t\t\t\t\t\t\tENTER TOTAL CREDIT: ") ;
                    int cr = input.nextInt() ;
                    c1.setCredit(cr) ;
                   
                    uni.getStudent(sid).insertCourse(c1) ;
                    		
		System.out.print("\n\n\n\t\t\t\t\t\t\t\t***____PRESS 1 TO GO BACK:___***:    ") ;
		
		
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
				
		if(option == 1)
		   {
			   main();
		   }	
			
					
					
					
					
					
					
                }
				
				else if(option2 == 2)
				{
					
		 			System.out.println("") ;
		            System.out.println("") ;
					System.out.println("\n\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				    System.out.println("\t\t\t\t\t\t\t\t\t\t       STUDENT  INFO                        ") ;
				    System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
					System.out.print("\n\t\t\t\t\t\t\t\t\tEnter Student ID You WANT TO REMOVE:  ") ;
					String sid2 = input.next() ;
					
					
					uni.removeStudent(uni.getStudent(sid2));
							
		System.out.print("\n\n\n\t\t\t\t\t\t\t\t***____PRESS 1 TO GO BACK:___*** :    ") ;
		
		
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
				
		if(option == 1)
		   {
			   main();
		   }	
			
					
					
					
					
				}
				
				else if(option2 == 3)
				{
					System.out.println("") ;
		            System.out.println("") ;
					
					uni.showAllStudents() ;
							
		System.out.print("\n\n\n\t\t\t\t\t\t\t\t***____PRESS 1 TO GO BACK:___***:   ") ;
		
		
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
				
		if(option == 1)
		   {
			   main();
		   }	
			
					
					
					
					
				}
				
				else if (option2 == 4)
				{
					main() ;clear();
				}
				
				else
				{
					 for(option=0;option!=4;option++){
			    System.out.print("\n\t\t\t\t\t\t\t\t\t\t     INVALID INPUT !!!") ;
		        System.out.print("\n\t\t\t\t\t\t\t\t\t\t   PLEASE ENTER 1 ,2 ,3 OR 4 ") ;
		        System.out.print("\n\t\t\t\t\t\t\t\t\t\t______________________________ ") ;
	            System.out.println("\n\t\t\t\t\t\t\t\t________________________________________________________") ;
		        System.out.println("                                                         ") ;
		        System.out.println("\t\t\t\t\t\t\t\t\t\t***** A D M I N ***** ") ;	
		        System.out.println("\t\t\t\t\t\t\t\t________________________________________________________") ;
				System.out.println("\n\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t    STUDENT  INFO                        ") ;
				System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\n\t\t\t\t\t\t\t\t--------------------------------------------------------") ;
				System.out.println("\t\t\t\t\t\t\t\t\t\t   CHOOSE AN OPTION") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t1. ADD NEW STUDENT") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t2. REMOVE EXISTING STUDENT") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t3. SHOW ALL STUDENT") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t\t4. BACK TO MAIN MENU") ;
				System.out.println("\t\t\t\t\t\t\t\t--------------------------------------------------------") ;
		       System.out.println("") ;
	           System.out.println("") ;

		       System.out.print("\t\t\t\t\t\t\t\tOPTION: ") ;
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		   if(option == 4)
		   {
			   main();
		   }
		   } 
					
				}
				
				
		}
	
		else if(option == 3)
				{
					
					main() ;				clear();

				}
			
        else 
		{  
	       for(option=0;option!=3;option++){
			   System.out.print("\n\t\t\t\t\t\t\t\t\t\t     INVALID INPUT !!!") ;
		       System.out.print("\n\t\t\t\t\t\t\t\t\t\t   PLEASE ENTER 1 ,2 OR 3 ") ;
		       System.out.print("\n\t\t\t\t\t\t\t\t\t\t_____________________________ ") ;
	           System.out.println("\n\n\t\t\t\t\t\t\t\t_____________________________________________________") ;
	           System.out.println("                                                         ") ;
		       System.out.println("\t\t\t\t\t\t\t\t\t\t***** A D M I N ***** ") ;	
		       System.out.println("\t\t\t\t\t\t\t\t_____________________________________________________") ;
	           System.out.println("\n\n\t\t\t\t\t\t\t\t-----------------------------------------------------") ;
               System.out.println("\t\t\t\t\t\t\t\t\t\t  CHOOSE AN OPTION         ") ;
	           System.out.println("\n\t\t\t\t\t\t\t\t\t\t1. FACULTY                      ") ;
		       System.out.println("\n\t\t\t\t\t\t\t\t\t\t2. STUDENT                      ") ;
		       System.out.println("\n\t\t\t\t\t\t\t\t\t\t3. BACK                         ") ;
		       System.out.println("\t\t\t\t\t\t\t\t-----------------------------------------------------") ;
		
		       System.out.println("") ;
	           System.out.println("") ;

		       System.out.print("\t\t\t\t\t\t\t\tOPTION: ") ;
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		   if(option == 3)
		   {
			   main();
		   }
		   } 
		}
			
		}
		
		else if(option == 2)
		{
			
			
			
			
			
			System.out.print("\n\t\t\t\t\t\t          ENTER STUDENT PASSWORD : ") ;

			try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}clear();
			
			if(option==2010)
			{
               int option3 = 0 ;		
				
				
				System.out.println("") ;
				System.out.println("\t\t\t\t\t\t\t\t____________________________________________________________") ;
				System.out.println("\n\t\t\t\t\t\t\t\t                COURSE TRANSACTION MENU") ;
				System.out.println("\t\t\t\t\t\t\t\t____________________________________________________________") ;
				System.out.println("\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t   CHOOSE AN OPTION") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t1. ADD COURSE") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t2. DROP COURSE") ;
				System.out.println("\n\t\t\t\t\t\t\t\t\t3. ABOUT SEMESTER") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t4. BACK TO MAIN MENU") ;
				System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				
				System.out.println("") ;
				System.out.println("") ;

				System.out.print("\n\t\t\t\t\t\t\t\tOption:   ") ;
		        
				Student s2 = new Student() ;
				Course c1 = new Course() ;
				
				
				try
				{
					option3 = input.nextInt() ;
				}
				catch(InputMismatchException i)
				{
					System.out.print(" ") ;
			        System.out.print("Invalid Input!") ;
				}
			clear();

				if(option3 == 1)
				{
					System.out.println("") ;
		            System.out.println("") ;
					System.out.println("\n\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				    System.out.println("\t\t\t\t\t\t\t\t\t\t       ADD COURSE                        ") ;
				    System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
					System.out.print("\n\t\t\t\t\t\t\t\tENTER STUDENT ID:  ") ;
					String sid3 = input.next();
				
					
					//System.out.println("Enter Course Number") ;
					//int cn = input.nextInt() ;
					
					
					System.out.print("\t\t\t\t\t\t\t\tENTER NUMBER OF CREDITS: ") ;
					int cr = input.nextInt() ;
											

						//c1.setCourseNumber(cn) ;
						c1.adding(cr,sid3) ;
					System.out.print("") ;
							
		System.out.print("\n\n\n\t\t\t\t\t\t\t\t***____PRESS 1 TO GO BACK:___*** :    ") ;
		
		
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
				
		if(option == 1)
		   {
			   main();
		   }	
			
				}
				
				else if(option3 == 2)
				{
					System.out.println("") ;
		            System.out.println("") ;
					System.out.println("\n\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				    System.out.println("\t\t\t\t\t\t\t\t\t\t       DROP COURSE                        ") ;
				    System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
					System.out.print("\n\t\t\t\t\t\t\t\tENTER STUDENT ID:  ") ;
					String sid4 = input.next() ;
				
					
					//System.out.println("Enter Course Number") ;
					//int cn1 = input.nextInt() ;
					
					
					System.out.print("\n\t\t\t\t\t\t\t\tENTER NUMBER OF CREDITS:  ") ;
					int cr1 = input.nextInt() ;
					
						//s2 = uni.getStudent(sid4) ;
						c1.dropping(cr1,sid4) ;
								//clear();
		
		System.out.print("\n\n\n\t\t\t\t\t\t\t\t***____PRESS 1 TO GO BACK:___*** :   ") ;
		
		
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
				
		if(option == 1)
		   {
			   main();
		   }	
				
	
	
	
	
				
					
				}
				
				else if(option3 == 3)
				{
					System.out.println("\n\t\t\t\t\t\t\t************************* SEMESTER INFO *************************") ;
					System.out.println("\n\n\t\t\t\t\t\t\t\tAMERICAN  INTERNATIONAL  UNIVERSITY  BANGLADESH") ;
					System.out.println("\t\t\t\t\t\t\t\t_______________________________________________") ;
					System.out.println("\t\t\t\t\t\t\t\t_____________CURRICULUM  COURSES_______________") ;
					System.out.println("\t\t\t\t\t\t\t\t***********************************************") ;
					System.out.println("\n\t\t\t\t   CURRICULUM NO _____309\tTITLE _____BECHELOR OF SCIENCE IN COMPUTER SCIENCE AND ENGINEERING") ;
					System.out.println("\t\t\t\t   -----------------------------------------------------------------------------------------------") ;
					System.out.println("\n\t\t\t////CODE////\t////////////////////// NAME ////////////////////// \t///// CREDIT /////\t/// PRE-REQUISITE /// ") ;
					System.out.println("\t\t\t************\t**************************************************\t******************\t*********************") ;
					System.out.println("\n\t\t\t MAT1102    \t  DIFFERENTIAL CALCULUS & CO-ORDINATE GEOMETRY    \t  3  0  0  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t PHY1101    \t                  PHYSICS 1                       \t  3  0  0  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t PHY1102    \t                PHYSICS 1 LAB                     \t  1  1  0  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t ENG1101    \t    ENGLISH READING SKILLS & PUBLIC SPEAKING      \t  3  0  0  1  0   \t        ...        ") ;
					System.out.println("\n\t\t\t CSC1102    \t         INTRODUCTION TO PROGRAMMING              \t  3  0  0  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t CSC1103    \t       INTRODUCTION TO PROGRAMMING LAB            \t  1  0  1  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t CSC1101    \t      INTRODUCTION  TO COMPUTER STUDIES           \t  1  0  1  0  0   \t        ...        ") ;
					System.out.println("\n") ;
					
					System.out.print(" Press 1 to go back: ") ;
	
		            try
		            {
		              option = input.nextInt() ; 
		            }
		            catch(InputMismatchException i)
		            {
		            	System.out.print(" ") ;
		            	System.out.print("Invalid Input!") ;
	            	}
	               	clear();
		
	             	 if(option == 1)
		             {
	    	           main() ;			
	                 }
					 else 
		             {  
	
	                  for(option=0;option!=1;option++){
                        System.out.println("\n\t\t\t\t\t\t\t************************* SEMESTER INFO *************************") ;
					System.out.println("\n\n\t\t\t\t\t\t\t\tAMERICAN  INTERNATIONAL  UNIVERSITY  BANGLADESH") ;
					System.out.println("\t\t\t\t\t\t\t\t_______________________________________________") ;
					System.out.println("\t\t\t\t\t\t\t\t_____________CURRICULUM  COURSES_______________") ;
					System.out.println("\t\t\t\t\t\t\t\t***********************************************") ;
					System.out.println("\n\t\t\t\t   CURRICULUM NO _____309\tTITLE _____BECHELOR OF SCIENCE IN COMPUTER SCIENCE AND ENGINEERING") ;
					System.out.println("\t\t\t\t   -----------------------------------------------------------------------------------------------") ;
					System.out.println("\n\t\t\t////CODE////\t////////////////////// NAME ////////////////////// \t///// CREDIT /////\t/// PRE-REQUISITE /// ") ;
					System.out.println("\t\t\t************\t**************************************************\t******************\t*********************") ;
					System.out.println("\n\t\t\t MAT1102    \t  DIFFERENTIAL CALCULUS & CO-ORDINATE GEOMETRY    \t  3  0  0  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t PHY1101    \t                  PHYSICS 1                       \t  3  0  0  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t PHY1102    \t                PHYSICS 1 LAB                     \t  1  1  0  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t ENG1101    \t    ENGLISH READING SKILLS & PUBLIC SPEAKING      \t  3  0  0  1  0   \t        ...        ") ;
					System.out.println("\n\t\t\t CSC1102    \t         INTRODUCTION TO PROGRAMMING              \t  3  0  0  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t CSC1103    \t       INTRODUCTION TO PROGRAMMING LAB            \t  1  0  1  0  0   \t        ...        ") ;
					System.out.println("\n\t\t\t CSC1101    \t      INTRODUCTION  TO COMPUTER STUDIES           \t  1  0  1  0  0   \t        ...        ") ;
					    System.out.println("\n") ;
						System.out.println("invalid input\nPress 1 to continue:  ") ;
		                try
		                {
		                 option = input.nextInt() ; 
		 
		                }
		                catch(InputMismatchException i)
	                 	{
		                	System.out.print(" ") ;
			                System.out.print("Invalid Input!") ;
		                }
		                clear();
					 if(option == 1)
		             {
	    	           main() ;			
	                 }
				    }
					 }
				}
				else if(option3 == 4)
				{
					
					main() ;clear();				

				}
				
				
				
				else
				{
					for(option=0;option!=3;option++){
			   System.out.print("\n\t\t\t\t\t\t\t\t\t\t     INVALID INPUT !!!") ;
		       System.out.print("\n\t\t\t\t\t\t\t\t\t\t   PLEASE ENTER 1 ,2 ,3or4 ") ;
		       System.out.print("\n\t\t\t\t\t\t\t\t\t\t_____________________________ ") ;
	           System.out.println("\t\t\t\t\t\t\t\t____________________________________________________________") ;
				System.out.println("\n\t\t\t\t\t\t\t\t                COURSE TRANSACTION MENU") ;
				System.out.println("\t\t\t\t\t\t\t\t____________________________________________________________") ;
				System.out.println("\n\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
				System.out.println("\n\t\t\t\t\t\t\t\t\t\t   CHOOSE AN OPTION") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t1. ADD COURSE") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t2. DROP COURSE") ;
				System.out.println("\n\t\t\t\t\t\t\t\t\t3. ABOUT SEMESTER") ;
		        System.out.println("\n\t\t\t\t\t\t\t\t\t4. BACK TO MAIN MENU") ;
				System.out.println("\t\t\t\t\t\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
		
		       System.out.println("") ;
	           System.out.println("") ;

		       System.out.print("\t\t\t\t\t\t\t\tOPTION: ") ;
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		   if(option == 4)
		   {
			   main();
		   }
		   } 

				}
			}else{
				System.out.print("\\n\t\t\t\t\t\t\t\t\t\tENTER CORRECT PASSWORD\n ") ;
				main();clear();}
		}
	
		else if(option == 3)
		{
			System.out.println("") ;
		    System.out.println("") ;
			
			System.out.println("\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			System.out.println("\t\t\t             Thank You For Using the Program               ") ;
			System.out.println("\t\t\t                   Program Terminated                      ") ;
			System.out.println("\t\t\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		
		}
		
		else
		{ 
	
	       for(option=0;option!=3;option++){
		   System.out.print("\n\t\t\t\t\t\t\t\t\t\t     INVALID INPUT !!!") ;
		   System.out.print("\n\t\t\t\t\t\t\t\t\t\t   PLEASE ENTER 1 ,2 OR 3 ") ;
		   System.out.print("\n\t\t\t\t\t\t\t\t\t\t_____________________________ ") ;
		   System.out.print("") ;
	       main();
		try
		{
		 option = input.nextInt() ; 
		 
		}
		catch(InputMismatchException i)
		{
			System.out.print(" ") ;
			System.out.print("Invalid Input!") ;
		}
		clear();
		   
	    } 
		    System.out.println("");
            System.out.println("");
			
		    System.out.println("Option Entered Is Not Valid.");
		    System.out.println("Choose Between 1 to 3!");
		    main();				

		}
	

	}
	
}











