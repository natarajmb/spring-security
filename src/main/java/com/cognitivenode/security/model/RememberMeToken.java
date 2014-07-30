package com.cognitivenode.security.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Entity class to represent spring security remember me token
 *
 * @author nataraj.basappa
 * @version 1.0, 29/07/2014.
 */
@Entity
@Table(name = "persistent_logins")
public class RememberMeToken {

    @Id
    @Column(name = "SERIES", unique = true, nullable = false)
    private String series;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USERNAME")
    private User user;

    @Column(name = "TOKEN", nullable = false)
    private String token;

    @Column(name = "LAST_USED", nullable = false)
    private Date lastUsed;

    public RememberMeToken() {
        super();
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
    }
}
