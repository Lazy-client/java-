package 时间.CalendarClass;

import java.util.Calendar;

/*
* java.util.caLendar类:日历类
  calendar类是一个抽象类，里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
  calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了calendar类的子类对象
  static caLendar getInstance(）使用默认时区和语言环境获得一个日历。
*
*/
public class CalendarClass {
    public static void main(String[] args) {
       //Calendar是抽象类不能直接创建对象
        //有一个静态方法叫getInstance(),该方法返回了calendar类的子类
        Calendar calendar =Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);


        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println(month);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//      calendar.get(Calendar.DATE) =   calendar.get(Calendar.DAY_OF_MONTH)

    }
}


