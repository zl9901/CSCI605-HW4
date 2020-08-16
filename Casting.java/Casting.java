public class Casting
{

    public static void main(String[] args)
    {
        // here we are creating an instance of class A
        A a = new A();

        // why is this the only method we can call?
        /**
         * because a only contains parentMethod ,a can not call the method of AA's
         * without the transformation
         */
        a.parentMethod();

        // why doesn't this work?
        /**
         * because we should use a instead of A to call the variable
         */
        //System.out.println(A.a);

        // here we are creating an instance of class AA
        AA aa = new AA();

        // class AA doesn't define a parentMethod, how can we call one?
        /**
         * if AA does not define the method A which A has defined already
         * we can call the parentMethod as A calls it without changing anything
         */
        aa.parentMethod();
      
        // how could we override this method?
        /**
         * just write that code again in the nextline
         */
        aa.childMethod();

        // Which class does this variable refer to?
        /**
         * AA's class
         */
        System.out.println(aa.a);

        // Which class does this variable refer to?
        /**
         * A's class
         */
        System.out.println(((A) aa).a);

        // What forces us to define these methods in the AA class?
        /**
         * because methodB and methodBB are in the AA, so certainly aa can call
         * these two methods
         */
        aa.methodB();
        aa.methodBB();

        // here we are creating an instance of class AA but what is different about this reference?
        /**
         * a is now pointing to AA
         */
        a = new AA();

        // why do we need to cast this?
        /**
         * A can not call the method which AA contains it but AA does not have it
         */
        ((AA) a).childMethod();
        

        // Which class does this variable refer to?
        /**
         * A's class
         */
        System.out.println(a.a);
   

        // Which class does this variable refer to?
        /**
         *AA's
         */
        System.out.println(((AA)a).a);
       

        // call methodB and methodBB using the variable a
        ((AA) a).methodB();
        ((AA) a).methodBB();


        // how can we access these variables from the interfaces?
        /**
         * like this:
         * B b=new AA();
         * BB bb=new AA();
         */
        B b=new AA();
        BB bb=new AA();
        System.out.println(b.a);
        System.out.println(bb.a);

    }
}