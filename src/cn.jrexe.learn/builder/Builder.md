# 建造者模式
顾名思义，建站对象的模式，这里的建造不是普通建造，是建造复杂的对象

代码展示的是 构建两个快餐套餐对象，套餐是一个较为复制的对象，首先将套餐里面的商品进行抽象化


构建器（Builder）模式使用简单对象并使用逐步方法构建复杂对象。 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
构建器（Builder）模式构建器逐步构建最终对象，此构建器独立于其他对象。
实例实例我们考虑了一家快餐店的商业案例，其中典型的餐点可能是汉堡和冷饮。 汉堡可以是一个素食汉堡或鸡肉汉堡，将被包装进行包装。 冷饮可以是一个可乐或百事将装放在一个瓶子中。
我们将创建一个Item接口，表示食品项目，如汉堡包和冷饮料以及实现Item接口的具体类。还有一个包装接口，表示食品包装和实现包装接口的具体类，因为汉堡包装在包装和冷饮将包装成瓶子。
然后创建一个具有ItemListList和MealBuilder的Meal类，通过组合Item来构建不同类型的Meal对象。 BuilderPatternDemo这是一个演示类将使用MealBuilder构建一个食品套餐。


[原文链接](https://www.yiibai.com/design_pattern/builder_pattern.html)

