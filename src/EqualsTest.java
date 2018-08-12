public class EqualsTest {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);//(turu)因为他们指向了同一个对象
        System.out.println(s1.equals(s2));//(turn)因为它俩指向了同一个对象，同一个对象当然值相等


        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s3==s4);//（false)因为它俩指向的是不同的对象
        System.out.println(s3.equals(s4));//(true）因为它俩指向的对象的值相等

        //总结
        //1、对于基本数据类型（也称原始数据类型，byte,short,char,int,long,float,double,boolean），“==”比较的是他们的值。“equals”不能用于基本数据类型，只能用于类变量。对于基本数据类型要用其包装类（如：Integer i1=new Integer(t1)）。
        //2、复合数据类型(类)

        //当他们用（==）进行比较的时候，比较的是他们在堆内存中的存放地址，所以，除非是同一个new出来的对象，他们的比较后的结果为true，否则比较后结果为false。equals用于比较两个对象是否相同。

        //1、Object类中的equals方法和“==”是一样的，没有区别，而String类，Integer类等等一些类，是重写了equals方法，才使得equals和“==不同”，所以，当自己创建类时，自动继承了Object的equals方法，要想实现不同的等于比较，必须重写equals方法。
        //2、”==”比”equal”运行速度快,因为”==”只是比较引用.

    }
}
