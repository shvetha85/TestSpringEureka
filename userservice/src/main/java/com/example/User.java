package com.example;

import java.util.ArrayList;
import java.util.List;


public class User {

    private final long id;
    private final String forename;
   private final String surname;
    private final List<String> notifications;

    



	private String message="";
    //Friends are deprecated and should not be used

    public User(int id) {
    	
    	String message="Hello this is User";
        String[] forenames = {"Alice", "abc", "emerich", "Shvetha"};
      String[] surnames = {"Smith", "kalyan", "sidd", "renuka"};
        forename = forenames[id%3];
        surname = surnames[id%4];
        notifications= new ArrayList<>();
        notifications.add("You have been promoted!");
        notifications.add("this is calling web service in port 9001");
       this.message=message;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getForename() {
        return forename;
    }

 public String getSurname() {
        return surname;
    }

       public List<String> getNotifications() {
        return notifications;
    }

  
    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
