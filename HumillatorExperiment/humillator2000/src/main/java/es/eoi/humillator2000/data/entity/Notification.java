package es.eoi.humillator2000.data.entity;

import javax.persistence.*;

@Entity
public class Notification implements IEntity<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Como hago para que notifique?? hilo en ejecucion - libreria de avisos?
    @Column(nullable = false)
    private Integer minutes;

    private Boolean isNotifyed;

    @ManyToOne
    private UserHasMatch userHasMatch;

    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Boolean getNotifyed() {
        return isNotifyed;
    }

    public void setNotifyed(Boolean notifyed) {
        isNotifyed = notifyed;
    }

    public UserHasMatch getUserHasMatch() {
        return userHasMatch;
    }

    public void setUserHasMatch(UserHasMatch userHasMatch) {
        this.userHasMatch = userHasMatch;
    }
}
