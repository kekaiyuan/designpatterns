# 设计模式

## 单例singleton
- Mgr01：饿汉式
- Mgr02：与Mgr01一样，只是写法略有不同
- Mgr03：懒汉式，多线程时无法实现单例
- Mgr04：Mgr03的改进，实现线程同步，但是效率会下降
- Mgr05：Mgr04的改进，尝试减小同步代码块，结果不可行。<br>
  注意：不可行!
- Mgr06：Mgr05的改进，双重检查
- Mgr07：静态内部类方式
- Mgr08：枚举方式

## 策略strategy
- 策略一：将猫根据体重升序排序
- 策略二：将猫根据身高降序排序
- 策略三：将狗按照食量升序排序
- ComparatorContext
    - Context上下文角色，也叫Context封装角色，起承上启下的作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
- Comparator
    - 抽象策略角色，是对策略、算法家族的抽象，通常为接口，定义每个策略或算法必须具有的方法和属性。
- CatHeightComparator、CatWeightComparator、DogComparator
    - 具体策略角色，用于实现抽象策略中的操作，即实现具体的算法。
- Sorter
    - 根据不同的策略进行排序
- Main
    - 程序入口
  
## 观察者observer
模板


