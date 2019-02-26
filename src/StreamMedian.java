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

    // delcaring our priority queues, 'bigger' and 'smaller'.
    PriorityQueue<Integer> bigger = new PriorityQueue<>();
    PriorityQueue<Integer> smaller = new PriorityQueue<>();

    public StreamMedian(){
        double max = 0;
        double min = 0;
        double median = 0;
    }

    // insert an item into a queue.
    public void insert(Integer i){}

    public double getMedian(){
        double m = 0;

        if (this.bigger.size() == this.smaller.size()) {
            //m = this.smaller.

            return m;
        }

        return m;
    }
}

//public class compareQueue implements Comparator<StreamMedian> {
//    public
//}
