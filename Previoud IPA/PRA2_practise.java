import java.util.*;
class Artist{
    int artistId;
    String artistName;
    String genre;
    ArrayList<Album> albums;
    
    Artist(int artistId,String artistName,String genre,ArrayList<Album> albums){
        this.artistId=artistId;
        this.artistName=artistName;
        this.genre=genre;
        this.albums=albums;
    }
}
class Album{
    int albumId;
    String albumtitle;
    int releaseYear;
    
    Album(int albumId,String albumtitle,int releaseYear){
        this.albumId=albumId;
        this.albumtitle=albumtitle;
        this.releaseYear=releaseYear;
    }
}
public class PRA2_practise
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		ArrayList<Artist> artists=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int artistId=sc.nextInt();
		    sc.nextLine();
		    String artistName=sc.nextLine();
		    String genre=sc.nextLine();
		    ArrayList<Album> ls =new ArrayList<>();
		    int n=sc.nextInt();
		    for(int j=0;j<n;j++){
		        int a=sc.nextInt();
		        sc.nextLine();
		        String b=sc.nextLine();
		        int c=sc.nextInt();
		        sc.nextLine();
		        ls.add(new Album(a,b,c));
		    }
		    artists.add(new Artist(artistId,artistName,genre,ls));
		}
		int req_artist_id=sc.nextInt();
		int startYear=sc.nextInt();
		int endYear=sc.nextInt();
		sc.close();
		
		ArrayList<String> res=getAlbumByYearRange(artists,req_artist_id,startYear,endYear);
	    for(String s: res){
    	    System.out.println(s);
	    }
	    String res2=getGenreByMostAlbum(artists);
	    System.out.println(res2);
	}
	
	public static ArrayList<String> getAlbumByYearRange(ArrayList<Artist> artists,int req_artist_id,int startYear, int endYear){
	    ArrayList<String> temp=new ArrayList<>();
	    for(Artist a: artists){
	        if(a.artistId==req_artist_id){
	            for(Album b:a.albums){
                    if(b.releaseYear>startYear && b.releaseYear<endYear)
	                temp.add(b.albumtitle);
	            }
	        }
	    }
	    return temp;
	}
	
	public static String getGenreByMostAlbum(ArrayList<Artist> artists){
	    HashMap<String,Integer> map=new HashMap<>();
	    for(Artist a: artists){
	            if(map.containsKey(a.genre)){
	                map.put(a.genre,map.get(a.genre)+ a.albums.size());
	            }else{
	                map.put(a.genre,a.albums.size());
	            }
	    }
	    
	    int maxGenre= Collections.max(map.values());
	    String car="";
	    for(String s : map.keySet()){
	        if(map.get(s).equals(maxGenre))
	        {
	            car=s;
	            break;
	        }
	    }
	    return car;
	}
	
}



/*
 * Problem Statement:

Your task is to design a system to manage the records in a music library. The system should involve two classes: Artist and Album. An Artist can have multiple Albums. Your task is to implement a solution that will maintain a list of Album objects within the Artist class and perform specific operations.

Class Definitions:
Class Artist:

Attributes:

artistId: (int)
artistName: (String)
genre: (String)
albums: (List of Album objects)
Class Album:

Attributes:

albumId: (int)
albumTitle: (String)
releaseYear: (int)
Methods:
1. getAlbumsByYearRange()

This method retrieves all album titles released by a particular artist within a specified range of years (inclusive).

Parameters:

artists: List of Artist objects.
artistId: The ID of the artist for whom to retrieve albums.
startYear: The starting year of the range.
endYear: The ending year of the range.
Output:

Returns a list of album titles released within the specified year range.
If no albums are found within the range, print the message "No Albums Found in the Specified Year Range".
If no artist is found, print the message "Artist Not Found".
2. getGenresWithMostAlbums()

This method identifies and returns the genre that has the most albums released across all artists.

Parameters:

artists: List of Artist objects.
Output:

Returns the genre with the most albums.
If no albums are found, print the message "No Albums Found".
These methods should be called from the main method.

Sample Input 1:
3
201
Adele
Pop
3
1001
21
2011
1002
25
2015
1003
30
2021
202
Taylor Swift
Pop
2
1004
1989
2014
1005
Red
2012
203
Linkin Park
Rock
2
1006
Hybrid Theory
2000
1007
Meteora
2003
201
2010
2020
Sample Output 1:
21
25
Red
------------
Pop
------------
Sample Input 2:
2
301
Jazz
Sample Output 2:
Artist Not Found
No Albums Found
 */
