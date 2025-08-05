package assignment;





class MemoryDemo {
    // Instance variable (stored in heap)
    int id;

    
    MemoryDemo(int id) {
        this.id = id;
        System.out.println("Object with id " + id + " created.");
    }

    
    protected void finalize() throws Throwable {
        System.out.println("Object with id " + id + " is being garbage collected.");
    }

       void show() {
             int localValue = 100;
        System.out.println("Instance ID: " + id + ", Local value: " + localValue);
    }
}

public class prob3 {
    public static void main(String[] args) {
        // Creating objects dynamically (allocated in heap)
        MemoryDemo obj1 = new MemoryDemo(1);
        MemoryDemo obj2 = new MemoryDemo(2);

        obj1.show();
        obj2.show();

               obj1 = null;
        obj2 = null;

               System.gc();

        // Just to delay the exit to observe GC
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Main method ends.");
    }
}