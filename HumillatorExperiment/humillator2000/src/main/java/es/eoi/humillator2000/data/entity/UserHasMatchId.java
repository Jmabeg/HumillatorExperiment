package es.eoi.humillator2000.data.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserHasMatchId implements Serializable {
    private static final long serialVersionUID = 2742452792947774020L;
    private Integer userId;
    private Integer matchId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserHasMatchId)) return false;
        UserHasMatchId that = (UserHasMatchId) o;
        return Objects.equals(getUserId(), that.getUserId()) && Objects.equals(getMatchId(), that.getMatchId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getMatchId());
    }
}