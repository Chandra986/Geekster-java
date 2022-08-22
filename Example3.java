class Car {
    int car_number;
    String car_name;
    int car_incorence;
    static  int count=0;
    public Car(int car_incorence ,int car_number){
        this.car_incorence=car_incorence;
        this.car_number=car_number;
        count= count+1;

    }   
}
public class Example3 {
    public static void main(String[] args) {
        Car c1=new Car(123, 1);
        c1.car_name="Bmw";
        Car c2= new Car(127,2);
        Car c3= new Car(127,2);
       
       System.out.println("car incos "+ c1.car_incorence+"car number "+c1.car_number+c1.car_name);

       System.out.println("car incos "+ c2.car_incorence+"car number "+c2.car_number);
       System.out.println(c2.count);

    }


}
