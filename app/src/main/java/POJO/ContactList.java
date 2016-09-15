package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Mani on 9/10/2016.
 */
public class ContactList {

    public String contactName;
    public String contactNumber;

    public ContactList() {

    }
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}
