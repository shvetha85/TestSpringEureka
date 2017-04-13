package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class UserView {

    private long id;
    private String forename;
    private String surname;
     private List<String> notifications;
	private String message;

    public UserView(){

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
