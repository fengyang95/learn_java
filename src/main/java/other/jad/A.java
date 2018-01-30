package other.jad;

enum A {
    JAN(31), FEB(28) {
        public int getDays(int year) {
            return (year%400==0 || (year%4==0 && year%100!=0 ))?29:28;
        }
    }, MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);
    A(int d) { days = d; }
    private int days;
    public int getDays(int year) { return days; }
    public static void main(String[] args)  {
        int sum = 0;
        for ( A  e : A.values()) {
            sum+=e.getDays(2018);
        }
        System.out.println(sum);
    }
}