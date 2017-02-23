package youtubeGame;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Endpoint {
	int ID;
	int NbrReqVid=0;
	int latVidFromServer=0;
	int latCache=0;
	int[] tabID;
	int nbrCacheConnected;
	Map<Integer,Integer> cacheServer=new HashMap<Integer, Integer>();
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
		System.out.println(tabCache[0]+";"+tabCache[1]);
		idCache=Integer.parseInt(tabCache[0].trim());
		latence=Integer.parseInt(tabCache[1].trim());
		cacheServer.put(idCache , latence);

	}
	public int getCacheConnected(){
		return this.nbrCacheConnected;
	}
	public void sortCacheLatency(){
		System.out.println(this.cacheServer);
	}
	public void nbrReqIDVid(int VidID, int nbrReq){
		cacheVid.put(VidID, nbrReq);
	}
}
