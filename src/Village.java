public class Village{
    static int wateramount;
    private String name;
    private int peopleNumber;
    Village(String name,int number)
    {
        this.name=name;
        this.peopleNumber=number;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setPeopleNumber(int peopleNumber)
    {
        this.peopleNumber = peopleNumber;
    }
    public int getPeopleNumber()
    {
        return this.peopleNumber;
    }
    public void setWateramount(int Water)
    {
        wateramount=Water;
    }
    public int getWaterAmouunt()
    {
        return wateramount;
    }
    public void drinkWater(int drinkamount)
    {
        wateramount=wateramount-drinkamount;
        System.out.println(this.name+"村当前使用了"+drinkamount+"量的井水，井中还剩余"+wateramount+"量井水\n");
    }
}
