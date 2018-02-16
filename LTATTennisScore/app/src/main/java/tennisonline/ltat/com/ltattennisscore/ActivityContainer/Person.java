package tennisonline.ltat.com.ltattennisscore.ActivityContainer;

import java.io.Serializable;

/**
 * Created by HARSHIT on 10-Feb-18.
 */

public class Person implements Serializable {

    int srno;
    String tournament_name1;
    String address1;
    String full_name1;
    String last_name1;


    public Person(int srno, String tournament_name1, String address1, String full_name1, String last_name1) {
        this.srno = srno;
        this.tournament_name1 = tournament_name1;
        this.address1 = address1;
        this.full_name1 = full_name1;
        this.last_name1 = last_name1;
    }

    public int getSrno() {
        return srno;
    }

    public void setSrno(int srno) {
        this.srno = srno;
    }

    public String getTournament_name1() {
        return tournament_name1;
    }

    public void setTournament_name1(String tournament_name1) {
        this.tournament_name1 = tournament_name1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getFull_name1() {
        return full_name1;
    }

    public void setFull_name1(String full_name1) {
        this.full_name1 = full_name1;
    }

    public String getLast_name1() {
        return last_name1;
    }

    public void setLast_name1(String last_name1) {
        this.last_name1 = last_name1;
    }
}
