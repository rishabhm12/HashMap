# HashMap
Implementation of HashMap in Java

1) Implemented the HashMap<K,V> class here. <br>

2) Here, the class is Hash<K,V> which takes in the (key,value) pair and is kept generic. I have used the <b>Open separate chaining</b> method to implement the Hash<K,V> class.<br>

3) Methods implemented here are:<br>
   a) put(K key, V value)<br>
   b) get(K key)<br>
   c) removeKey(K key)<br>
   d) size()<br>
   e) reHash()<br>
   f) loadFactor() <br>
  
 4) The loadFactor threshold is set to 0.7. If loadFactor exceeds 0.7, reHash() function is called to rehash the keys.
 
   
   
