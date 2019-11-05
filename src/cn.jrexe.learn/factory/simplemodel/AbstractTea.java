package cn.jrexe.learn.factory.simplemodel;

/**
 * The type Abstract tea.
 */
public abstract class AbstractTea {
    protected String name;


    /**
     * Getter for property 'name'.
     *
     * @return Value for property 'name'.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for property 'name'.
     *
     * @param name Value to set for property 'name'.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Prepare.
     */
    public void prepare() {
        System.out.println("烧水----:" + this.getName());
    }

    public void taste() {
        System.out.println("品茶-----" + getName());
    }

    /**
     * 秘制设备-烘烤2分钟
     */
    public void fire() {
        System.out.println("泡茶----" + getName());
    }

}
