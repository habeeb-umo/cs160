// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class Music {
    private String songTitle;
    private String albumName;
    private String artistName;
    private int releaseYear;

    
    public Music(String title, String album, String artist, int year){}
    	
        public String getTitle() {
			return songTitle; 
			}
        public String getAlbum() {
			return albumName; 
			}
        public String getArtist() {
			return artistName; 
			}
        public int getYear() {
			return releaseYear;
			}
        public String toString(String title, String album, String artist, int year) {
        	String infoTag = title + ", " + album + ", " + artist + ", " + year; 
        	return infoTag;
        	}	
        public double getPrice(int year){
        	double price = 0.0;
        	if(year < 1970){
        		price = 1.29;
        	}
        	if(year <= 1979 && year >= 1970){
        		price = 1.89;
        	}
        	if(year <= 1989 && year >= 1980){
        		price = .69;
        	}
        	if(year <= 1999 && year >= 1990){
        		price = .99;
        	}
        	if(year <= 2009 && year >= 2000){
        		price = 1.39;
        	}
        	if(year >= 2010){
        		price = .59;
        	}
        	return price;
        }
}
