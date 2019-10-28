package cn.jrexe.learn.observer.sys;

public class TestMain {
    public static void main(String[] args) {
        SubjectForRunTimeLog subjectForRunTimeLog = new SubjectForRunTimeLog();

        SubjectForNetLog subjectForNetLog = new SubjectForNetLog();


        ObserverForLogRrecord observerForLogRrecord =  new ObserverForLogRrecord();

        subjectForRunTimeLog.addObserver(observerForLogRrecord);
        subjectForRunTimeLog.setMsg("sasa");
        subjectForNetLog.addObserver(observerForLogRrecord);
        subjectForNetLog.setMsg("ip error time out");

    }
}
