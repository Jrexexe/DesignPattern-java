package cn.jrexe.learn.factory.simplemodel;

import java.util.Scanner;

public class TeaStore {
    public static void main(String[] args) {
        System.out.println("茶馆开门");
        System.out.println("我们有以下几种茶品。 乌龙 wulong , 红茶 red");
        Scanner scanner = new Scanner(System.in);
        String teaType = scanner.nextLine();
        AbstractTea tea = TeaFactory.getTea(teaType);
        tea.prepare();
        tea.fire();
        tea.taste();
        System.out.println("你获得一罐"+tea.getName());

    }
}
