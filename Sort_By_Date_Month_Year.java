

import java.lang.Math;
import java.util.*;


public class Design {
    int date;
    int month;
    int year;
    Design(int date,int month,int year){
       
        this.date=date;
        this.month=month;
        this.year=year;
    }
    public int getDate(){return date;}
    public int getMonth(){return month;}
    public int getYear(){return year;}


public static Comparator<Design> Year=new Comparator<Design>(){
    public int compare(Design d1,Design d2){
        return d1.getYear()-d2.getYear();
    }
  };
  public String toString(){
    System.out.println();
      return "Date: "+this.date+" Month: "+this.month+" Year: "+this.year+" \n";
  }
}
public class SortDateMonthYear implements Comparator<Design>{
  public int compare(Design d1,Design d2){
      
    if(d1.getYear()!=d2.getYear())
        return d1.getYear()-d2.getYear();
    else if(d1.getMonth()!=d1.getMonth())
        return d1.getMonth()-d2.getMonth();
       
      return d1.getDate()-d2.getDate();
  
  }
}

public class HelloWorld  {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
      
        Design[] d=new Design[3];
        /*for(int i=0;i<3;i++){
            d[i]=new Design(s.nextInt(),s.nextInt(),s.nextInt());
        }*/
      
        d[0]=new Design(24,6,1996);
        d[1]=new Design(3,5,1998);
        d[2]=new Design(5,6,1996);
        Arrays.sort(d,Design.Year);
        System.out.println(Arrays.toString(d));
      Arrays.sort(d,new SortDateMonthYear());
      System.out.println(Arrays.toString(d));
    }
}




