mkdir -p /tmp/test
rm -rf /tmp/test/*
echo '
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, world");
  }
}
' > /tmp/test/Main.java
javac /tmp/test/Main.java

