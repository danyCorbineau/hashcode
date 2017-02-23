package hashcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Endpoint {
	int ID;
	int NbrReqVid=0;
	int latVidFromServer=0;
	int latCache=0;
	int[] tabID;
	int nbrCacheConnected;
	LinkedHashMap<Integer, Integer> cacheServer=new LinkedHashMap<Integer, Integer>();
	Map<Integer,Integer> requestedVid=new HashMap<Integer, Integer>();
	LinkedHashMap<Integer,Integer> sortedRequestedVid=new LinkedHashMap<Integer, Integer>();
	LinkedHashMap<Integer,Integer> sortedCacheServers=new LinkedHashMap<Integer, Integer>();


	
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
		System.out.println("data"+tabCache[0]+";"+tabCache[1]);
		tabCacheInt[0]=Integer.parseInt(tabCache[0].trim());
		tabCacheInt[1]=Integer.parseInt(tabCache[1].trim());
		cacheServer.put(tabCacheInt[0], tabCacheInt[1]);

	}
	public int getCacheConnected(){
		return this.nbrCacheConnected;
	}
	public void sortCacheLatency(){
		Map<Integer,Integer> sortedMap = new HashMap<Integer,Integer>();
		int min = 0;
		TreeSet<Integer> ts = new TreeSet<Integer>(cacheServer.values());
		for (int value : ts){
			for(int keyTemp : cacheServer.keySet()){
				int valueTemp = cacheServer.get(keyTemp);
				if( valueTemp == value){
					System.out.println(valueTemp);
					sortedCacheServers.put(keyTemp, valueTemp);
					continue;
				}
			}
		}
		for(int key : sortedCacheServers.keySet()){
			System.out.println("cacheSserver = "+key+" "+sortedCacheServers.get(key));
		}
		
		
		
		/*while(sortedMap.size()<cacheServer.size()){
			int[] tabTemp;//recup de la premiere valeur de la liste
			int tempMin=500;//mise de la latence max
			for(int i=0;i<cacheServer.size();i++){//test de la valeur minimale
				tabTemp=cacheServer.get(i);//recup du tableau de valeur 
				if(tabTemp[1]<tempMin){//si la latence est inférieure a la latence deja minimum
					min=i;//on dit que ce'st cette valeur qui est minimum
					tempMin=tabTemp[1];//on dit que la valeur minimum temporellement est cete latence
					sortedMap.put(tabTemp[0],tabTemp[1]);//on ajoute dans la map triée
					
					System.out.println(tabTemp[0]+" "+tabTemp[1]);
				}
				
			}
		}*/
	}
	public void nbrReqIDVid(int VidID, int nbrReq){
		requestedVid.put(VidID, nbrReq);
	}
	public void sortVidByReq(){//du plus au moins
	
		TreeSet<Integer> ts = new TreeSet<Integer>(requestedVid.values());
		for (int value : ts){
			for(int keyTemp : requestedVid.keySet()){
				int valueTemp = requestedVid.get(keyTemp);
				if( valueTemp == value){
					sortedRequestedVid.put(keyTemp, valueTemp);
					continue;
				}
			}
		}
	
		/*int temp=0;
		int idTemp=0;
		int numberOfRequestTemp=0;
		for(int i=0;i<requestedVid.size();i++){
			for(int id : requestedVid.keySet()){
				if(id == i){
					numberOfRequestTemp=requestedVid.get(id);
					if(numberOfRequestTemp > temp){
						temp = requestedVid.get(id);
						idTemp = id;
						System.out.println("bonjour mm idtemp"+idTemp);
					}
				}
			} 
			for(int id : requestedVid.keySet()){
				if(id == idTemp){
					sortedRequestedVid.put(idTemp, numberOfRequestTemp);
					//requestedVid.remove(idTemp);
				}
			}
		}*/
		
		
	for(int key : sortedRequestedVid.keySet()){
		System.out.println(key+" "+sortedRequestedVid.get(key));
	}
		
		
	}
}