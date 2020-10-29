package 时间.CalendarClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
* Calendar类的成员方法:
public int get(int field): 返回给定日历字段的值。
public void set(int field, int value): 将给定的日历字段设置为给定值。
public abstract void add(int field, int amount): 根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public Date getTime(): 返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象。


*
* */
public class CalendarMethod {
    public static void main(String[] args) throws ParseException {
       method();
       Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
    }
    public static void method() throws ParseException {
        Date date = new Date();

        //使用SimpleFormat类的format()方法，将date对象转成模式字符串
        //格式化Data对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(dateFormat.format(date));


        //使用SimpleDateFormat类的parse()方法，将指定字符串转成Date对象
        //注意有异常抛出
        //解析字符串
        date = dateFormat.parse("1998年11月12日 14:26:00");
        System.out.println(date);

    }
}
