
        public class Main{
            public static void main(String[] args){
                for (int i = 1; i <=100; i++){
                    if (i%3 == 0)
                        System.out.println(i % 5 == 0? "Foobaa" : "Foo");
                    if (i%5 == 0)
                         System.out.println("baa");
                    else
                        System.out.println(i);
                }
            }
        }
