package family.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by yangboyu on 2018/2/9.
 */
public class Student {
    private int id;

    private String name;

    /**
     * 英语课时间表
     */
    private Schedule englishSchedule;

    /**
     * 数学课时间表
     */
    private Schedule mathSchedule;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.englishSchedule = createEnglishSchedule();
        this.mathSchedule = createMathSchedule();
    }

    private Schedule createEnglishSchedule() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Schedule.class);
        enhancer.setCallback(new ScheduleLazyLoader());
        return (Schedule) enhancer.create();
    }

    private Schedule createMathSchedule() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Schedule.class);
        enhancer.setCallback(new ScheduleDispatcher());
        return (Schedule) enhancer.create();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Schedule getEnglishSchedule() {
        return englishSchedule;
    }

    public void setEnglishSchedule(Schedule englishSchedule) {
        this.englishSchedule = englishSchedule;
    }

    public Schedule getMathSchedule() {
        return mathSchedule;
    }

    public void setMathSchedule(Schedule mathSchedule) {
        this.mathSchedule = mathSchedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}