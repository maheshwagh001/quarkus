package org.cencora;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket extends PanacheEntityBase {
    @Id
    private Integer id;
    private String issue;
    private String raisedon;

    public Ticket(){}
    public Ticket(Integer id,String issue, String raisedon) {
        this.issue = issue;
        this.id = id;
        this.raisedon = raisedon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getRaisedon() {
        return raisedon;
    }

    public void setRaisedon(String raisedon) {
        this.raisedon = raisedon;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", issue='" + issue + '\'' +
                ", raisedon='" + raisedon + '\'' +
                '}';
    }
}
