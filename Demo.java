
class THIS {
  static int money = 0; // doesnt depend on object i.e the value will be same for each object
  int num = 0; // by default value for each object
  String p;

  public THIS(int num) {
    this.num = num;
    this.p = "hirak";
    System.out.println(this.num);
    money++; // increment money each time an object is created
  }

  THIS() {

  }

  THIS(THIS copy) {
    this.p = copy.p;
  }

  void print() {
    System.out.println(this.p);
    System.out.println(this.num);
  }

  void print(String name) {
    System.out.println(name);
  }

}

public class Demo {
  public static void main(String[] args) {
    THIS ob = new THIS(1);
    System.out.println(THIS.money);
    System.out.println(ob.money); // not recommended to use object
    System.out.println(ob.p);
    THIS hi = new THIS();
    System.out.println(hi.p);
    THIS ob1 = new THIS(ob);
    ob1.print();
    ob1.print("Hirak Jyot Das");
  }
}
