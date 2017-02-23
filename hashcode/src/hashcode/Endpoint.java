package youtubeGame;

public class Endpoint {
	int NbrReqVid=0;
	int latVidFromServer=0;
	int latCache=0;
	int[] tabID;
	int nbrCacheConnected;
	
	public Endpoint(int latVidFromServer, int nbrCacheConnected){
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
		latence=Integer.parseInt(tabCache[1]);
		
		
	}
}
