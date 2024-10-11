/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memoryleakexample;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    private List<String> cache = new ArrayList<>();

    public void addData() {
        for (int i = 0; i < 10000; i++) {
            cache.add(new String("Leak" + i));  // Creates new String instances, not interned
        }
    }

    public static void main(String[] args) {
        MemoryLeakExample example = new MemoryLeakExample();
        while (true) {
            example.addData();  // Continuously adds data to the cache without cleanup
        }
        //cache.clear() should be called periodically to avoid memory leak
    }
}
