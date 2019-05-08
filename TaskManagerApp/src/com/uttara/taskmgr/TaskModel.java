package com.uttara.taskmgr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskModel {
	
	public List<TaskBean> getTasks(String catName)
	{
		
		BufferedReader br = null;
		String line;
		try
		{
			List<TaskBean> tasks = new ArrayList<TaskBean>();
			TaskBean task;
			br = new BufferedReader(new FileReader(catName+".todo"));
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			while((line = br.readLine())!=null)
			{
				String[] sa=line.split(":");
				try {
					task = new TaskBean(sa[0],sa[1],sa[2],sdf.parse(sa[3]),Integer.parseInt(sa[4]));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
				tasks.add(task);
				
			}
			return tasks;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public String addTask(TaskBean task,String catName)
	{
		BufferedWriter bw = null;
		try
		{
			bw = new BufferedWriter(new FileWriter(catName+".todo",true));
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String plDt = sdf.format(d);
			bw.write(task.getTaskName()+":"+task.getDesc()+":"+task.getTags()+":"+plDt+":"+task.getPriority()+":"+d.getTime());
			bw.newLine();
			
			return Constants.SUCCESS;
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return "Ooops spmething bad happened , "+e.getMessage();
		}
		finally
		{
			if(bw!=null)
				try
			{
					bw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		// return catName;
	}

	/*private BufferedWriter BufferedWriter(FileWriter fileWriter) {
		// TODO Auto-generated method stub
		return null;
	}*/

	public String removeTask(TaskBean task,String catName)
	{
		FileReader fr = null;
		String line;
		try
		{
			//br = new BufferedReader(new FileReader(task);
			fr=new FileReader(catName+".todo");
			String x;
			
			
			return Constants.SUCCESS;
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return "Ooops spmething bad happened , "+e.getMessage();
		}
		finally
		{
			
		}
	}
	
	public boolean checkCategoryExists(String catName)
	{
		return new File(catName+".todo").exists();
	}
	
	public String removeCategory(String catName)
	{
		try
		{
			//https://www.geeksforgeeks.org/delete-file-using-java/
			Files.deleteIfExists(Paths.get("C:\\Users\\Chai\\eclipse-workspace\\TaskManagerApp\\"+catName+".todo"));
			return Constants.SUCCESS;
		}
	
        catch(IOException e) 
        { 
            e.printStackTrace();
            return "Could not delete the Category "+e.getMessage();
        } 
          
      } 
	
}
