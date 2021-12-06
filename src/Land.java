public class Land {
    public static void main(String []args)
    {
        Village zhao=new Village("赵庄",80);
        Village mjhz=new Village("马家河子",120);
        System.out.println(zhao.getName());
        System.out.println(zhao.getPeopleNumber());
       System.out.println(mjhz.getName());
        System.out.println(mjhz.getPeopleNumber());
        zhao.setWateramount(200);
mjhz.setWateramount(200);
        zhao.drinkWater(66);
        mjhz.drinkWater(44);
    }
}