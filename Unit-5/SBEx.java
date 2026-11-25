class SBEx
{
    public static void main(String args[])
    {
        String s="raghu";
        StringBuffer sb = new StringBuffer("Raghu");
        System.out.println(sb.length());
        sb.append("java");
        System.out.println(sb.capacity());
        System.out.println("S Buffer"+sb);
        s=s+"Java";
        System.out.println(s.length());
    }
}