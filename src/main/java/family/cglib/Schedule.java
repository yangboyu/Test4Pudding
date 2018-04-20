package family.cglib;

import java.util.Date;

/**
 * Created by yangboyu on 2018/2/9.
 */
public class Schedule {
    private String courseName;

    private Date courseTime;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }
}