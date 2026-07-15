public class Age{
    private int years;
    private int months;
    private int days;
    private int age;


    Age(int age){
        this.age = age;
    }


    public void ageInDays(){
        int r = 0;
        years = age/365;
        r = age%365;

        months = r/30;
        r %=30;

        days = r;
    }

    public void print(){
        ageInDays();
        System.out.println(years+" years");
        System.out.println(months+" months");
        System.out.println(this.days +" days");
    }
}