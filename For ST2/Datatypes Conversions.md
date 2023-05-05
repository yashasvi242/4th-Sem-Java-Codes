#### String to character array
```java
public class StringToCharArrayExample{  
   public static void main(String args[]){  
      String s1="hello";  
      char[] ch=s1.toCharArray();  
   }  
}  
// h, e, l, l, o, 
```

#### Char Array to String 

```java
char[] a = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
String str = new String(a);

//or

String str1 = String.valueOf(a);
```

