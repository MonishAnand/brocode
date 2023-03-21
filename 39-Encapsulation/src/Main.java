class car{
    private String model;
    private String name;
    private int year;
    car(String model, String name,int year){
        this.model=model;
        this.name=name;
        this.setYear(year);
    }
    public String getModel(){
        return model;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int setYear(int year){
        return this.year=year;
    }
}
class Main {
    public static void main(String[] args) {
        car c= new car("suv","toyoto",2021);
        c.setYear(2023);
        System.out.println(c.getModel());
        System.out.println(c.getName());
        System.out.println(c.getYear());
    }
}