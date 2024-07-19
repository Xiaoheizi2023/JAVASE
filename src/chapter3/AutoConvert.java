package chapter3;

public class AutoConvert
{
    //编写一个main方法
    public static void main(String[] args)
    {
        //演示自动转换
        int num = 'a'; //ok char -> int
        double d1 = 80;  //ok int -> double
        System.out.println(num);//97
        System.out.println(d1);//80.0
    }
}
    /*
    Java数据类型转换
    java数据类型的转换一般分三种,分别是:
    一. 简单数据类型之间的转换
    在Java中整型、实型、字符型被视为简单数据类型，这些类型由低级到高级分别为
    (byte，short，char)–int–long–float–double
    简单数据类型之间的转换又可以分为：
    ●低级到高级的自动类型转换
    ●高级到低级的强制类型转换
    ●包装类过渡类型能够转换
    低级变量可以直接转换为高级变量，笔者称之为自动类型转换,例如，下面的语句可以在Java中直接通过：
    byte b;
    int i=b;
    long l=b;
    float f=b;
    double d=b;
    如果低级类型为char型，向高级类型（整型）转换时，会转换为对应ASCII码值，例如
    char c='c';
    int i=c;
    System.out.println("output:" i);
    输出：output:99;
    对于byte,short,char三种类型而言，他们是平级的，因此不能相互自动转换，可以使用下述的强制类型转换。
    short i=99;
    char c=(char)i;
    System.out.println("output:" c);
    输出：output:c;
    但根据笔者的经验，byte,short,int三种类型都是整型，因此如果操作整型数据时，最好统一使用int型。
    将高级变量转换为低级变量时，情况会复杂一些，你可以使用强制类型转换。即你必须采用下面这种语句格式：
    int i=99;
    byte b=(byte)i;
    char c=(char)i;
    float f=(float)i;
    可以想象，这种转换肯定可能会导致溢出或精度的下降，因此笔者并不推荐使用这种转换。
    1、float型转换为double型：
    float f1=100.00f;
    Float F1=new Float(f1);
    //F1.doubleValue()为Float类的返回double值型的方法
    double d1=F1.doubleValue();
    2、double型转换为int型：
    double d1=100.00;
    Double D1=new Double(d1);
    int i1=D1.intValue();
    3、int型转换为double型：
    int i1=200;
    double d1=i1;
    二. 字符串与其它数据类型的转换
    4、字符串与其它类型间的转换：
    ⑴其它类型向字符串的转换
    ①调用类的串转换方法:X.toString();
    ②自动转换:X+“”;
    ③使用String的方法:String.volueOf(X);
    ⑵字符串作为值,向其它类型的转换
    ①先转换成相应的封装器实例,再调用对应的方法转换成其它类型
    例如，字符中“32.1”转换double型的值的格式为**:new Float(“32.1”).doubleValue()**。
    也可以用:Double.valueOf(“32.1”).doubleValue()
    ②静态parseXXX方法
    String s = "1";
    byte b = Byte.parseByte( s );
    short t = Short.parseShort( s );
    int i = Integer.parseInt( s );
    long l = Long.parseLong( s );
    Float f = Float.parseFloat( s );
    Double d = Double.parseDouble( s );
    ③Character的**getNumericValue(char ch)**方法
    具体可查阅api。
    三. 其它实用数据类型转换
    5．Date类与其它数据类型的相互转换
    整型和Date类之间并不存在直接的对应关系，只是你可以使用int型为分别表示年、月、日、时、分、秒，这样就在两者之间建立了一个对应关系，在作这种转换时，你可以使用Date类构造函数的三种形式：
    ①Date(int year, int month, int date)：以int型表示年、月、日
    ②Date(int year, int month, int date, int hrs, int min)：以int型表示年、月、日、时、分
    ③Date(int year, int month, int date, int hrs, int min, int sec)：以int型表示年、月、日、时、 分、秒
    在长整型和Date类之间有一个很有趣的对应关系，就是将一个时间表示为距离格林尼治标准时间1970年1月1日0时0分0秒的毫秒数。对于这种对应关系，Date类也有其相应的构造函数：Date(long date)。
    获取Date类中的年、月、日、时、分、秒以及星期你可以使用Date类的getYear()、getMonth()、getDate()、getHours()、getMinutes()、getSeconds()、getDay()方法，你也可以将其理解为将Date类转换成int。
    而Date类的getTime()方法可以得到我们前面所说的一个时间对应的长整型数，与包装类一样，Date类也有一个toString()方法可以将其转换为String类。
    有时我们希望得到Date的特定格式，例如20020324，我们可以使用以下方法，首先在文件开始引入，
    import java.text.SimpleDateFormat;
    import java.util.*;
    java.util.Date date = new java.util.Date();
    //如果希望得到YYYYMMDD的格式
    SimpleDateFormat sy1=new SimpleDateFormat("yyyyMMDD");
    String dateFormat=sy1.format(date);
    //如果希望分开得到年，月，日
    SimpleDateFormat sy=new SimpleDateFormat("yyyy");
    SimpleDateFormat sm=new SimpleDateFormat("MM");
    SimpleDateFormat sd=new SimpleDateFormat("dd");
    String syear=sy.format(date);
    String smon=sm.format(date);
    String sday=sd.format(date);
    //js中将Data转换成String类型
    \* 对Date的扩展，将 Date 转化为指定格式的String
    \* 月(M)、日(d)、12小时(h)、24小时(H)、分(m)、秒(s)、周(E)、季度(q) 可以用 1-2 个占位符
    \* 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)
    \* eg:
    \* (new Date()).pattern("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423
    \* (new Date()).pattern("yyyy-MM-dd E HH:mm:ss") ==> 2009-03-10 二 20:09:04
    \* (new Date()).pattern("yyyy-MM-dd EE hh:mm:ss") ==> 2009-03-10 周二 08:09:04
    \* (new Date()).pattern("yyyy-MM-dd EEE hh:mm:ss") ==> 2009-03-10 星期二 08:09:04
    \* (new Date()).pattern("yyyy-M-d h:m:s.S") ==> 2006-7-2 8:9:4.
    6.字符型转时间型：（2005-10-1）
    reportdate_str ＝ “2005-10-01”；
    reportdate_str ＝ reportdate_str ＋ “ 00:00:00.0”
    reportdate = java.sql.Timestamp.valueOf(reportdate_str);
    7.时间型转字符型：
    V_DATE = reportdate.toString();
    8.将long型转化为String型
    long APP_UNIT = (long) userview.getDEPT_ID();
    String S_APP_UNIT = String.valeOf(APP_UNIT);
     */