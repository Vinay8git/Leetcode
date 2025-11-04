class Solution {
   
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        if(month==1) return day;
        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        int number=0;
        
        for(int i=1;i<month;i++)
        {
            if(i == 2)
                number+=leap?29:28;
                
            else if(i == 1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                number+=31;

            else number+=30;

        }
        
        number+=day;

        return number;


    }
}