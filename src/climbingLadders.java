class climbingLadders {
    private static int countJumps(int jumps)
    {
        if(jumps==0)
            return 0;
        if(jumps==1)
            return 1;
        if(jumps==2)
            return 2;
        return countJumps(jumps-2)+countJumps(jumps-1);
    }
    public static void main(String[] args)
    {
        int val=3;
        System.out.println(countJumps(val));
    }
}
