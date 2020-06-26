package placement;



//Given an array of strings dates[], the task is to sort these dates in ascending order.
//Note: Each date is of the form dd mmm yyyy where:
//
//Domain of dd is [0-31].
//Domain of mmm is [Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec].
//And, yyyy is a four digit integer.
//Examples:
//
//Input: dates[] = {“01 Mar 2015”, “11 Apr 1996”, “22 Oct 2007”}
//Output:
//11 Apr 1996
//22 Oct 2007
//01 Mar 2015
//
//Input: dates[] = {“03 Jan 2018”, “02 Jan 2018”, “04 Jan 2017”}
//Output:
//04 Jan 2017
//02 Jan 2018
//03 Jan 2018

import java.util.*;


public class SortDates {


    public static void main(String[] args) {
        List<String> dates=new ArrayList<>();

        dates.add("22 Oct 2007");
        dates.add("01 Mar 2015");
        dates.add("11 Apr 1996");
        dates.add("11 Jan 1996");
        Map<String,String> map=new HashMap<>();
        map.put("Jan","1");
        map.put("Feb","2");
        map.put("Mar","3");
        map.put("Apr","4");
        map.put("May","5");
        map.put("Jun","6");
        map.put("Jul","7");
        map.put("Aug", "8");
        map.put("Sep","9");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");

        Collections.sort(dates, (a, b) -> {
            String str1 = a.substring(7, 11);
            String str2 = b.substring(7, 11);
            if (str1.compareTo(str2) != 0) {
                if (str1.compareTo(str2) < 0)
                    return str1.compareTo(str2);
                return 0;
            }

            String montha = map.get(a.substring(3, 6));
            String monthb = map.get(b.substring(3, 6));
            if (montha.compareTo(monthb) != 0) {
                if (montha.compareTo(monthb) < 0)
                    return montha.compareTo(monthb);
                return 0;
            }


            String day_a = a.substring(0, 2);
            String day_b = b.substring(0, 2);
            if (day_a.compareTo(day_b) < 0)
                return day_a.compareTo(day_b);
            return 0;
        });
        System.out.print(dates);


    }

}
