package hashcode;

import java.awt.List;
import java.util.ArrayList;

public class Cache {
	ArrayList<Integer> videoId=new ArrayList<>();
	int limit;
	
	
	public Cache(int lim)
	{
		limit=lim;
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
	
	

}
