class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceArrDate=conDayofYear(arriveAlice);
        int aliceLeave=conDayofYear(leaveAlice);
        int bobArrDate=conDayofYear(arriveBob);
        int bobLeave=conDayofYear(leaveBob);
        int stOvrLap=Math.max(aliceArrDate,bobArrDate);
        int endOvrLap=Math.min(aliceLeave,bobLeave);
        return Math.max(0,endOvrLap-stOvrLap+1);
    }
    private int conDayofYear(String date){
        int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));
        int dayofYear=day;
        for(int i=0;i<month-1;i++){
            dayofYear+=daysInMonth[i];
        }
        return dayofYear;
    }
}