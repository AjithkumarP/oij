public class xyz {

    public static void main(String[] args) {
        
        Book p = new Book1().setid(1).getbook();
        Book p1 = new Book1().setid(2).setName("hi").setAuthor("kg").getbook();
        Book p3=new Book1().setName("Ajith").getbook();
        System.out.println(p);
        System.out.println(p1);
        Syatem.out.println(p3);
    }

}