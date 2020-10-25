package au.usyd.elec5619.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Article")
public class Article implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "source")
    private String source;

    @Column(name = "text")
    private String text;

    @Column(name = "audio_url")
    @NotNull
    private String audioUrl;

    @Column(name = "country")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_country", nullable = false)
    private Country country;

    public long getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public String getSource() {
        return source;
    }

    public String getText() {
        return text;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public Country getCountry() {
        return country;
    }

    public void setId(long id) {
        this.id = id;
    } 

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}