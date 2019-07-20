import org.junit.Test;

public class Jie {
  public static class A {
      int i =0;
      private A(int i){ this.i = i;}
      private A(){}
     public int getI() {return i;}
  }

 public static  class B extends A{
     public B(){
         super(12);
     }
  }

  @Test
  public void t(){
     B b = new B();
     System.out.println(b.getI());
  }
}
