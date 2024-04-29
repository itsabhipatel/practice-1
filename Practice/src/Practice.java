import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;
//
//class Car implements Cloneable
//{
//    int a;
//    int b;
//    List<Integer> list = new ArrayList<>();
//
//public void setA(int a) {
//    this.a = a;
//}
//
//public int getA() {
//    return a;
//}
//
//public void setB(int b) {
//    try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//    this.b = b;
//}
//
//public int getB() {
//    return b;
//}
//
//
//public List<Integer> getList() {
//	return list;
//}
//
//public void setList(List list) {
//	this.list = list;
//}
//
//
//@Override
//public String toString() {
//	return "Car [a=" + a + ", b=" + b + ", list=" + list + "]";
//}
//
//@Override
//protected Object clone() throws CloneNotSupportedException {
//	
//	Car ferrari = new Car();
//	ferrari.setA(this.a);
//	ferrari.setB(this.b);
//	List <Integer> l = new ArrayList<>();
//	for(Integer a: this.list)
//	{
//	l.add(a);
//	}
//	ferrari.setList(l);
//	return ferrari;
//}
//
//public void removeItem()
//{
//	this.list.remove(0);
//}
//
//
//}
//
//


class Observer
{
	String name;

	public Observer(String name) {
		super();
		this.name = name;
	}
	
	public void subscribe(Youtube y)
	{
		System.out.println(this.name + "subscribed" + y.title +"channel");
		y.listSub.add(this);
	}
	
	public void unsubscribe(Youtube y)
	{
		System.out.println(this.name + "unsubscribed" + y.title +"channel");
		y.listSub.remove(this);
	}
	
	public void notify(String title, String name)
	{
		System.out.println(this.name+"has subscribed video:"+name+"of yoytube channel"+title);
	}

	
}

class Youtube
{
	String title;
    List<String> listVideo = new ArrayList<>();
    List<Observer> listSub = new ArrayList<>();

	public Youtube(String title) {
		super();
		this.title = title;
	}
	
	public void upload(String name)
	{
		listVideo.add(name);
		for(Observer obs:listSub)
		{
			obs.notify(title,name);
		}
	}
	
}
public class Practice {
    public static void main(String[] args) {
    	
//    	Youtube y = new Youtube("anime");
//    	Observer obs1 = new Observer("ramesh");
//    	Observer obs2 = new Observer("rakesh");
//    	obs1.subscribe(y);
//    	obs2.subscribe(y);
//    	y.upload("attackontitans");
//    	
//    	System.out.println("Hello");
//    	
//        Car abc = new Car();
//        abc.setA(4);
//        abc.setB(5);
//        List list = new ArrayList<>();
//    	list.add(10);
//    	list.add(20);
//    	list.add(30);
//        abc.setList(list);
//        System.out.println(abc);
//        
//        Car abc2 = (Car) abc.clone();
//        abc.removeItem();
//        
//        System.out.println(abc);
//        System.out.println(abc2);
    	
    	AppleCharger appleCharger = new AppleChargerImpl();
    	SamsungCharger samsungCharger = new SamsungChargerImpl();
    	ApplePhone applePhone = new ApplePhone(appleCharger);
    	SamsungPhone samsungPhone = new SamsungPhone(samsungCharger);
    	applePhone.chargeApple();
    	samsungPhone.chargerSamsung();
    	
    	
    	
    	
    	Adapter adapter = new Adapter(samsungCharger);
    	adapter.chargeApple();
    	
    	
    }
}
