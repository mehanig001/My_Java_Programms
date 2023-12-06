public class stringbuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Gautam is king");
        System.out.println(s);
        s.append("!");
        System.out.println(s);
        s.insert(0,"The ");
        System.out.println(s);
        s.delete(0,4);
        System.out.println(s);
        s.deleteCharAt(6);
        System.out.println(s);
        s.insert(6, " ");
        System.out.println(s);
        s.replace(0, 06, "Mehani");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
