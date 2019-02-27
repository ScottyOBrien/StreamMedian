/**
 * Author: Scott O'Brien
 * Due Date: 2/28/2019
 * Assignment: StreamMedian.java
 *
 * Description: This java program implements a max and min heap using priority queues and takes in a stream of data,
 * there are 2 required methods in this program: getMedian() and insert(). This program calculates min, max, and median.
 *
 */

import java.util.*;
public class StreamMedian {

   private int count = 0;
    // Creating our priority queues, 'bigger'(min heap) and 'smaller'(max heap).
   private PriorityQueue<Integer> bigger = new PriorityQueue<>();
   private PriorityQueue<Integer> smaller = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 < o2) return +1;
            if (o1.equals(o2)) return 0;
            return -1;
        }
    });

    public StreamMedian(){
//        double max = 0;
//        double min = 0;
//        double median = 0;
    }

    // insert an item into a queue.
    public void insert(Integer i) {

        if(count % 2 == 0) {
            this.smaller.add(i);
        }
        else {
            this.bigger.add(i);
        }
        sortQueues();
        count++;
    }

    public double getMedian() {
        double m;

        if (this.bigger.size() + this.smaller.size() % 2 == 0) {
            m = this.smaller.peek() + this.bigger.peek() / 2;
        } else {
            m = this.smaller.peek();
        }
        return m;
    }

    //this method helps us make sure that our smaller(lower values) and bigger(higher values) queues have what they are supposed to.
    private void sortQueues() {
        Integer smallValue;
        Integer bigValue;
        if (this.smaller.peek() > this.bigger.peek()) {
            smallValue = this.smaller.poll();
            bigValue = this.bigger.poll();

            this.bigger.add(smallValue);
            this.smaller.add(bigValue);
        }
    }
}
