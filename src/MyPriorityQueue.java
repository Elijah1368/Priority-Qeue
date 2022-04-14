public class MyPriorityQueue<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    public MyPriorityQueue(){
        heap = new MyArrayList<>();
    }
    
    public void insert(T item) {
        heap.insert(item, heap.size());
        bubbleUp();
    }

    
    public T removeMin() {
        if (heap.size() < 1) return null;

        int lastIndex = heap.size() - 1;
        T removed = heap.get(0);
        T temp = heap.get(lastIndex);
        heap.remove(lastIndex);
        heap.set(0, temp);
        sinkDown();
        return removed;
    
    }

    public T min(){
        return heap.get(0);
    }

    public int size(){
        return heap.size();
    }

    public Boolean isEmpty(){
        return heap.size() <= 0;
    }

    public String toString() {
        return heap.toString();
    }
    
    private void bubbleUp() {
        int lastIndex = heap.size() - 1;
        int parentIndex = parent(lastIndex);
        int i = heap.size();
        
        while (heap.get(parentIndex).compareTo(heap.get(lastIndex)) >= 0 && i-- > 1) {
            swap(parentIndex, lastIndex);
            lastIndex = parentIndex;
            parentIndex = parent(lastIndex);
            
        };
    }


    private void sinkDown() {
        if (heap.size() <= 1) return;
        int currIndex = 0; 
        T left = heap.get(left(currIndex));
        T right = heap.get(right(currIndex));
        Boolean compare = false;

        while ((left != null || right != null)) {
            int leftComp = 0;
            int rightComp = 0;

            if (left != null && right != null) {
                leftComp = heap.get(currIndex).compareTo(left);
                rightComp = heap.get(currIndex).compareTo(right);
                compare = true;
            } else if (left != null) {
                leftComp = heap.get(currIndex).compareTo(left);
            } else if (right != null) {
                rightComp = heap.get(currIndex).compareTo(right);
            } 
            

            if (leftComp <= 0 && rightComp <= 0) {
                break;
            }

            if (compare) {
                if (left.compareTo(right) >= 0) {
                    leftComp = 0;
                } else {
                    rightComp = 0;
                }
                compare = false;
            }


            int swapIndex = leftComp > rightComp ? left(currIndex) : right(currIndex);
            
            swap(currIndex, swapIndex);

            currIndex = swapIndex;
            left = heap.get(left(currIndex));
            right = heap.get(right(currIndex));
        }
    }
    

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    private void swap(int index1, int index2) {
        T temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    private int PowerOf2(int power)
    {
        return (1<<power);
    }

    public void PrintTreeArray()
    {
  
        int currentLevel = 0;
        int maxPerLevel = PowerOf2(currentLevel);
        for(int i = 0; i < heap.size(); i++)
            {
                if(i == maxPerLevel-1)
                {
                    System.out.println("\n");
                    currentLevel++;
                    maxPerLevel = PowerOf2(currentLevel);
                }
                System.out.print(" "+heap.get(i));
            }

        System.out.println();
    }
}
