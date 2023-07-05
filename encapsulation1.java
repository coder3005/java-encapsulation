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
    pubic static void manin(String[]args) {
        
        Ar=new A();
        r.setValue(100)5;
        System.out.print(r.getValue());
    }
}
