# 设计模式

## 策略模式
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
- Test
    - 测试代码

