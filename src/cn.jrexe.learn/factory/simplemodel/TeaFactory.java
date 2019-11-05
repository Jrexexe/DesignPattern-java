package cn.jrexe.learn.factory.simplemodel;

public class TeaFactory {

    public static AbstractTea getTea(String type) {
        AbstractTea abstractTea = null;
        switch (type) {
            case "wulong":
                abstractTea = new WuLongTea();
                break;
            case "red":
                abstractTea = new RedTea();
                break;
            default:
                abstractTea = new WuLongTea();
        }

        return abstractTea;
    }
}
