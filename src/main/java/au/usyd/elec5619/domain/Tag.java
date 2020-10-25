package au.usyd.elec5619.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "Tag")
public class Tag implements Serializable {
    
    @Id
    private String id;

    @ManyToMany(mappedBy = "tags")
    private List<Article> articles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    } 
}
