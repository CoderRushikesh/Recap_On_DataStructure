public class MyString {
    private final byte[] value;

    // Constructor from String
    public MyString(String str) {
        this.value = str.getBytes(); // UTF-8 encoding by default
    }

    // Constructor from byte array
    public MyString(byte[] bytes) {
        this.value = bytes.clone(); // Defensive copy
    }

    // Returns length of string
    public int length() {
        return value.length;
    }

    // Returns character at index
    public char charAt(int index) {
        if (index < 0 || index >= value.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return (char) value[index];
    }

    // Converts to standard Java String
    public String toString() {
        return new String(value);
    }

    // Returns substring
    public MyString substring(int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex > value.length || beginIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }
        byte[] sub = new byte[endIndex - beginIndex];
        System.arraycopy(value, beginIndex, sub, 0, sub.length);
        return new MyString(sub);
 }

    // Converts to lowercase
    public MyString toLowerCase(){
      String original = this.toString();
      StringBuilder result = new StringBuilder();

      for(int i = 0; i<original.length(); i++){
      char ch = original.charAt(i);

      if(ch >= 'A' && ch <= 'Z'){
        result.append((char) (ch+32));
        // main logic using acci values - diff is A - 65 / a - 97 = 32

      }else{
        result.append(ch);
      }

      }
return new MyString(result.toString());
    }

    // Converts to uppercase
    public MyString toUpperCase() {
        String str = this.toString().toUpperCase();
        return new MyString(str);
    }

    // Checks equality
    public boolean equals(MyString other) {
        return this.toString().equals(other.toString());
    }

    // Concatenates two MyString objects
    public MyString concat(MyString other) {
        byte[] combined = new byte[this.value.length + other.value.length];
        System.arraycopy(this.value, 0, combined, 0, this.value.length);
        System.arraycopy(other.value, 0, combined, this.value.length, other.value.length);
        return new MyString(combined);
    }

  public static void main(String[] args) {
        MyString s1 = new MyString("Hello");
        MyString s2 = new MyString("World");

        System.out.println("Length: " + s1.length());
        System.out.println("Char at 1: " + s1.charAt(1));
        System.out.println("Concat: " + s1.concat(s2).toString());
        System.out.println("Lowercase: " + s1.toLowerCase().toString());
        System.out.println("Substring: " + s1.substring(1, 4).toString());
    }


}
