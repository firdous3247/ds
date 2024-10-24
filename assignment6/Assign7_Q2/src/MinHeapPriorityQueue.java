import java.util.ArrayList;

class MinHeapPriorityQueue {

    private ArrayList<Integer> heap;

    public MinHeapPriorityQueue() {
        heap = new ArrayList<>();
    }


    private int getParent(int i) {
        return (i - 1) / 2;
    }

   
    private int getLeftChild(int i) {
        return 2 * i + 1;
    }

   
    private int getRightChild(int i) {
        return 2 * i + 2;
    }


    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }


    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(current) < heap.get(getParent(current))) {
            swap(current, getParent(current));
            current = getParent(current); // Move up the tree
        }
    }

    public int extractMin() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Priority Queue is empty");
        }

        int min = heap.get(0); 

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        minHeapify(0);

        return min;
    }

    private void minHeapify(int i) {
        int left = getLeftChild(i);
        int right = getRightChild(i);
        int smallest = i;

 
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }


        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest); 
        }
    }

    public int peek() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        MinHeapPriorityQueue pq = new MinHeapPriorityQueue();

        pq.insert(10);
        pq.insert(20);
        pq.insert(5);
        pq.insert(30);
        pq.insert(15);

        System.out.println("Min heap after insertion:");
        pq.printHeap();

        System.out.println("Extracting min: " + pq.extractMin());
        System.out.println("Heap after extraction:");
        pq.printHeap();

        System.out.println("Minimum element: " + pq.peek());
    }
}
