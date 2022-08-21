import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
public class helloTest
{

    @Test
    void testQueueNotEmptyString()
    {
        Queue<String> stringQue = new Queue<>();
        stringQue.enqueue("I");
        stringQue.enqueue("love");
        stringQue.enqueue("dogs");
        Assertions.assertEquals(false, stringQue.empty());
    }

    @Test
    void testQueueNotEmptyDouble()
    {
        Queue<Double> doubleQue = new Queue<>();
        doubleQue.enqueue(1.2);
        doubleQue.enqueue(2.2);
        doubleQue.enqueue(3.2);
        Assertions.assertEquals(false, doubleQue.empty());
    }


    @Test
    void testQueueEnqueueCountString()
    {
        Queue<String> stringQue = new Queue<>();
        boolean isEnqueueWork = false;

        String iLoveDogs = "I love dogs";
        String resultStr= new String();

        stringQue.enqueue("I");
        resultStr += "I ";
        stringQue.enqueue("love");
        resultStr += "love ";
        stringQue.enqueue("dogs");
        resultStr += "dogs ";

        resultStr = stringQue.dequeue();
        resultStr += " ";
        resultStr += stringQue.dequeue();
        resultStr += " ";
        resultStr += stringQue.dequeue();

        if (resultStr.equals(iLoveDogs))
            isEnqueueWork = true;

        Assertions.assertEquals(true,isEnqueueWork);
    }

    @Test
    void testEnqueueDequeueString()
    {
        Queue<String>  stringQue = new Queue<>();
        stringQue.enqueue("John");
        Assertions.assertEquals("John", stringQue.dequeue());
    }

    @Test
    void testEnqueueDequeueDouble()
    {
        Queue<Double>  doubleQue = new Queue<>();
        doubleQue.enqueue(3.14);
        Assertions.assertEquals(3.14, doubleQue.dequeue());
    }

    @Test
    void testQueueEnqueuePeekString()
    {
        // Put three things in Queue and peek at first value
        Queue<String> stringQue = new Queue<>();
        stringQue.enqueue("hello");
        Assertions.assertEquals("hello",stringQue.peek());
    }

    @Test
    void testQueueEnqueuePeekDouble()
    {
        // Put three things in Queue and peek at first value
        Queue<Double> doubleQue = new Queue<>();
        doubleQue.enqueue(1.23456789);
        Assertions.assertEquals(1.23456789,doubleQue.peek());
    }

    @Test
    void testCopyDouble()
    {
        // Build a Queue
        // Copy it
        // Test the equals on it
        Queue<Double> doubleQue = new Queue<>();
        doubleQue.enqueue(1.23456789);
        doubleQue.enqueue(2.34567890);
        Queue<Double> copyQueue = doubleQue.copy();
        // dequeue the first one and see if it is right
        Assertions.assertEquals(doubleQue.dequeue(), copyQueue.dequeue());
    }

    @Test
    void testCopyInteger()
    {
        // Build a Queue
        // Copy it
        // Test the equals on it
        Queue<Integer> integerQue = new Queue<>();
        integerQue.enqueue(1);
        integerQue.enqueue(2);
        Queue<Integer> copyQueue = integerQue.copy();
        // dequeue the first one and see if it is right
        Assertions.assertEquals(integerQue.dequeue(), copyQueue.dequeue());

    }

    @Test
    void testEqualsInteger()
    {
        // Build a Queue
        // Copy it
        // Test the equals on it
        Queue<Integer> integerQue = new Queue<>();
        integerQue.enqueue(1);
        integerQue.enqueue(2);
        Queue<Integer> copyQueue = integerQue.copy();
        // dequeue the first one and see if it is right
        Assertions.assertEquals(true, integerQue.equals(copyQueue));

    }


    /*
    Queue<String> stringQue2;
    stringQue2 = stringQue.copy();
        System.out.println("These two should print the same thing: ");
        System.out.println("original: (Ilovedogs) " + stringQue);
        System.out.println("copy: (Ilovedogs) " + stringQue2);
        System.out.println("Should be true: " + stringQue.equals(stringQue2));
        System.out.println("Should be true: " + stringQue2.equals(stringQue));

    //Test append method
    Queue<String> stringQue3 = new Queue<>();
        stringQue.enqueue("School");
        stringQue.enqueue("is");
        stringQue.enqueue("cool");
        stringQue3.append(stringQue);
        System.out.println("test append:  " + stringQue3);
        System.out.println(stringQue3.peek());
        stringQue3.dequeue();
        System.out.println(stringQue3.peek());
        stringQue3.dequeue();
        System.out.println(stringQue3.peek());
        stringQue3.dequeue();
        System.out.println(stringQue3.peek());
        stringQue3.dequeue();
        System.out.println(stringQue3.peek());
        stringQue3.dequeue();
        System.out.println(stringQue3.peek());
        stringQue3.dequeue();
        System.out.println("Testing empty method: (true) "
                + stringQue3.empty());

    //testing dequeue and equals methods
        stringQue.dequeue();
        System.out.println("Should be false: " + stringQue.equals(stringQue2));
        System.out.println("Should be false: " + stringQue2.equals(stringQue));
        stringQue.dequeue();
        stringQue.dequeue();
        System.out.println("Testing empty method: (true) "
                + stringQue.empty());
        System.out.println("Should be false: " + stringQue.equals(stringQue2));
        System.out.println("Should be false: " + stringQue2.equals(stringQue));


    //Test queue of Doubles
    Queue<Double> doubleQue = new Queue<>();
        System.out.println("\nA QUEUE OF DOUBLES");
        System.out.println("Testing empty method: (true) "
                + doubleQue.empty());
        System.out.println("Pushing 3 Doubles onto queue...");
        doubleQue.enqueue(1.1);
        doubleQue.enqueue(2.2);
        doubleQue.enqueue(3.3);
        System.out.println("(1.12.23.3) " + doubleQue);  //test toString method

    Queue<Double> doubleQue2;
    doubleQue2 = doubleQue.copy();
        System.out.println("These two should print the same thing: ");
        System.out.println("original: (1.12.23.3) " + doubleQue);
        System.out.println("copy: (1.12.23.3) " + doubleQue2);
        System.out.println("Should be true: " + doubleQue.equals(doubleQue2));
        System.out.println("Should be true: " + doubleQue2.equals(doubleQue));

    //testing append method
    Queue<Double> doubleQue3 = new Queue<>();
    Queue<Double> doubleQue4 = new Queue<>();
        System.out.println("Testing 2 empty queues (true)  "
                + doubleQue3.equals(doubleQue4));

        doubleQue3.enqueue(4.4);
        doubleQue3.enqueue(5.5);
        doubleQue3.enqueue(6.6);
        doubleQue3.append(doubleQue);
        System.out.println("test append:  " + doubleQue3);
        doubleQue3.dequeue();
        doubleQue3.dequeue();
        doubleQue3.dequeue();
        System.out.println("test dequeue:  " + doubleQue3);


    //testing dequeue and equals methods
        doubleQue.dequeue();
        System.out.println("Should be false: " + doubleQue.equals(doubleQue2));
        System.out.println("Should be false: " + doubleQue2.equals(doubleQue));
        doubleQue.dequeue();
        doubleQue.dequeue();
        System.out.println("Testing empty method: (true) "
                + doubleQue.empty());
        System.out.println("Should be false: " + doubleQue.equals(doubleQue2));
        System.out.println("Should be false: " + doubleQue2.equals(doubleQue));

*/
}