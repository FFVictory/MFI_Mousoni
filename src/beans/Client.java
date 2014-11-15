package beans;

import java.util.Date;

/**
 * Created by Sawa-Kvas on 15/11/2014.
 */
public class Client {

    Date date_of_birth;
    int status;
    String fullname;

    public Date GetDOB()
    {
        return date_of_birth;
    }

    public int GetStatus()
    {
        return status;
    }

    public String GetFullname()
    {
        return fullname;
    }

    public void SetDOB(Date DOB)
    {
        this.date_of_birth = DOB;
    }

    public void SetStatus(int status)
    {
        this.status = status;
    }

    public void SetFullName(String fullname)
    {
        this.fullname = fullname;
    }



}
