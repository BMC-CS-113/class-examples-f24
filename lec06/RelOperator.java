// Adam Poliak
// 09/24/24
// Playing with relation operations, be careful with strings

class RelOperator {

  public static void main(String[] args) { 
    System.out.println(6>5); // t
    System.out.println(6<5); // f

   System.out.println(6>=5); //t
  // be careful, this wont always work!
  System.out.println("hello" == "hello");// True
  System.out.println("hello" != "hello");// True
  //System.out.println("give me a string");
  String s1 = System.console().readLine();
  String s2 = System.console().readLine();
  System.out.println(s1);
  System.out.println(s2);

  System.out.println(s1 == s2); 

  //use compareTo to check if two strings are the same:
  if (s1.compareTo(s2) == 0) {
    System.out.printf("%s and %s are the same\n", s1, s2);
  }
  else {
    System.out.printf("%s and %s DO NOT match\n", s1, s2);
  }
  
   System.out.println("a".compareTo("h"));
   System.out.println("apple".compareTo("ahple"));
   System.out.println("abc".compareTo("ab"));

  //System.out.println("hello" >= "hellz"); //3 true, 5 fale, 1 uncomitted ; a few asleep
  }

}
