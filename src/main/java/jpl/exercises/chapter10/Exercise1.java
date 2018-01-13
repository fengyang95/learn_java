package jpl.exercises.chapter10;

import java.util.Calendar;

class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(){
        Calendar calendar=Calendar.getInstance();
        hour=calendar.get(Calendar.HOUR);
        minute=calendar.get(Calendar.MINUTE);
        second=calendar.get(Calendar.SECOND);
    }

    public Time(long currentTimeMillion){
        long totalSecond=currentTimeMillion/1000;
        second=(int)(totalSecond%60);
        minute=(int)((totalSecond-second)/60%60);
        hour=(int)((totalSecond-second-minute*60)/3600%24);
    }

    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setTime(long elapseTime){
        long totalSecond=elapseTime/1000;
        second=(int)(totalSecond%60);
        minute=(int)((totalSecond-second)/60%60);
        hour=(int)((totalSecond-second-minute*60)/3600);
    }
}
public class Exercise1 {
    public static void printTimeInfo(Time time){
        System.out.println(String.format("hour: %d; minute: %d; second: %d",time.getHour(),time.getMinute(),time.getSecond()));
    }

    public static void main(String[] args){
        Time time1=new Time();
        Time time2=new Time(System.currentTimeMillis());
        Time time3=new Time(555550000);
        printTimeInfo(time1);
        printTimeInfo(time2);
        printTimeInfo(time3);
    }
}
