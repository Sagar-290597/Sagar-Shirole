package oops;

public class CountObject {
    private static int count;
    public CountObject(){
        count++;
    }
    public static void main(String[] args) {
        CountObject object1 = new CountObject();
        CountObject object2 = new CountObject();
        CountObject object3 = new CountObject();
        CountObject object4 = new CountObject();
        CountObject object5 = new CountObject();

        System.out.print("Total Number of Objects: " + CountObject.count);
    }
}