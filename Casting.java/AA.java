class AA extends A implements B, BB
{
    int a = 3;

    void childMethod()
    {
        System.out.println("childMethod");
    }

    ;

    public void methodB()
    {
        System.out.println("In methodB");
    }

    public void methodBB()
    {
        System.out.println("In methodBB");
    }
}

