package com.uttara.taskmgr;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		
		try {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int ch1=0,ch2=0;
		String catName,taskName,desc,tags,splDt;
		int priority;
		TaskModel model = new TaskModel();
		Logger.getInstance().log("Starting Task Manager");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //MM = months, mm = minutes :(
		
		
		
		while(ch1!=7)
		{
			System.out.println("Press 1 to create Category");
			System.out.println("Press 2 to load Category");
			System.out.println("Press 3 to remove Category");
			System.out.println("Press 4 to list Category");
			System.out.println("Press 5 to search Category");
			System.out.println("Press 6 to export Category");
			System.out.println("Press 7 to exit Category");
			
			ch1=sc1.nextInt();
			
			switch(ch1)
			{
			case 1: System.out.println("Creating category");
					System.out.println("Enter Category name");
					catName = sc2.nextLine();
					
					//first perform input validation
					while(TaskUtil.validateName(catName))
					{
						System.out.println("Category name invalid coz it must be single word, alphanumeric, so Enter the Category name again");
						catName = sc2.nextLine();
					}
					
					//then perform business validation
					//check if category name is unique
					
					// The below is actually biz validation done using fie system. 
					//File f = new File(catName+".todo"); where todo is the ext. each catname is file 
					//if(f.exists())
					//sop("duplicate, enter a new catname");
					//catName = sc2.nextLine();
					
					//but above is wrong coz file biz validn is model of MVC. v r in view. so open new class file called TaskModel
					
					if(model.checkCategoryExists(catName))
					{
						System.out.println("Duplicate catName, Enter a unique catName");
					}
					else
					{
						while(ch2!=6)
						{
							System.out.println("Press 1 to create task");
							System.out.println("Press 2 to update task");
							System.out.println("Press 3 to remove task");
							System.out.println("Press 4 to list task");
							System.out.println("Press 5 to search task");
							System.out.println("Press 6 to go back");
							
							ch2=sc1.nextInt();
							switch(ch2)
							{
							case 1: System.out.println("Creating task..."); // OR Logger.getInstance().log("creating task...");
							        System.out.println("Enter task name"); 
							        taskName = sc2.nextLine();
							        System.out.println("Enter description");
							        desc=sc2.nextLine();
							        System.out.println("Enter tags(comma separated)");
							        tags = sc2.nextLine();
							        System.out.println("Enter the planned end date(dd/mm/yyyy)");
							        splDt = sc2.nextLine();
							        System.out.println("Enter priority : 1 - very high, 10 - very low");
							        priority = sc1.nextInt();
							        
							        Date dt = sdf.parse(splDt);
							        TaskBean bean = new TaskBean(taskName,desc,tags,dt,priority);
							        String result = model.addTask(bean,catName);
							        if(result.equals(Constants.SUCCESS))
							        	System.out.println("Task "+taskName+" got added successfully");
							        else
							        	System.out.println("Task addition failed "+result);
							        break;
							        
							case 4: List<TaskBean> tasks = model.getTasks(catName);
									for(TaskBean task: tasks)
									{
										System.out.println("Name: "+task.getTaskName()+"Description: "+task.getDesc()+"Tags: "+task.getTags()+"Priority: "+task.getPriority()+"Planned end date: "+task.getPlannedDate());
									}
									 break;
							         
							case 6 :  System.out.println("Going back....");   
										break;
							}
							
						}
					}
					break;
					
			case 3: System.out.println("Enter the category name to be deleted");
					catName = sc2.nextLine();
					if(!(model.checkCategoryExists(catName)))
					{
						System.out.println("Category name does not exist, please enter a Category that exists");
					}
					else
					{
						
						String result = model.removeCategory(catName);
						if(result.equals(Constants.SUCCESS))
				        	System.out.println("Task "+catName+" was deleted successfully");
				        else
				        	System.out.println("Category deletion failed "+result);
						
					}
					
					
					break;
					
			case 7: System.out.println("Tata bye bye , miss you ..");
				   break;
			default:
				    System.out.println("Option not supported yet");
				    break;
			}
			
		}
		
	        }
		catch(Throwable t)
		{
			t.printStackTrace();
		}

}
}