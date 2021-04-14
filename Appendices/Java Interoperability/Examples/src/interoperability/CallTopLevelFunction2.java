// interoperability/CallTopLevelFunction2.java
package interoperability;
import static interop.TopLevelFunctionKt.hi;
import static atomictest.AtomicTestKt.eq;

public class CallTopLevelFunction2 {
  public static void main(String[] args) {
    eq(hi(), "Hello!");
  }
}