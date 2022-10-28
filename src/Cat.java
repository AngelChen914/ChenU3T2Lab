public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age
    public int getAge(){
        return age;
    }



    // MODIFY this method so that the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak() {
        String msg1 = "Stop looking at me! MEOWWRR";
        String msg2 = "HALLOOOO";
        String msg3 = "How are you?";
        if((Math.round(Math.random() *3) == 1)){
            return msg1;
        }else if((Math.round(Math.random() *3) == 2)){
            return msg2;
        }else{
            return msg3;
        }
    }

    public void introduce() {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}