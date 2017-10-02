package stud.ft.dal;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class StepCount {

    @Id
    private Long id;
    private int stepsCount;

    @Unique
    private Date date;

    @Generated(hash = 1036099037)
    public StepCount(Long id, int stepsCount, Date date) {
        this.id = id;
        this.stepsCount = stepsCount;
        this.date = date;
    }

    @Generated(hash = 52020131)
    public StepCount() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setStepsCount(int count) {
        this.stepsCount = count;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
