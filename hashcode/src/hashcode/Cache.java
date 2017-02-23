package hashcode;

import java.awt.List;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Cache {
	ArrayList<Integer> videoId=new ArrayList<>();
	int limit;
	int id;
	
	
	public Cache(int lim,int id)
	{
		limit=lim;
		this.id=id;
	}
	
	public boolean addVideo(int video, int videoSize)
	{
		if(limit-videoSize>0)
		{
			videoId.add(video);
			limit-=videoSize;
			return true;
		}
		else
			return false;
	}
	
	public void write(PrintWriter writer)
	{
		if(videoId.size()>0)
		{
			writer.print(id+" ");
			for(int j=0;j<videoId.size();j++)
				writer.print(videoId.get(j)+" ");
			writer.println("");
		}
	}
	public boolean isUse()
	{
		return this.videoId.size()!=0;
	}
	

}
