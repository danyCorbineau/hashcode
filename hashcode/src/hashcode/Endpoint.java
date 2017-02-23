package youtubeGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Endpoint {
	int ID;
	int NbrReqVid=0;
	int latVidFromServer=0;
	int latCache=0;
	int[] tabID;
	int nbrCacheConnected;
	List<int[]> cacheServer=new ArrayList<int[]>();
	Map<Integer,Integer> cacheVid=new HashMap<Integer, Integer>();
;

	
	public Endpoint(int ID, int latVidFromServer, int nbrCacheConnected){
		this.ID=ID;
		this.latVidFromServer=latVidFromServer;
		this.nbrCacheConnected=nbrCacheConnected;
		tabID=new int[nbrCacheConnected];
		
	}
	
	public void ajouter(String lineCache){
		int idCache;
		int latence;
		String[] tabCache=lineCache.split(" ");
		int[] tabCacheInt = new int[2];
		System.out.println(tabCache[0]+";"+tabCache[1]);
		tabCacheInt[0]=Integer.parseInt(tabCache[0].trim());
		tabCacheInt[1]=Integer.parseInt(tabCache[1].trim());
		cacheServer.add(tabCacheInt);

	}
	public int getCacheConnected(){
		return this.nbrCacheConnected;
	}
	/*public void sortCacheLatency(){
		for(int i=0;i<cacheServer.size();i++){
			cacheServer.get
		}
	}*/
	public void nbrReqIDVid(int VidID, int nbrReq){
		//cacheVid.put(VidID, nbrReq);
	}
}
