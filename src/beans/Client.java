package beans;

import java.util.Date;

/**
 * Created by Sawa-Kvas on 15/11/2014.
 */
public class Client {

    Date dateOfBirth;
    int status;
    String fullName;
    int id;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Date getDob()
    {
        return dateOfBirth;
    }

    public int getStatus()
    {
        return status;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setDob(Date dateOfBirth)
    {
        this.dateOfBirth = DdateOfBirthOB;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

}
