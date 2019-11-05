package cn.jrexe.learn.singleton;

import cn.jrexe.learn.singleton.inlineclass.InlineClassSingle;
import cn.jrexe.learn.singleton.thread_safety_lazy.SingletTSLazey;

public class SingleObjectDemo {
    public static void main(String[] args) {
        InlineClassSingle single = InlineClassSingle.getInstance();
        single.massage();
        InlineClassSingle single2 = InlineClassSingle.getInstance();
        single2.massage();


        SingletTSLazey singletTSLazey = SingletTSLazey.getInstance();


        System.out.println(singletTSLazey.toString());
        System.out.println(SingletTSLazey.getInstance().toString());
        System.out.println(SingletTSLazey.getInstance().toString());
        System.out.println(SingletTSLazey.getInstance().toString());
        System.out.println(SingletTSLazey.getInstance().toString());

    }
}
