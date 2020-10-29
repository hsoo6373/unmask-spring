package au.usyd.elec5619.domain;


import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "User")
public class User implements Serializable {

    @GeneratedValue
    @Column(nullable = false,unique = true)
    private long id;

    @Id
    @Column(nullable = false,unique = true)
    private String username;

    @NotNull
    private String salt;

    @NotNull
    private String password ;


    private String email;


    @ManyToMany(mappedBy = "likes")
    private List<Article> likedArticle;

    @ManyToMany(mappedBy = "wasRead")
    private List<Article> readHistory;



    public User(){

    }
    public User(String username, String password,String email){
        super();
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public User(String username, String salt, String password,String email){
        super();
        this.username = username;
        this.salt = salt;
        this.password = password;
        this.email = email;
    }

    public List<Article> getLikedArticle() {
        return likedArticle;
    }


    public void setLikedArticle(List<Article> likedArticle) {
        this.likedArticle = likedArticle;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Article> getReadHistory() {
        return readHistory;
    }

    public void setReadHistory(List<Article> readHistory) {
        this.readHistory = readHistory;
    }

}