package 时间.DataClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
*    String format(Date date）按照指定的摸式，把Date日期，格式化为符合模式的字符神
     Date parse(String source）把符合模式的字符串，解析为Date日期
*/
public class DataclassPractice {
    public static void main(String[] args) throws ParseException {

          /*  useDateFormat2();
            useDateFormat1();*/

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        Long time = date.getTime() - dateFormat.parse("2000/11/27").getTime();
        double Time = (double)time/1000/60/60/24/365;
        System.out.println(Time+"  " +time);



    }
    public static void useDateFormat2() throws ParseException {
        /*
        使用DateFormat类中的方法parse,把文本解析为日期
        Date parse (string source）把符合模式的字符串,解析为Date日期
        使用步骤:
        1.创建simpLeDateFormat对象，构造方法中传递指定的模式
        2.调用simpleDateFormat对象中的方法parse,把将含杓造方法中模式的字符串，解析为Date日期
        注意:
       public Date_parse(String source) throws ParseException
                parse方法声明了一个异常叫parseException解析异常
        如果字符串和构造方法中的模式不一样，那么程序就会抛出此异常
        调用一个抛出了异常的方法,就必须的处理这个异常,要么throws继续声明抛出这一个异常,要么try...catch自己处理这个异常
                */

//1.创建simpLeDateFormat对象，构造方法中传递指定的模式
            SimpleDateFormat sdf = new SimpleDateFormat( "yyyy年MM月dd日HH时mm分ss-");
//2.调用simpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串,解析为Date日期
            Date date = sdf.parse(  "2088年08月08日17时01分10秒");
        System.out.println(date);
        }



    public static void useDateFormat1(){
        //1.创建SimpLeDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.调用SimpLeDateFormat对象中的方法format,按照构造方法中指定的模式
        // 把Date日期格式化为符合模式的字符串(文本)
        System.out.println("===================");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);
        System.out.println(text);
    }

}
