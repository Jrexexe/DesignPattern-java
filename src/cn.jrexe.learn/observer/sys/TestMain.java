package cn.jrexe.learn.observer.sys;

public class TestMain {
    public static void main(String[] args) {
        SubjectForRunTimeLog subjectForRunTimeLog = new SubjectForRunTimeLog();
        subjectForRunTimeLog.addObserver(new ObserverForLogRrecord());
        subjectForRunTimeLog.setMsg("sasa");

    }
}
