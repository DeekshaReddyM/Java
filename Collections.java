import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

public static void main(String[] args) {
// TODO Auto-generated method stub
Map<String,Doctor> docMap = new HashMap<String,Doctor>();

Doctor d1 = new Doctor("22","RK","","","",44);
Doctor d2 = new Doctor("20","RK1","","","",42);
Doctor d3 = new Doctor("10","RK2","","","",40);

docMap.put(d1.getDid(), d1);
docMap.put(d2.getDid(), d2);
docMap.put(d3.getDid(), d3);

for(String key:docMap.keySet()) {

Doctor td= docMap.get(key);
System.out.println("Id:"+td.getDid());
System.out.println("Name:"+td.getDname());

}
}

}
