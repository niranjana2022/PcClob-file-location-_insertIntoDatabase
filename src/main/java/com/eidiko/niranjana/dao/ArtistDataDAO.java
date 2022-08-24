package com.eidiko.niranjana.dao;


public interface ArtistDataDAO {
	//insert into DB and return type is String
	public String insertArtistDataInDB(Integer id,String name,String addrs,String fileLocation);
	
}
