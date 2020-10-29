package 容器.Set接口;
/*
* java.utiL.set接extends collection接口set接口的特点:
1.不允许存储重复的元素
2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历java.utiL. Hashset集合implements set接口
Hashset特点:
1.不允许存储重复的元素
2.没有索引,没有带素引的方法,也不能使用普通的for循环遍历
3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
4.底层是一个哈希表结构(查询的速度非常的快)
*/
public class SetClass {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode()+" "+str2.hashCode());
    }
}
