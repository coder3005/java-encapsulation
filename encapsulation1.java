/* java encapsulation */
class A
{
    private int value; //data hiding

    public void setValue(int x) //data abstraction
    {
        value=x; //value=100
    }

    public int getValue()
    {
        return ++value; /*output will be 101*/
    }
}
class B
{
    public static void main(String[]args) {
        
        A r=new A();
        r.setValue(100);
        System.out.print(r.getValue());
    }
}
